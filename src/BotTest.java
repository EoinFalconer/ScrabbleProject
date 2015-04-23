import java.io.FileNotFoundException;
import java.util.Set;


public class BotTest {
	public static void main(String[] args) throws FileNotFoundException{
		Bot b = new Bot();
		Player p = new Player();
		Dictionary d = new Dictionary();
		Frame f = new Frame();
		Pool pool = new Pool();
		f.refill(pool);
		Board board = new Board();
		b.getCommand(p,board,d);
		int set = b.getCommand(p,board,d);
		System.out.println(set);
	}
}