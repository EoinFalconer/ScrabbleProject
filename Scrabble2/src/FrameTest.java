/*
 *  B’sWhyteFalcon
 *	Assignment  1
 *	Ben Reynolds – 13309656
 *	Conor Whyte -   13324911
 *	Eoin Falconer -   13331016
 */





public class FrameTest {

	public static void main(String args[]) throws RankOutOfBoundsException, VectorFullException, ArrayIndexOutOfBoundsException, NullPointerException {
		
		
		
		Pool newPool = new Pool() ;   				//creates a pool object
		newPool.populateNewPool();					// creates a new pool
		Board b = new Board();
		b.populateBoard();
		String nameOne = "Tim";		  				
		String nameTwo = "Ben";		  				
		Player p = new Player(nameOne);  			// Creates a player called eoin
		Player p2 = new Player(nameTwo);  	
		Frame f = new Frame(p);						// creates a new frame for player p						
		f.refillFrame(newPool);	
		Frame fr = new Frame(p2);
		fr.refillFrame(newPool);					// fills frame from pool
		
		
		System.out.println("Expected Pool Size: 86, Actual:" + newPool.size() + "\n");									
		System.out.println("Expected Pool Size: 93, Actual:" + newPool.size() + "\n");			
		f.refillFrame(newPool);							// refills frame
		
			
				// Prints  Both players Frame 
				String s = f.displayFrame();			
				System.out.println("Frame Player One:" + s);
				
				char ch = s.charAt(1);				// takes in a letter from the user to be replaced in the frame
				f.moveTileToPool(ch, newPool);		// puts choosen letter back into the pool
					f.refillFrame(newPool);					
				System.out.println("Augmented Frame Player One:" + f.displayFrame() +"\n\n");	
				
				 String s1 = fr.displayFrame();			
				System.out.println("Frame Player Two:" + s1);
				// end of printing frame
		
				char ch1 = s1.charAt(1);
				fr.moveTileToPool(ch1, newPool);
				fr.refillFrame(newPool);
				System.out.println("Augmented Frame Player Two:" + fr.displayFrame() );	
				  
					} 
				
	}