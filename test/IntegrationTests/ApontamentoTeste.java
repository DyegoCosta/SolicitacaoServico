package IntegrationTests;

import Domain.Data.DatabaseFactory;
import Domain.Data.IDatabaseFactory;
import Domain.Models.Apontamento;
import Domain.Repository.IApontamentoRepository;
import Infrastructure.Repository.ApontamentoRepository;
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
}
