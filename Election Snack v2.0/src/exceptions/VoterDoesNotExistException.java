package exceptions;

public class VoterDoesNotExistException extends RuntimeException {
    public VoterDoesNotExistException(String message) {
        super(message);
    }
}
