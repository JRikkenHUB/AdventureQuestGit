package nl.han.ica;

public class CharacterNotFoundException extends RuntimeException {
    public CharacterNotFoundException() {
        super("Character not found");
    }
}
