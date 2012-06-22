package Domain.Repository;

import Domain.Application.ValidacaoException;
import Domain.Data.IDatabaseFactory;
import java.util.List;

public interface IBaseRepository<TEntity> {
    TEntity obterPorId(int id);
    
    List<TEntity> obterTodos();
    
    TEntity salvar(TEntity entidade);
    
    void deletar(TEntity entidade) throws ValidacaoException;
    
    IDatabaseFactory getDatabaseFactory();
}