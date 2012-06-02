package Infrastructure.Repository;

import Domain.Data.IDatabaseFactory;
import Domain.Models.Usuario;
import Domain.Repository.IUsuarioRepository;
import java.util.List;
import javax.crypto.Cipher;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class UsuarioRepository extends BaseRepository<Usuario> implements IUsuarioRepository {
    
    public UsuarioRepository(IDatabaseFactory databaseFactory){
         super(databaseFactory);
    }

    @Override
    public Usuario obterUsuarioPorCredenciais(String login, String senha) {
        
        return (Usuario)session.createQuery("from Usuarios where Login = :login and Senha = :senha")
                               .setString("login", login)
                               .setString("senha", senha)
                               .uniqueResult();
    }

    @Override
    public List<Usuario> listarPorCriterio(String texto) {
        
        texto = adicionarSinalPorcentagem(texto);
        Criteria criterio = session.createCriteria(Usuario.class)
                                   .add(Restrictions.disjunction()
                                                    .add(Restrictions.ilike("login", texto))
                                                    .add(Restrictions.ilike("nome", texto))
                                                    .add(Restrictions.ilike("sobrenome", texto))
                                                    .add(Restrictions.ilike("cpf", texto)))
                                                    .add(Restrictions.ilike("usuarioId", texto));
        return criterio.list();
    }
}
