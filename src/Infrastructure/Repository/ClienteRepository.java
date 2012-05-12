package Infrastructure.Repository;

import Domain.Models.Cliente;
import Domain.Repository.IClienteRepository;
import org.hibernate.Session;

public class ClienteRepository extends BaseRepository<Cliente> implements IClienteRepository {
    
    public ClienteRepository(Session session){
         super(session);
    }
}
