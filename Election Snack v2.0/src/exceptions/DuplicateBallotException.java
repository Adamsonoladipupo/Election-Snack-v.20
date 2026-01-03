package exceptions;

public class DuplicateBallotException extends RuntimeException {
    public DuplicateBallotException(String message) {
        super(message);
    }
}
