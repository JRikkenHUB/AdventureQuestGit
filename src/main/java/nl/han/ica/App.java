package nl.han.ica;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Game game = new Game();
        game.signIn(2);
        game.tradePlaces("jeroen", "joey");
        //game.Teleport("jeroen", 20);
        //game.tradeVehicle("jeroen", "joey");
    }
}
