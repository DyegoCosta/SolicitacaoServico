package Domain.Repository;

import Domain.Models.OrdemServico;
import java.util.List;

public interface IOrdemServicoRepository extends IBaseRepository<OrdemServico> {

    List<OrdemServico> listarPorCriterio(String texto);
}
