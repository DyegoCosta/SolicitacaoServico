package Infrastructure.Repository;

import Domain.Data.IDatabaseFactory;
import Domain.Models.Cliente;
import Domain.Repository.IClienteRepository;

public class ClienteRepository extends BaseRepository<Cliente> implements IClienteRepository {
    
    public ClienteRepository(IDatabaseFactory databaseFactory){
         super(databaseFactory);
    }
}
