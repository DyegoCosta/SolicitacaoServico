
import Domain.Data.DatabaseFactory;
import Domain.Data.IDatabaseFactory;
import Domain.Models.Usuario;
import Domain.Repository.IUsuarioRepository;
import Infrastructure.Repository.UsuarioRepository;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class UsuarioTeste {
    
    private IDatabaseFactory databaseFactory;
    
    public UsuarioTeste() {
    }

    @Before
    public void setUp() {
        
        databaseFactory = new DatabaseFactory("Infrastructure/Configuration/hibernate.cfg.xml");
    }
    
    @Test
    public void listarUsuariosCriterioJoba() {
        // Arrange
        IUsuarioRepository usuarioRepository = new UsuarioRepository(databaseFactory);
        String texto = "joba";
        // Act
        List<Usuario> usuarios = usuarioRepository.listarPorCriterio(texto);

        // Assert
        assertEquals(1, usuarios.size());
    }
    
    @Test
    public void listarUsuariosCriterioUsuarioId() {
        // Arrange
        IUsuarioRepository usuarioRepository = new UsuarioRepository(databaseFactory);
        String texto = "4";
        // Act
        List<Usuario> usuarios = usuarioRepository.listarPorCriterio(texto);

        // Assert
        assertEquals(3, usuarios.size());
    }
}
