
import Domain.Data.DatabaseFactory;
import Domain.Data.IDatabaseFactory;
import Domain.Repository.IApontamentoRepository;
import Domain.Models.Apontamento;
import Infrastructure.Repository.ApontamentoRepository;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConexaoTeste {

    private IDatabaseFactory databaseFactory;

    public ConexaoTeste() {
    }

    @Before
    public void setUp() {

        databaseFactory = new DatabaseFactory("Infrastructure/Configuration/hibernate.cfg.xml");
    }

    @Test
    public void hello() {
        // Arrange
        IApontamentoRepository apontamentoRepository = new ApontamentoRepository(databaseFactory);
        int id = 2;

        // Act
        Apontamento apontamento = apontamentoRepository.obterPorId(id);

        // Assert
        assertNotNull(apontamento);
    }
}
