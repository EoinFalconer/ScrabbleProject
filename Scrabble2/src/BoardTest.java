
public class BoardTest {

	public static void main(String[] args) throws RankOutOfBoundsException, VectorFullException {
		Pool p = new Pool();
		Player Eoin  = new Player("Eoin");
		Frame f = new Frame(Eoin);
		p.populateNewPool();
		f.refillFrame(p);
		f.displayFrame();
		Board b = new Board();
		b.populateBoard();
		
		b.displayBoard();

	}
}

