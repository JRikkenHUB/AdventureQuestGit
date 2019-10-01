package nl.han.ica;

public class expenceToHighException extends RuntimeException {
    public expenceToHighException() {
        super("Expence is to high action could not be completed");
    }
}
