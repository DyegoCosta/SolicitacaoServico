package Infrastructure.Repository;

import Domain.Models.Apontamento;
import Domain.Repository.IApontamentoRepository;
import org.hibernate.Session;

public class ApontamentoRepository extends BaseRepository<Apontamento> implements IApontamentoRepository {
    
    public ApontamentoRepository(Session session){
         super(session);
    }
}
