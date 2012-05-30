
import Domain.Data.DatabaseFactory;
import Domain.Data.IDatabaseFactory;
import Domain.Data.IUnitOfWork;
import Domain.Data.UnitOfWork;
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
    public void obterApontamentoPorId() {
        // Arrange
        IApontamentoRepository apontamentoRepository = new ApontamentoRepository(databaseFactory);
        int id = 2;

        // Act
        Apontamento apontamento = apontamentoRepository.obterPorId(id);

        // Assert
        assertNotNull(apontamento);
        assertFalse(apontamento.getApontamentoId() == 0);
        assertFalse(apontamento.getUsuarioId() == 0);
    }
    
    @Test
    public void obterApontamentoPorIdComUsuarioPreenchido() {
        // Arrange
        IApontamentoRepository apontamentoRepository = new ApontamentoRepository(databaseFactory);
        int id = 2;

        // Act
        Apontamento apontamento = apontamentoRepository.obterPorId(id);

        // Assert
        assertNotNull(apontamento);
        assertFalse(apontamento.getUsuarioId() == 0);
        assertNotNull(apontamento.getUsuario());
        assertFalse(apontamento.getUsuario().getUsuarioId() == 0);
    }
    
    @Test
    public void insert() {
        // Arrange
        //IUnitOfWork unitOfWork = new UnitOfWork(databaseFactory);
        //IClienteRepository clienteRepository = new ClienteRepository(databaseFactory);
        //Cliente cliente = new Cliente();
        //cliente.setCNPJ("232323");
        //cliente.setEndereco("rua tal tal");
        //cliente.setNomeResponsavel("Qualquer um");
        //cliente.setRazaoSocial("Razao total pra esse cara");
        //cliente.setTelefone("32352069");
        //cliente.setEmail("joba@joba");

        // Act
        //clienteRepository.salvar(cliente);
        //unitOfWork.commit();

        // Assert
        //assertTrue(cliente.getClienteId() != 0);
    }
}
