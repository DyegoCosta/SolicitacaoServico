package Domain.Data;

public interface IUnitOfWork {

    void beginTransaction();

    void commit();

    void rollback();
}
