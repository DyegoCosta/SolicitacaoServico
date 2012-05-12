package Infrastructure.Repository;

import Domain.Data.IDatabaseFactory;
import Domain.Models.OrdemServico;
import Domain.Repository.IOrdemServicoRepository;

public class OrdemServicoRepository extends BaseRepository<OrdemServico> implements IOrdemServicoRepository {
    
    public OrdemServicoRepository(IDatabaseFactory databaseFactory){
         super(databaseFactory);
    }
}
