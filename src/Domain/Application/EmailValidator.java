package Domain.Application;

import java.util.regex.Pattern;

public class EmailValidator implements IEmailValidator {

    private Pattern _pattern;
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public EmailValidator() {
        _pattern = Pattern.compile(EMAIL_PATTERN);
    }

    @Override
    public boolean estaValido(String email) {
        return _pattern.matcher(email).matches();
    }
}
