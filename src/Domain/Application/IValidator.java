package Domain.Application;

public interface IValidator {

    boolean emailEstaValido(final String email);

    boolean cnpjEstaValido(final String cnpj);
}
