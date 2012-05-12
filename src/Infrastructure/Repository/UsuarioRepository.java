package Infrastructure.Repository;

import Domain.Data.IDatabaseFactory;
import Domain.Models.Usuario;
import Domain.Repository.IUsuarioRepository;

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
}
