package Infrastructure.Repository;

import Domain.Repository.IBaseRepository;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.*;

public abstract class BaseRepository<TEntity> 
        implements IBaseRepository<TEntity> {

    protected Session session;
    private Class<TEntity> classePersistente;

    public BaseRepository(Session session) {
        this.classePersistente = (Class<TEntity>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.session = session;
    }

    @Override
    public TEntity obterPorId(int id) {
        return (TEntity) session.get(classePersistente, id);
    }

    @Override
    public List<TEntity> obterTodos() {
        return session.createQuery(obterConsultaTodos()).list();
    }

    @Override
    public TEntity salvar(TEntity entidade) {
        session.saveOrUpdate(entidade);
        
        return entidade;
    }

    @Override
    public void deletar(TEntity entidade) {
        session.delete(entidade);
    }
    
    private String obterNomeTabela(){
        return String.format("%ss", classePersistente.getSimpleName());
    }
    
    private String obterConsultaTodos(){
        return String.format("from %s", obterNomeTabela());
    }
}