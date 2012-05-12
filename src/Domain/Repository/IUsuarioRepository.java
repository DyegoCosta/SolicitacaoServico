package Domain.Repository;

import Domain.Models.Usuario;

public interface IUsuarioRepository extends IBaseRepository<Usuario> {
    
    Usuario obterUsuarioPorCredenciais(String login, String senha);
}
