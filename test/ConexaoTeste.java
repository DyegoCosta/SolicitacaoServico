
import Domain.Data.DatabaseFactory;
import Domain.Data.IDatabaseFactory;
import Domain.Data.IUnitOfWork;
import Domain.Data.UnitOfWork;
import Domain.Repository.IApontamentoRepository;
import Domain.Models.Apontamento;
import Domain.Models.Cliente;
import Domain.Models.OrdemServico;
import Domain.Models.StatusOrdemServico;
import Domain.Repository.IClienteRepository;
import Domain.Repository.IOrdemServicoRepository;
import Infrastructure.Repository.ApontamentoRepository;
import Infrastructure.Repository.ClienteRepository;
import Infrastructure.Repository.OrdemServicoRepository;
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
    public void obterOrdemServicoPorId() {
        // Arrange
        IOrdemServicoRepository ordemServicoRepository = new OrdemServicoRepository(databaseFactory);
        int id = 1;

        // Act
        OrdemServico ordemServico = ordemServicoRepository.obterPorId(id);

        // Assert
        assertNotNull(ordemServico);
        assertFalse(ordemServico.getOrdemServicoId() == 0);
        assertTrue(ordemServico.getStatus() == StatusOrdemServico.Aberta);
    }
    
    @Test
    public void obterOrdemServicoPorIdComRelacionamentosPreenchidos() {
        // Arrange
        IOrdemServicoRepository ordemServicoRepository = new OrdemServicoRepository(databaseFactory);
        int id = 1;

        // Act
        OrdemServico ordemServico = ordemServicoRepository.obterPorId(id);

        // Assert
        assertNotNull(ordemServico);
        assertFalse(ordemServico.getOrdemServicoId() == 0);
        assertFalse(ordemServico.getClienteId() == 0);
        assertFalse(ordemServico.getCliente().getClienteId() == 0);
        
        assertFalse(ordemServico.getAnalistaId() == 0);
        assertFalse(ordemServico.getAnalista().getUsuarioId() == 0);
        
        assertFalse(ordemServico.getTecnicoId() == 0);
        assertFalse(ordemServico.getTecnico().getUsuarioId() == 0);
        
        assertFalse(ordemServico.getAtendenteId() == 0);
        assertFalse(ordemServico.getAtendente().getUsuarioId() == 0);
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
