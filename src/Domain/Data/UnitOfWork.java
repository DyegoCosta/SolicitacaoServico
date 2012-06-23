package Domain.Data;

import org.hibernate.Transaction;

public class UnitOfWork implements IUnitOfWork {

    private IDatabaseFactory databaseFactory;
    private Transaction currentTransaction;

    public UnitOfWork(IDatabaseFactory databaseFactory) {
        this.databaseFactory = databaseFactory;
    }

    @Override
    public void commit() {
        if (currentTransaction != null)
            currentTransaction.commit();
    }

    @Override
    public void rollback() {
        if (currentTransaction != null)
            currentTransaction.rollback();
    }

    @Override
    public void beginTransaction() {
        currentTransaction = databaseFactory.getSession().beginTransaction();
    }
}
