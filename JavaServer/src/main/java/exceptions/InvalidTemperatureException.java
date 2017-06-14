package exceptions;

/**
 * Created by Bogusia on 14.06.2017.
 */
public class InvalidTemperatureException extends RuntimeException {

    public InvalidTemperatureException(String message) {
        super(message);
    }
}
