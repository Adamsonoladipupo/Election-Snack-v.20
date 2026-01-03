package exceptions;

public class CandidateDoesNotExistErrorException extends RuntimeException {
    public CandidateDoesNotExistErrorException(String message) {
        super(message);
    }
}
