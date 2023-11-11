package infra;
import util.LoginInvalidException;
import util.PasswordInvalidException;

public interface Command {
    void execute() throws LoginInvalidException, PasswordInvalidException;
}
