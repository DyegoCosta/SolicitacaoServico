package Domain.Repository;

import Domain.Models.Cliente;
import java.util.List;

public interface IClienteRepository extends IBaseRepository<Cliente> {
    
    List<Cliente> listarPorCriterio(String texto);
}
