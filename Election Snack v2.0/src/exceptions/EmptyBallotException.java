package exceptions;

public class EmptyBallotException extends RuntimeException {
    public EmptyBallotException(String message) {
        super(message);
    }
}
