package nl.han.ica;

public class TileNotFoundException extends RuntimeException {
    public TileNotFoundException() {
        super("Tile not found index invalid");
    }
}
