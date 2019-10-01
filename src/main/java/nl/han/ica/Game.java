package nl.han.ica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    private List<Character> characters;
    private Gameboard board;
    private Scanner scanner;

    public Game() {
        this.characters = new ArrayList<>();
        this.scanner = new Scanner(System.in);
        board = new Gameboard();
        board.generate(64);
    }

    private Character getCharacter(String name) {
        for (Character character : characters) {
            if(character.getName().equals(name))
                return character;

        }
        throw new CharacterNotFoundException();
    }

    public void signIn(int amount){
        for (int i = 0; i < amount; i++) {
            System.out.print("Name please:");
            String characterName = scanner.nextLine();
            System.out.print("Start tile number between 0 and 63:");
            int Tile = Integer.parseInt(scanner.nextLine());

            this.characters.add(new Character(characterName, 100, this.board.getTile(Tile)));
        }
    }

    public void Teleport(String characterName, int tileNumber){
        Character character = getCharacter(characterName);
        Tile tile = board.getTile(tileNumber);
        character.spendEnergy(20);
        character.setTile(tile);
    }

    public void tradeVehicle (String name1, String name2) {
        Character character1 = getCharacter(name1);
        Character character2 = getCharacter(name2);
        Tile tile1 = character1.getTile();
        Tile tile2 = character2.getTile();
        if (board.IsNextToTile(tile1, tile2)) {
            character1.tradeVehicle(character1);
        }
    }

    //Char1 is the one that spends the energy
    public void tradePlaces (String name1, String name2){
        Character char1 = getCharacter(name1);
        Character char2 = getCharacter(name2);

        if(char1.getEnergy() > 200){
            char1.tradePlaces(char2);
        }


//        System.out.println(char1.getTile().getNumber());
//        System.out.println(char2.getTile().getNumber());
//        System.out.println(char1.getEnergy());
    }
}
