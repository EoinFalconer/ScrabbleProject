/*
 *  B’sWhyteFalcon
 *	Assignment  1
 *	Ben Reynolds – 13309656
 *	Conor Whyte -   13324911
 *	Eoin Falconer -   13331016
 */


import javax.swing.JOptionPane;


public class FrameTest {

	public static void main(String args[]) throws RankOutOfBoundsException, VectorFullException, ArrayIndexOutOfBoundsException, NullPointerException {
		
		
		
		Pool newPool = new Pool() ;   				//creates a pool object
		newPool.populateNewPool();	// creates a new pool
		Board b = new Board();
		b.populateBoard();
		String nameOne = "Tim";		  				// player name
		String nameTwo = "Ben";		  				// player name
		Player p = new Player(nameOne);  				// Creates a player called eoin
		Player p2 = new Player(nameTwo);  				// Creates a player called Conor
				
		Frame f = new Frame(p);						// creates a new frame for player p
		Frame fr = new Frame(p2);						// creates a new frame for player p2
		f.refillFrame(newPool);							// fills frame from pool
		fr.refillFrame(newPool);							// fills frame from pool
		
		
		System.out.println("Expected Pool Size: 86, Actual:" + newPool.size() + "\n");			// prints size of pool
		f.resetFrame(newPool);							// resets the frame
		System.out.println("Expected Pool Size: 93, Actual:" + newPool.size() + "\n");			// prints size of pool
		f.refillFrame(newPool);							// refills frame
		
		
			String c = "";
			
				// Prints  Both players Frame 
				String s = f.displayFrame();			
				System.out.println("Frame Player One:" + s);
				
				 s = fr.displayFrame();			
				System.out.println("Frame Player Two:" + s);
				// end of printing frame
	
				 
						
					
			c = JOptionPane.showInputDialog("Player One, Which letter do you wish to discard?", null);
				char ch = c.charAt(0);				// takes in a letter from the user to be replaced in the frame
					f.moveTileToPool(ch, newPool);		// puts choosen letter back into the pool
						f.refillFrame(newPool);					// replaces empty sppaces in the frame with new tiles from pool
					System.out.println("Frame Player One:" + f.displayFrame() );	// displays changed frame
						
		
			
			 
				
			c = JOptionPane.showInputDialog("Player two, Which letter do you wish to discard?", null);
					ch = c.charAt(0);				// takes in a letter from the user to be replaced in the frame
					fr.moveTileToPool(ch, newPool);		// puts choosen letter back into the pool
						fr.refillFrame(newPool);					// replaces empty sppaces in the frame with new tiles from pool
					System.out.println("Frame Player two:" + fr.displayFrame());	// displays changed frame
				
					System.out.println("\nFrame player one size:" + f.frameSize());
					System.out.println("Frame player two size:" + fr.frameSize());
					
					System.out.println("Is Frame empty:" + fr.isFrameEmpty());
					for(int k=0;k<4;k++){
			String st = c = JOptionPane.showInputDialog("Which letter do you wish to place on the board", null);
			char cha = st.charAt(0);
				Square t = b.insertOnBoard(cha,"A1",f);
				Square[] wordinquestion = new Square[16];
				t = wordinquestion[k];
				b.displayBoard();
					}
				
	}


}

