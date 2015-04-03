import java.io.File;
import java.io.FileNotFoundException;


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
	


	public static void main(String[] args) throws NullPointerException, RankOutOfBoundsException, VectorFullException, FileNotFoundException {
	
		
// Part One: New Game Message, Sets Players Names, Populates board, pool, frames etc.
			Board b = new Board();
			b.populateBoard();
		
				UI ui = new UI();
				Challenge challenge = new Challenge();
		
						Pool newPool = new Pool();
						newPool.populateNewPool();	
		
							System.out.println(ui.newGameMessage());

						Player p = new Player(ui.setName());
						Frame playerOneFrame = new Frame(p);					
						playerOneFrame.refillFrame(newPool);							
		
				Player p2 = new Player(ui.setName());
				Frame playerTwoFrame = new Frame(p2);					
				playerTwoFrame.refillFrame(newPool);
		
		
			// Control Variables
				boolean endGame = false;				
				int incrementWhenPlaceOnBoard = 0;	
				int initialTurnScore;
				int endTurnScore;
				int scoreDifference;
				
		
					File theFile = new File("src/sowpods"); // dictionary File.
		 
// End Part One
		 

					
// Part Two: Start Game Loop And Take Input
		while(!endGame){
			System.out.println(ui.displayScoreNameAndFrame(p.playerid, p.getScore(), playerOneFrame.displayFrame()));
			System.out.println(ui.displayScoreNameAndFrame(p2.playerid, p2.getScore(), playerTwoFrame.displayFrame()));

				b.displayBoard();
			
					System.out.println("\n" + ui.promptPlayer(p, p2)); 
		
						String genericInputString = ui.takeGenericInput();			// takes input
						//System.out.println("Generic Input:" + genericInputString);
		
							String splitInput[] = genericInputString.split(" ");
		
									String check = ui.checkInput(genericInputString);			// CHECK WHAT USER WANTS TO DO
		
// End Part Two
									
//Part Three: Exchange
		 if(splitInput[0].equals("exchange")) {	
			 
			 if(ui.InputValidationWhileExchanging(splitInput[0], splitInput[1]) == true) {
			
					for(int i = 0; i < splitInput[1].length(); i++) {
						    char ch = splitInput[1].charAt(i);				// takes in a letter from the user to be replaced in the frame
							
							    if(ui.controlGameFlow % 2 == 0) {
									playerOneFrame.moveTileToPool(ch, newPool);		// puts chosen letter back into the pool
										playerOneFrame.refillFrame(newPool);
											ui.controlGameFlow++;
								}
							    else {
							    	playerTwoFrame.moveTileToPool(ch, newPool);		// puts chosen letter back into the pool
										playerTwoFrame.refillFrame(newPool);
											ui.controlGameFlow++;
							    }	    
					}
			 }
			 else {
				 System.out.println("Input Validation Failed, Please use form <exchange abc>.");
			 }
		}
// End Part Three
		 
// Part Four: Place On Board
		else if(check.equals("placeonboard")) {
			if(ui.InputValidationWhilePlacing(splitInput[0], splitInput[1], splitInput[2]) == true) {
		
							if(ui.controlGameFlow % 2 == 0){ 	// Player One
									
									if(!b.firstWordInCentre(splitInput[0], splitInput[1], splitInput[2]) && (incrementWhenPlaceOnBoard == 0)){
										System.out.println("First Word Must be in centre.");
									} 
									
										else if(!b.isPlacedInBoard(splitInput[0], splitInput[1], splitInput[2])){	//chooseword, position, axis
										System.out.println("This is out of bounds");
										}
									
											else if(!b.checkWordIsLegal(splitInput[0], splitInput[1], splitInput[2]) && (incrementWhenPlaceOnBoard != 0)  ){
											System.out.println("This word is not legal");
											}
									
												else{
													splitInput[0].trim();
													
														if(splitInput[0].contains("$")){
															playerOneFrame.removeFromFrame('$');
															splitInput[0] = ui.promptWhenSpacePlayed(splitInput[0]);
														}
													
															 initialTurnScore = p.getScore();
													
																b.insertOnBoard(splitInput[0], splitInput[1], splitInput[2], playerOneFrame);
																	p.addWordToScore(splitInput[0], playerOneFrame, splitInput[1],splitInput[2],b);
															
															endTurnScore = p.getScore();
															
																	playerOneFrame.refillFrame(newPool);
																		b.displayBoard();
																			String isChallenging = ui.promptChallenge(p2);
													
															scoreDifference = endTurnScore - initialTurnScore;
															
													
// CHALLENGE															
														if(isChallenging.equalsIgnoreCase("yes")){
															boolean flag = b.checkAllWordsOnBoard(); 
																if(flag){
																	System.out.println("Word is ok, " + p2.playerid + " you have lost a turn");
																		incrementWhenPlaceOnBoard++;
																}
																else if(!flag){
																	System.out.println("Word is not in scrabble dictionary, " + p.playerid + " you have lost a turn");
																		p.playerScore = p.getScore() - scoreDifference;
																			b.removeWordFromBoard(splitInput[1], splitInput[0], splitInput[2]);
																				ui.controlGameFlow++;
																}
														}
														else if(isChallenging.equalsIgnoreCase("no")){
															ui.controlGameFlow++;
																incrementWhenPlaceOnBoard++;
														}
														else{
															System.out.println("This is not a valid input, the word will be placed.");
																ui.controlGameFlow++;
																	incrementWhenPlaceOnBoard++;
														}
												}
								}
							else{
									if(!b.firstWordInCentre(splitInput[0], splitInput[1], splitInput[2]) && (incrementWhenPlaceOnBoard == 0)){
										System.out.println("First Word Must be in centre.");
									} 
										else if(!b.isPlacedInBoard(splitInput[0], splitInput[1], splitInput[2])){	//chooseword, position, axis
											System.out.println("This is out of bounds");
										}
											else if(!b.checkWordIsLegal(splitInput[0], splitInput[1], splitInput[2]) && (incrementWhenPlaceOnBoard != 0)  ){
												System.out.println("This word is not legal");
											}
								
												else{
													splitInput[0].trim();
														if(splitInput[0].contains("$")){
															playerTwoFrame.removeFromFrame('$');
															splitInput[0] = ui.promptWhenSpacePlayed(splitInput[0]);
														}
														
													initialTurnScore = p.getScore();
														b.insertOnBoard(splitInput[0], splitInput[1], splitInput[2], playerTwoFrame);
															p.addWordToScore(splitInput[0], playerTwoFrame, splitInput[1],splitInput[2],b);
															
													endTurnScore = p.getScore();
														playerTwoFrame.refillFrame(newPool);
															b.displayBoard();
																String isChallenging = ui.promptChallenge(p);
																
													scoreDifference = endTurnScore - initialTurnScore;
															if(isChallenging.equalsIgnoreCase("yes")){
																	boolean flag = b.checkAllWordsOnBoard();
																		if(flag){
																			System.out.println("Word is ok, " + p.playerid + " you have lost a turn");
																				incrementWhenPlaceOnBoard++;
																		}
																		else{
																			System.out.println("Word is not in scrabble dictionary, " + p2.playerid + " you have lost a turn");
																				p.playerScore = p.getScore() - scoreDifference;
																					b.removeWordFromBoard(splitInput[1], splitInput[0], splitInput[2]);
																						ui.controlGameFlow++;
																		}
															}
															else if(isChallenging.equalsIgnoreCase("no")){
																ui.controlGameFlow++;
																	incrementWhenPlaceOnBoard++;
															}
															else{
																System.out.println("This is not a valid input, the word will be placed.");
																	ui.controlGameFlow++;
																		incrementWhenPlaceOnBoard++;
															}
												}
							}
				}
				else {
					System.out.println("Input Validation Failed, please use syntax: <abc h8 vertical>");
				}
			} 
// End Part Four (Place On Board)
			

			switch(newPool.size()) {
				case 0:
					endGame = true;
					break;
				default:
					endGame = false;
					break;	
			}

		}
		
		if((p.getScore() > p2.getScore()) && endGame){
			System.out.println("Well done " + p.getName() + " you have won.\nYou lose"+p2.getName());
		}
		else if((p.getScore() < p2.getScore()) && endGame){
			System.out.println("Well done " + p2.getName() + " you have won.\nYou lose"+p.getName());
		}
	}
}
	


