package Infrastructure.Repository;

import Domain.Data.IDatabaseFactory;
import Domain.Models.OrdemServico;
import Domain.Repository.IOrdemServicoRepository;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class OrdemServicoRepository extends BaseRepository<OrdemServico> implements IOrdemServicoRepository {
    
    public OrdemServicoRepository(IDatabaseFactory databaseFactory){
         super(databaseFactory);
    }

    @Override
    public List<OrdemServico> listarPorCriterio(String texto) {
        texto = adicionarSinalPorcentagem(texto);
        Criteria criterio = session.createCriteria(OrdemServico.class) //TODO: melhorar para pesquisar nos relacionamentos.
                                   .add(Restrictions.disjunction()
                                                    .add(Restrictions.ilike("objetivo", texto)));
        return criterio.list();
    }
}
