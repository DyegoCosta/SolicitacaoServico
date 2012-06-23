package Domain.Repository;

import Domain.Models.Usuario;
import java.util.List;

public interface IUsuarioRepository extends IBaseRepository<Usuario> {

    Usuario obterUsuarioPorCredenciais(String login, String senha);

    List<Usuario> listarPorCriterio(String texto);
}
