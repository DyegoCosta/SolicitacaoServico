package Domain.Data;

public interface IUnitOfWork {
    
    void commit();
    void rollback();
    
}
