


		public class BoardTest {

			public static void main(String args[]) throws NullPointerException, RankOutOfBoundsException, VectorFullException, ArrayIndexOutOfBoundsException, NullPointerException {
				
				System.out.println("****************\n    Testing\n  Assignment 2\n B'sWhyteFalcon\n****************");
				
				Pool newPool = new Pool() ;   			
				newPool.populateNewPool();	
				
				UI ui = new UI();
				
				Board b = new Board();
				b.populateBoard();
				boolean isEmptyTest = b.isSquareEmpty(7, 7);
				System.out.println("Testing isSquareEmpty():\n" + "Expected Value = true"+"\n"+"Result =" + isEmptyTest+ "\n\n");
				
				String nameOne = "Tim";		  				
				Player p = new Player(nameOne);  				
						
				Frame f = new Frame(p);					
				f.refillFrame(newPool);							// fills frame from pool
				
				
				System.out.println("Testing Pool:\n"+"Expected Pool Size: 93, Actual:" + newPool.size() + "\n\n");	
					
				
				String s = f.displayFrame();
			
						 char ch = s.charAt(3);
							f.moveTileToPool(ch, newPool);		
								f.refillFrame(newPool);					
							System.out.println("Testing Frame:\nFrame Player One:" + f.displayFrame() + "\n\n" );	// displays changed frame		
							
					/*
					 * Testing the firstWordInCentre() method.
					 */
					f.refillFrame(newPool);
					String word  = Character.toString(s.charAt(1)) + Character.toString(s.charAt(5));
					String startingCoordinate = "A2";
					String axis  = "horizontal";
						if(!(b.firstWordInCentre(word, startingCoordinate, axis))){
							System.out.println("\nTesting firstWordInCentre():\nError, nothing in H8");
							f.displayFrame();
						}
						else{
							System.out.println("Testing insertOnBoard():\n");
							b.insertOnBoard(word, startingCoordinate, axis, f);
							b.displayBoard();
						}
					System.out.println("Expected: Error, nothing in H8\n\n");
					
					
					/*
					 * Placing a word in centre in order to check other methods
					 */
					f.refillFrame(newPool);
					s=f.displayFrame();
					String word2  = Character.toString(s.charAt(1)) + Character.toString(s.charAt(5));
					String startingCoordinate2 = "H8";
					String axis2  = "horizontal";
						if(!(b.firstWordInCentre(word2, startingCoordinate2, axis2))){
							System.out.println("/nTesting firstWordInCentre():\nError, nothing in H8\n");
							f.displayFrame();
						}
						else{
							System.out.println("\nTesting insertOnBoard():\n");
							b.insertOnBoard(word2, startingCoordinate2, axis2, f);
							b.displayBoard();
						}
					System.out.println("Expected: Error, nothing in H8\n\n");
					
					f.refillFrame(newPool);
					word2  = Character.toString(s.charAt(1)) + Character.toString(s.charAt(5));
					startingCoordinate2 = "G8";
					axis2  = "vertical";
						if(!(b.firstWordInCentre(word2, startingCoordinate2, axis2))){
							System.out.println("/nTesting firstWordInCentre():\nError, nothing in H8\n");
							f.displayFrame();
						}
						else{
							System.out.println("\nTesting insertOnBoard():\n");
							b.insertOnBoard(word2, startingCoordinate2, axis2, f);
							b.displayBoard();
						}
					
					/*
					 * Testing the isPlacedInBoard() method.
					 */
						f.refillFrame(newPool);
						s=f.displayFrame();
						String word4  = Character.toString(s.charAt(1)) + Character.toString(s.charAt(5));
						String startingCoordinate4 = "D20";
						String axis4  = "vertical";
							if(!b.isPlacedInBoard(word4, startingCoordinate4, axis4)){
								
								System.out.println("\nTesting isPlacedinBoard():\nError, not placed in board");
								f.displayFrame();
							}
							else{
								System.out.println("Testing insertOnBoard():\n");
								b.insertOnBoard(word4, startingCoordinate4, axis4, f);
								b.displayBoard();
							}
						System.out.println("Expected: Error, not placed in board\n\n");
						
					/*
					 * Testing the checkWordIsLegal() method.
					 */
						f.refillFrame(newPool);
						s=f.displayFrame();
						String word1  = Character.toString(s.charAt(1)) + Character.toString(s.charAt(5));
						String startingCoordinate1 = "B4";
						String axis1  = "vertical";
							if(!b.checkWordIsLegal(word1, startingCoordinate1, axis1)){
								
								System.out.println("Testing checkWordIsLegal():\nError, word not placed legally");
								f.displayFrame();
							}
							else{
								System.out.println("Testing insertOnBoard():\n");
								b.insertOnBoard(word, startingCoordinate, axis, f);
								b.displayBoard();
							}
						System.out.println("Expected: Error, word not placed legally\n\n");
						
						
			}
	}

