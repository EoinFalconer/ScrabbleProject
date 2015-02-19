
public class BoardTest {

	public static void main(String[] args) throws RankOutOfBoundsException, VectorFullException {
		Pool p = new Pool();
		
		Player Eoin  = new Player("Eoin");
		Frame f = new Frame(Eoin);
		Board b = new Board();
		
		p.populateNewPool();
		
		f.refillFrame(p);
		f.displayFrame();
		
		b.populateBoard();
		//b.insertOnBoard('c', "A1" ,f) ; 
		b.displayBoard();

	}
}

