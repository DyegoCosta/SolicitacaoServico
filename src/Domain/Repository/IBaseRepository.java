package Domain.Repository;

import java.util.List;

public interface IBaseRepository<TEntity> {
    TEntity obterPorId(int id);
    
    List<TEntity> obterTodos();
    
    TEntity salvar(TEntity entidade);
    
    void deletar(TEntity entidade);
}