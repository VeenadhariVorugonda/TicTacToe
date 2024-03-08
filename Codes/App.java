import board.Board;
import player.Player;
import game.Game;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("First Project -> Tic Tac Toe");
        Board b = new Board(3, '-');
        b.printBoardConfig();
        Player p1 = new Player();
        p1.setPlayerNameSymbol("Veenadhari", 'X');
        p1.getPlayerNameSymbol();
        Player p2 = new Player();
        p2.setPlayerNameSymbol("Hema Haasini", 'O');
        p2.getPlayerNameSymbol();
        Game game = new Game(new Player[] { p1, p2 }, b);
        game.play();
    }
}
