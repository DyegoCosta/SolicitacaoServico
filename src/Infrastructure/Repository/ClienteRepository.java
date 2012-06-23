package Infrastructure.Repository;

<<<<<<< HEAD
import Domain.Application.EmailValidator;
import Domain.Application.IEmailValidator;
=======
import Domain.Application.IValidator;
>>>>>>> 3f1c7bdd4867eb4d4b4e12fbe0e40e8ca9b97f6c
import Domain.Application.StringHelper;
import Domain.Application.ValidacaoException;
import Domain.Data.IDatabaseFactory;
import Domain.Models.Cliente;
import Domain.Repository.IClienteRepository;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class ClienteRepository extends BaseRepository<Cliente> implements IClienteRepository {
<<<<<<< HEAD
    
    private IEmailValidator _emailValidator;
    
    public ClienteRepository(IDatabaseFactory databaseFactory){
        this(databaseFactory, new EmailValidator());
    }
    
    public ClienteRepository(IDatabaseFactory databaseFactory, IEmailValidator emailValidator){
         super(databaseFactory);
         _emailValidator = emailValidator;
=======

    private IValidator _validator;

    public ClienteRepository(IDatabaseFactory databaseFactory, IValidator validator) {
        super(databaseFactory);
        _validator = validator;
>>>>>>> 3f1c7bdd4867eb4d4b4e12fbe0e40e8ca9b97f6c
    }

    @Override
    public List<Cliente> listarPorCriterio(String texto) {

        texto = adicionarSinalPorcentagem(texto);
        Criteria criterio = session.createCriteria(Cliente.class).add(Restrictions.disjunction().add(Restrictions.ilike("razaoSocial", texto)).add(Restrictions.ilike("CNPJ", texto)).add(Restrictions.ilike("nomeResponsavel", texto)).add(Restrictions.ilike("telefone", texto)).add(Restrictions.ilike("endereco", texto)).add(Restrictions.ilike("email", texto)));
        return criterio.list();
    }

    @Override
    public void deletar(Cliente entidade) throws ValidacaoException {
        if (entidade == null)
            throw new IllegalArgumentException("'entidade' não pode ser nula");

        if (!entidade.getOrdensServicos().isEmpty())
            throw new ValidacaoException(
                    String.format("Cliente '%s' não pode ser excluído pois possui Ordem de Serviço vinculada",
                    entidade.getRazaoSocial()));

        super.deletar(entidade);
    }

    @Override
    public Cliente salvar(Cliente entidade) throws ValidacaoException {
        if (entidade == null)
            throw new IllegalArgumentException("'entidade' não pode ser nula");

        if (!cnpjEstaValido(entidade.getCNPJ()))
            throw new ValidacaoException(
                    String.format("CNPJ '%s' não é válido",
                    entidade.getCNPJ()));

        if (!emailEstaValido(entidade.getEmail()))
            throw new ValidacaoException(
                    String.format("Email '%s' não é um email válido",
                    entidade.getEmail()));

        return super.salvar(entidade);
    }

    private boolean emailEstaValido(String email) {
        //email não é obrigatório.
        return StringHelper.estaNulaOuVazia(email)
                || _validator.emailEstaValido(email);
    }

    private boolean cnpjEstaValido(String cnpj) {
        return _validator.cnpjEstaValido(cnpj);
    }
}
