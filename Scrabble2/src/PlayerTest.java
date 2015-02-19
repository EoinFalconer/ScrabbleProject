/*
 * B’sWhyteFalcon
 *	Assignment  1
 *	Ben Reynolds – 13309656
 *	Conor Whyte -   13324911
 *	Eoin Falconer -   13331016
 */
public class PlayerTest {

	public static void main(String[] args) throws RankOutOfBoundsException, VectorFullException {
		
		Pool newPool = new Pool() ;   				//creates a pool object
		newPool.populateNewPool();			  				// creates a new pool
		
		String nameOne = "Tim";		  				// player name
		String nameTwo = "Ben";		  				// player name
		Player p = new Player(nameOne);  				// Creates a player called eoin
		Player p2 = new Player(nameTwo);  				// Creates a player called Conor
				
		System.out.println("Two Players Names: \nPlayer One:" + p.getName());			// prints players name
		System.out.println("Player Two:" + p2.getName() + "\n");			// prints players name
				
		
		System.out.println("Player 1, Expected Score: 0, Actual:" +p.getScore());		//prints score
		p.addScore(-1);							//adds score
		System.out.println("Player 1, Expected Score: 0, Actual:" + p.getScore());		//prints score	
		System.out.println("Player 1 Name:" + p.getName());	//prints name
		p.addScore(3);													// resets person
		System.out.println("Player 1, Expected Score: 3, Actual:" + p.getScore() + "\n");		//prints score
		
		
		p.resetGame();
		
		System.out.println("After player 1 reset:\nExpected: null, actual: " +p.getName()); 
		System.out.println("Expected: 0, Actual:" + p.getScore());		//prints score
		
		
	}

}
