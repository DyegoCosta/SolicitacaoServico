
import Domain.Data.DatabaseFactory;
import Domain.Data.IDatabaseFactory;
import Domain.Repository.IApontamentoRepository;
import Domain.Models.Apontamento;
import Domain.Models.Cliente;
import Domain.Repository.IClienteRepository;
import Infrastructure.Repository.ApontamentoRepository;
import Infrastructure.Repository.ClienteRepository;
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
    public void obter() {
        // Arrange
        IApontamentoRepository apontamentoRepository = new ApontamentoRepository(databaseFactory);
        int id = 2;

        // Act
        Apontamento apontamento = apontamentoRepository.obterPorId(id);

        // Assert
        assertNotNull(apontamento);
    }
    
    @Test
    public void insert() {
        // Arrange
        IClienteRepository clienteRepository = new ClienteRepository(databaseFactory);
        Cliente cliente = new Cliente();
        cliente.setCNPJ(2322323);
        cliente.setEndereco("rua tal tal");
        cliente.setNomeResponsavel("Qualquer um");
        cliente.setRazaoSocial("Razao total pra esse cara");
        cliente.setTelefone("32352069");
        cliente.setEmail("joba@joba");

        // Act
        clienteRepository.salvar(cliente);

        // Assert
        assertTrue(cliente.getClienteId() != 0);
    }
}
