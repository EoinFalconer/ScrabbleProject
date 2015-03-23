/**
 * /*
 *  B’sWhyteFalcon
 *	Assignment  3
 *	Ben Reynolds – 13309656
 *	Conor Whyte -   13324911
 *	Eoin Falconer -   13331016
 *
 *  @author B'sWhyteFalcon
 */


public class Scrabble {
	


	public static void main(String[] args) throws NullPointerException, RankOutOfBoundsException, VectorFullException {
		
		Board b = new Board();
		b.populateBoard();
		
		UI ui = new UI();
		
		Pool newPool = new Pool() ;
		newPool.populateNewPool();
		System.out.println(ui.newGameMessage());
		Player p = new Player(ui.getName());
		Player p2 = new Player(ui.getName());
		
		Frame playerOneFrame = new Frame(p);					
		playerOneFrame.refillFrame(newPool);							
		
		Frame playerTwoFrame = new Frame(p2);					
		playerTwoFrame.refillFrame(newPool);
		boolean endGame = false;
		
		int incrementWhenPlaceOnBoard = 0;
		
		while(!endGame){
		System.out.println(ui.displayScoreNameAndFrame(p.playerid, p.getScore(), playerOneFrame.displayFrame()));
		System.out.println(ui.displayScoreNameAndFrame(p2.playerid, p2.getScore(), playerTwoFrame.displayFrame()));

		b.displayBoard();
			System.out.println("\n" + ui.promptPlayer(p, p2)); 
		
		String splitInput[] = new String[10];
		String genericInputString = ui.takeGenericInput();
		splitInput = genericInputString.split("-");
		String check = ui.checkInput(genericInputString);
		if((!splitInput[0].equalsIgnoreCase("exchange")) && (!splitInput[2].equalsIgnoreCase("horizontal")) && (!splitInput[2].equalsIgnoreCase("vertical"))){
			System.out.println("This is not a valid input please try again.\n");
		}
		else if(splitInput[0].equals("exchange")) {	
			for(int i = 0; i < splitInput[1].length(); i++) {
				    char ch = splitInput[1].charAt(i);				// takes in a letter from the user to be replaced in the frame
					
				    if(ui.controlGameFlow % 2 == 0)
					{
						playerOneFrame.moveTileToPool(ch, newPool);		// puts chosen letter back into the pool
						playerOneFrame.refillFrame(newPool);
						ui.controlGameFlow++;
					}
				    else {
				    	playerTwoFrame.moveTileToPool(ch, newPool);		// puts chosen letter back into the pool
						playerTwoFrame.refillFrame(newPool);
						playerTwoFrame.displayFrame();
						ui.controlGameFlow++;
				    }
				    
			}
		}
		else if(check.equals("placeonboard")) {
			if(ui.controlGameFlow % 2 == 0){
					if(!b.firstWordInCentre(splitInput[0], splitInput[1], splitInput[2]) && (incrementWhenPlaceOnBoard == 0)){
						System.out.println("yo");
					} 
					else if(!b.isPlacedInBoard(splitInput[0], splitInput[1], splitInput[2])){	//chooseword, position, axis
					System.out.println("This is out of bounds");
					
					}
					else if(!b.checkWordIsLegal(splitInput[0], splitInput[1], splitInput[2]) && (incrementWhenPlaceOnBoard != 0)){
					System.out.println("This word is not legal");
					
					}
					else{
						b.insertOnBoard(splitInput[0], splitInput[1], splitInput[2], playerOneFrame);
						p.addWordToScore(splitInput[0], playerOneFrame, splitInput[1],splitInput[2],b);
						playerOneFrame.refillFrame(newPool);
						System.out.println(playerOneFrame.displayFrame());
						ui.controlGameFlow++;
						incrementWhenPlaceOnBoard++;
					}
				}
			else{
				if(!b.firstWordInCentre(splitInput[0], splitInput[1], splitInput[2]) && (incrementWhenPlaceOnBoard == 0)){
					System.out.println("yo");
				} 
				else if(!b.isPlacedInBoard(splitInput[0], splitInput[1], splitInput[2])){
					System.out.println("This is out of bounds");
				}
				else if(!b.checkWordIsLegal(splitInput[0], splitInput[1], splitInput[2])){
					System.out.println("This word is not legal");
				}
				else{
					b.insertOnBoard(splitInput[0], splitInput[1], splitInput[2], playerOneFrame);
					p2.addWordToScore(splitInput[0], playerTwoFrame, splitInput[1],splitInput[2],b);
					playerTwoFrame.refillFrame(newPool);
					System.out.println(playerTwoFrame.displayFrame());
					ui.controlGameFlow++;
					incrementWhenPlaceOnBoard++;
				}
			}
		
		if(newPool.size() == 0){
			endGame = true;
		}
		else{
			endGame = false;
		}
		
		
		
		}
		if(p.getScore() > p2.getScore()){
			System.out.println("Well done " + p.getName() + " you have won.\nYou suck"+p2.getName());
		}
		else if(p.getScore() < p2.getScore()){
			System.out.println("Well done " + p2.getName() + " you have won.\nYou suck"+p.getName());
		}
	}
	}

}
