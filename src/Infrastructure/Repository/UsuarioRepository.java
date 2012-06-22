package Infrastructure.Repository;

import Domain.Application.IAuthentication;
import Domain.Data.IDatabaseFactory;
import Domain.Models.Usuario;
import Domain.Repository.IUsuarioRepository;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class UsuarioRepository extends BaseRepository<Usuario> implements IUsuarioRepository {

    private IAuthentication authentication;
    
    public UsuarioRepository(IDatabaseFactory databaseFactory) {
        super(databaseFactory);
    }
    
    public UsuarioRepository(IDatabaseFactory databaseFactory, IAuthentication authentication) {
        super(databaseFactory);
        this.authentication = authentication;
    }

    @Override
    public Usuario obterUsuarioPorCredenciais(String login, String senha) {

        return (Usuario) session.createQuery("from Usuario where Login = :login and Senha = :senha").setString("login", login).setString("senha", senha).uniqueResult();
    }

    @Override
    public List<Usuario> listarPorCriterio(String texto) {

        texto = adicionarSinalPorcentagem(texto);
        Criteria criterio = session.createCriteria(Usuario.class)
                                   .add(Restrictions.disjunction()
                                                    .add(Restrictions.ilike("login", texto))
                                                    .add(Restrictions.ilike("nome", texto))
                                                    .add(Restrictions.ilike("sobrenome", texto))
                                                    .add(Restrictions.ilike("cpf", texto)));
        return criterio.list();
    }

    @Override
    public Usuario salvar(Usuario entidade) {

        if (entidade == null)
            throw new IllegalArgumentException("'usuario' não pode ser nulo");

        for (Usuario usuario : obterTodos()) {
            if (usuario.getUsuarioId() == entidade.getUsuarioId())
                continue;

            if (usuario.getLogin().equals(entidade.getLogin()))
                throw new RuntimeException(String.format("O Login '%s' já está em uso", usuario.getLogin()));
        }

        return super.salvar(entidade);
    }

    @Override
    public void deletar(Usuario entidade) {
        
        if (entidade == null)
            throw new IllegalArgumentException("'usuario' não pode ser nulo");
        
        if (seUsuarioForUsuarioAutenticado(entidade))
            throw new RuntimeException("Não é possível excluir o próprio usuário autenticado");
        
        super.deletar(entidade);
    }
    
    private boolean seUsuarioForUsuarioAutenticado(Usuario usuario){
        
        return usuario.getUsuarioId() == authentication.obterUsuarioAutenticado().getUsuarioId();
    }
}
