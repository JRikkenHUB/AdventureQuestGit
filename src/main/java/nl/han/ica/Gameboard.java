package nl.han.ica;

import java.util.ArrayList;
import java.util.List;

public class Gameboard {
    private List<Tile> tiles;

    public Gameboard() {
        this.tiles = new ArrayList<>();
    }


    public void generate(int amount) {
        for (int i = 0; i < amount; i++) {
            tiles.add(new Tile(i));
        }
    }

    public int getTileCount() {
        return tiles.size();
    }

    public Tile getTile(int number){
        for (Tile tile : tiles) {
            if (tile.getNumber() == number){
                return tile;
            }
        }
        throw new TileNotFoundException();
    }

    public boolean IsNextToTile(Tile tile1, Tile tile2) {
        return (Math.abs(tile1.getNumber() - tile2.getNumber()) == 1);
    }
}
