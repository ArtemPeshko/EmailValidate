
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmailValidator {

    private Pattern pattern;

    private static final String EMAIL_PATTERN;

    static {
        EMAIL_PATTERN = "^[A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-zА-Яа-я]{2,})$";
    }

    EmailValidator() {
        pattern = Pattern.compile(EMAIL_PATTERN);
    }

    boolean validate(final String hex) {
        Matcher matcher = pattern.matcher(hex);

        return matcher.matches();
    }

}
