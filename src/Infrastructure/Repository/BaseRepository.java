package Infrastructure.Repository;

import Domain.Application.ValidacaoException;
import Domain.Data.IDatabaseFactory;
import Domain.Repository.IBaseRepository;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.*;

public abstract class BaseRepository<TEntity> 
        implements IBaseRepository<TEntity> {

    protected Session session;
    private Class<TEntity> classePersistente;
    private IDatabaseFactory databaseFactory;

    public BaseRepository(IDatabaseFactory databaseFactory) {
        this.classePersistente = (Class<TEntity>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.databaseFactory = databaseFactory;
        this.session = databaseFactory.getSession();
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
        if (entidade == null)
            throw new IllegalArgumentException("'entidade' não pode ser nula");
        
        session.saveOrUpdate(entidade);
        
        return entidade;
    }

    @Override
    public void deletar(TEntity entidade) throws ValidacaoException {
        if (entidade == null)
            throw new IllegalArgumentException("'entidade' não pode ser nula");
        
        session.delete(entidade);
    }

    @Override
    public IDatabaseFactory getDatabaseFactory() {
        return  this.databaseFactory;
    }
    
    protected String adicionarSinalPorcentagem(String texto){
        return String.format("%%%s%%", texto);
    }
    
    private String obterNomeTabela(){
        return classePersistente.getSimpleName();
    }
    
    private String obterConsultaTodos(){
        return String.format("from %s", obterNomeTabela());
    }
}