package Infrastructure.Repository;

import Domain.Models.Cliente;
import org.hibernate.Session;

public class ClienteRepository extends BaseRepository<Cliente> {
    
    public ClienteRepository(Session session){
         super(session);
    }
}
