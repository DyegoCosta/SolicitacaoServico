package Domain.Repository;

import Domain.Models.Apontamento;
import java.util.List;

public interface IApontamentoRepository extends IBaseRepository<Apontamento> {
    public List<Apontamento> obterPorOrdemServico(int ordemServicoId);
}
