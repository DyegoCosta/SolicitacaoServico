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
        currentTransaction.commit();
    }

    @Override
    public void rollback() {
        currentTransaction.rollback();
    }

    private void begginTransaction() {
        currentTransaction = databaseFactory.getSession().beginTransaction();
    }
}
