package Infrastructure.Repository;

import Domain.Models.OrdemServico;
import Domain.Repository.IOrdemServicoRepository;
import org.hibernate.Session;

public class OrdemServicoRepository extends BaseRepository<OrdemServico> implements IOrdemServicoRepository {
    
    public OrdemServicoRepository(Session session){
         super(session);
    }
}
