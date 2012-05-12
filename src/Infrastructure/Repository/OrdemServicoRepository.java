package Infrastructure.Repository;

import Domain.Models.OrdemServico;
import org.hibernate.Session;

public class OrdemServicoRepository extends BaseRepository<OrdemServico> {
    
    public OrdemServicoRepository(Session session){
         super(session);
    }
}
