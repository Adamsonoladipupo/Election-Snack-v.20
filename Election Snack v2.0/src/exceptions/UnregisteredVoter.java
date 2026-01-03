package exceptions;

public class UnregisteredVoter extends RuntimeException {
    public UnregisteredVoter(String message) {
        super(message);
    }
}
