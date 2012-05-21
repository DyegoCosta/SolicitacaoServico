package Domain.Data;

import org.hibernate.Transaction;

public class UnitOfWork implements IUnitOfWork {

    private IDatabaseFactory databaseFactory;
    private Transaction currentTransaction;

    public UnitOfWork(IDatabaseFactory databaseFactory) {
        this.databaseFactory = databaseFactory;
        begginTransaction(); //opens a trasaction right away.
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

    private void begginTransaction() {
        currentTransaction = databaseFactory.getSession().beginTransaction();
    }
}
