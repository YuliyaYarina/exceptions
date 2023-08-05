import java.util.Objects;
import java.util.regex.Pattern;

public class Validator {

private final static Pattern regex = Pattern.compile("[A-Za-z0-9_]{0,20}");
    public static void validateWithRegex(String login, String password, String confirmPassword)
        throws Exception {

        if (Objects.isNull(login) || Objects.isNull(password)) {
            throw new Exception();
        }

        if (!login.matches(regex.pattern())) {
            throw new WrongLoginException("Логин не должен быть больше 20 символов и должен состоять из латинских символов, чисел и нижнего подчеркивания");
        }
        if (!password.matches(regex.pattern())) {
            throw new WrongPasswordException("Логин не должен быть больше 20 символов и должен состоять из латинских символов, чисел и нижнего подчеркивания");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

}
