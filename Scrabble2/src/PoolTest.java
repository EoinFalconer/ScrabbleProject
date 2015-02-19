/*
 *  B’sWhyteFalcon
 *	Assignment  1
 *	Ben Reynolds – 13309656
 *	Conor Whyte -   13324911
 *	Eoin Falconer -   13331016
 */
public class PoolTest {

	public static void main(String[] args) throws RankOutOfBoundsException, VectorFullException {

		Pool newPool = new Pool() ;   				//creates a pool object
		System.out.println("Is Pool Empty before population:" + newPool.isEmpty());	
		newPool.populateNewPool();			  				// creates a new pool
		
		String nameOne = "Tim";		  				// player name
		String nameTwo = "Ben";		  				// player name
		Player p = new Player(nameOne);  				// Creates a player called eoin
		Player p2 = new Player(nameTwo);  				// Creates a player called Conor
				
		Frame f = new Frame(p);						// creates a new frame for player p
		Frame fr = new Frame(p2);						// creates a new frame for player p2
		f.refillFrame(newPool);							// fills frame from pool
		fr.refillFrame(newPool);							// fills frame from pool
		
		System.out.println("Is Pool Empty after population:" + newPool.isEmpty());
		System.out.println("Expected Pool Size: 86, Actual:" + newPool.size());			// prints size of pool
			
		
		
		/* This code will print all tiles in the pool: */
		System.out.println("Tiles in Pool After two frames created:");
	  	for(int i=0; newPool.tileAtRank(i) != null; i++)
	  	{
	  			System.out.println(newPool.tileAtRank(i).tname);
	  	}
	  	
	  	System.out.println("Before Pool reset:\nExpected Pool Size: 86, Actual:" + newPool.size());	
	  	newPool.resetPool();
	  	System.out.println("After Pool reset:\nExpected Pool Size: 100, Actual:" + newPool.size());	
	  	
	}

}
