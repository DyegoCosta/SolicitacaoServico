package Infrastructure.Repository;

import Domain.Models.Apontamento;
import org.hibernate.Session;

public class ApontamentoRepository extends BaseRepository<Apontamento> {
    
    public ApontamentoRepository(Session session){
         super(session);
    }
}
