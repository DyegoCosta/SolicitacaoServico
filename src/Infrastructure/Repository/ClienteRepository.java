package Infrastructure.Repository;

import Domain.Data.IDatabaseFactory;
import Domain.Models.Cliente;
import Domain.Repository.IClienteRepository;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class ClienteRepository extends BaseRepository<Cliente> implements IClienteRepository {
    
    public ClienteRepository(IDatabaseFactory databaseFactory){
         super(databaseFactory);
    }

    @Override
    public List<Cliente> listarPorCriterio(String texto) {
        
        texto = adicionarSinalPorcentagem(texto);
        Criteria criterio = session.createCriteria(Cliente.class)
                                   .add(Restrictions.disjunction()
                                                    .add(Restrictions.ilike("razaoSocial", texto))
                                                    .add(Restrictions.ilike("CNPJ", texto))
                                                    .add(Restrictions.ilike("nomeResponsavel", texto))
                                                    .add(Restrictions.ilike("telefone", texto))
                                                    .add(Restrictions.ilike("endereco", texto))
                                                    .add(Restrictions.ilike("email", texto)));
        return criterio.list();
    }
}
