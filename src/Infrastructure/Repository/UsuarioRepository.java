package Infrastructure.Repository;

import Domain.Models.Usuario;
import Domain.Repository.IUsuarioRepository;
import org.hibernate.Session;

public class UsuarioRepository extends BaseRepository<Usuario> implements IUsuarioRepository {
    
    public UsuarioRepository(Session session){
         super(session);
    }

    @Override
    public Usuario obterUsuarioPorCredenciais(String login, String senha) {
        
        return (Usuario)session.createQuery("from Usuarios where Login = :login and Senha = :senha")
                               .setString("login", login)
                               .setString("senha", senha)
                               .uniqueResult();
    }
}
