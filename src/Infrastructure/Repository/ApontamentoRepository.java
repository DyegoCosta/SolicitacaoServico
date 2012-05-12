package Infrastructure.Repository;

import Domain.Data.IDatabaseFactory;
import Domain.Models.Apontamento;
import Domain.Repository.IApontamentoRepository;

public class ApontamentoRepository extends BaseRepository<Apontamento> implements IApontamentoRepository {
    
    public ApontamentoRepository(IDatabaseFactory databaseFactory){
         super(databaseFactory);
    }
}
