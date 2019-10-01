package nl.han.ica;

public class Character {
    private String name;
    private int energy;
    private Vehicle vehicle;
    private Tile tile;

    public Character(String name, int energy, Tile tile) {
        this.name = name;
        this.energy = energy;
        this.tile = tile;
    }


    public String getName() {
        return this.name;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setTile(Tile tile) {
        this.tile = tile;
    }

    public void place(Tile tile){
        this.tile = tile;
    }

    public Tile getTile() {
        return tile;
    }

    public void tradeVehicle(Character character) {
        Vehicle temp = this.vehicle;
        character.vehicle = this.vehicle;
        this.vehicle = temp;

    }

    public void spendEnergy(int Expence){
        if(Expence > this.energy){
            throw new expenceToHighException();
        }
        else{
            this.energy -= Expence;
        }
    }

    public void tradePlaces(Character character2){
        Tile tmpTile = this.tile;

        this.spendEnergy(200);
        this.setTile(character2.getTile());
        character2.setTile(tmpTile);
    }
}
