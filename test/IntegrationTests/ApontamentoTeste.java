package IntegrationTests;

import Domain.Data.DatabaseFactory;
import Domain.Data.IDatabaseFactory;
import Domain.Data.IUnitOfWork;
import Domain.Data.UnitOfWork;
import Domain.Models.Apontamento;
import Domain.Repository.IApontamentoRepository;
import Infrastructure.Repository.ApontamentoRepository;
import org.joda.time.LocalDateTime;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ApontamentoTeste {

    private IDatabaseFactory databaseFactory;

    public ApontamentoTeste() {
    }

    @Before
    public void setUp() {

        databaseFactory = new DatabaseFactory("Infrastructure/Configuration/hibernate.cfg.xml");
    }

    @Test
    public void verificarSeAsDatasPossuemHorasMinutosSegundos() {
        // Arrange
        IApontamentoRepository apontamentoRepository = new ApontamentoRepository(databaseFactory);
        int id = 3;

        // Act
        Apontamento apontamento = apontamentoRepository.obterPorId(id);
        
        // Assert
        assertNotNull(apontamento);
        assertEquals(17, apontamento.getDataInicio().getDayOfMonth());
        assertEquals(5, apontamento.getDataInicio().getMonthOfYear());
        assertEquals(2012, apontamento.getDataInicio().getYear());
        assertEquals(9, apontamento.getDataInicio().getHourOfDay());
        assertEquals(30, apontamento.getDataInicio().getMinuteOfHour());
        assertEquals(20, apontamento.getDataInicio().getSecondOfMinute());
    }
    
    @Test
    public void salvarApontamentoComAsDatasCorretas() {
        
        // Arrange
        IUnitOfWork unitOfWork = new UnitOfWork(databaseFactory);
        IApontamentoRepository apontamentoRepository = new ApontamentoRepository(databaseFactory);

        Apontamento apontamento = new Apontamento();
        apontamento.setDetalhes("qualquercoisa");
        apontamento.setOrdemServicoId(1);
        apontamento.setUsuarioId(1);
        apontamento.setDataInicio(new LocalDateTime(2012, 6, 3, 23, 15));
        apontamento.setDataTermino(new LocalDateTime(2012, 6, 3, 23, 30));
        
        // Act
        apontamentoRepository.salvar(apontamento);
        unitOfWork.commit();
        apontamento = apontamentoRepository.obterPorId(apontamento.getApontamentoId());
        
        // Assert
        assertNotNull(apontamento);
        assertEquals(3, apontamento.getDataInicio().getDayOfMonth());
        assertEquals(6, apontamento.getDataInicio().getMonthOfYear());
        assertEquals(2012, apontamento.getDataInicio().getYear());
        assertEquals(23, apontamento.getDataInicio().getHourOfDay());
        assertEquals(15, apontamento.getDataInicio().getMinuteOfHour());
    }
}
