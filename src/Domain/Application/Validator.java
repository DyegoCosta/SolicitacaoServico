package Domain.Application;

import java.util.regex.Pattern;

public class Validator implements IValidator {

    private Pattern _emailPattern;
    private Pattern _cnpjPattern;
    private static final String EMAIL_PATTERN = "^[0-9]{2,3}?\\.[0-9]{3}?\\.[0-9]{3}?\\-[0-9]{2}?$";
    private static final String CNPJ_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public Validator() {
        _emailPattern = Pattern.compile(EMAIL_PATTERN);
        _cnpjPattern = Pattern.compile(CNPJ_PATTERN);
    }

    @Override
    public boolean emailEstaValido(String email) {
        return _emailPattern.matcher(email).matches();
    }

    @Override
    public boolean cnpjEstaValido(String cnpj) {
        return _cnpjPattern.matcher(cnpj).matches();
    }
}
