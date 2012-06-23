package Infrastructure.Repository;

import Domain.Data.IDatabaseFactory;
import Domain.Models.Apontamento;
import Domain.Repository.IApontamentoRepository;
import java.util.List;

public class ApontamentoRepository extends BaseRepository<Apontamento> implements IApontamentoRepository {
    
    public ApontamentoRepository(IDatabaseFactory databaseFactory){
         super(databaseFactory);
    }

    @Override
    public List<Apontamento> obterPorOrdemServico(int ordemServicoId) {    
        return session.createQuery("from Apontamento where OrdemServicoId = :ordemServicoId").setString("ordemServicoId", String.valueOf(ordemServicoId)).list();
    }
}
