/*
 *  B’sWhyteFalcon
 *	Assignment  1
 *	Ben Reynolds – 13309656
 *	Conor Whyte -   13324911
 *	Eoin Falconer -   13331016
 */

public class Frame implements FrameInterface {
	
	
	private int numberOfElements; 			
	private int numOfElementsInFrame = 7; 	
	Tile arrayOfTiles[]; 					
	String personName;
	
	
		public Frame(Player p){
			
			arrayOfTiles = new Tile[numOfElementsInFrame];  
			numberOfElements = 0;  					  
			personName = p.playerid;
			
		}
	 
		public int frameSize() {
			return numberOfElements; 				 
		}

	 
		public boolean isFrameEmpty() {
			return numberOfElements == 0; 			  
		}
	
			
		public Tile getTileRank(int rank) throws RankOutOfBoundsException {
					
					if((rank<0)||(rank>numberOfElements-1)){
						
						throw new RankOutOfBoundsException();    //throws exception if out of range
					}
						
				return arrayOfTiles[rank]; 					 //returns the element at place of rank
			}

	
	    public Tile moveTileToPool(char c, Pool p)
			throws RankOutOfBoundsException, VectorFullException {
				
			Tile e = null;
				char cUpper = Character.toUpperCase(c);
					
					boolean flag = false;
						for(int i=0;i<7;i++){
							
							if (cUpper == arrayOfTiles[i].tname) {
								flag = true;
							}
							
						}
				
				if(flag == true) {
						
					for(int i=0; i<7; i++){
						if(arrayOfTiles[i].tname == cUpper){
							
							p.insertAtRandom(arrayOfTiles[i]);
								arrayOfTiles[i] = e;
									arrayOfTiles[i] = p.removeTileAtRankFromPool(0);
							break;
						}
						else{
							e = arrayOfTiles[i];
						}
					}
				}
				
				else {
					
					System.out.println("That letter is not in your frame.");
					// to do here: 
					// make it ask for a different letter.
				}
				
		return e;
	}
	
	 
	public void refillFrame(Pool p)
			throws RankOutOfBoundsException, VectorFullException, NullPointerException {
			for(int i=0;i<7;i++){
					Tile e = null;
						if(arrayOfTiles[i] == e){
							
							arrayOfTiles[i] = p.removeTileAtRankFromPool(0);
							
								if(numberOfElements == numOfElementsInFrame){
									throw new VectorFullException(); 
								}
									if(arrayOfTiles[i] != e){
										numberOfElements = numberOfElements+1; 
									}
						}
				}
			
		}
		
/*
 * These letters will need to be checked against Vector[i].tname
 * in order to see whether they match! The user can type in the
 * characters they wish to take out and this will. Remove them.
 * This should be coupled with the refillFrame() method.
 */
	
	
	public String displayFrame() throws NullPointerException{ 
			
			String frameString = "[";
				frameString = frameString + String.valueOf(arrayOfTiles[0].tname);
					
					for(int i=1;i<7;i++){
						frameString = frameString + "," + arrayOfTiles[i].tname;
					}
					
			frameString = frameString + "]";
		return frameString;
	}
	
	
		public void resetFrame(Pool p) throws ArrayIndexOutOfBoundsException, VectorFullException, RankOutOfBoundsException{
			Tile e = null;
				
			for(int i=6;i>=0;i--){
					
					p.insertAtRandom(arrayOfTiles[i]);
						arrayOfTiles[i] = e;
					numberOfElements--;
				}
			
		}
		
		public boolean isTileInFrame(char c) 
				throws RankOutOfBoundsException, 
					VectorFullException, NullPointerException, ArrayIndexOutOfBoundsException {
			
		
			  char cUpper = Character.toUpperCase(c);
			  boolean flag = false;
			  
				  for(int i=0; i < 7; i++){
						
					  if(arrayOfTiles[i] == null)  {
						// testing System.out.println("null");
						  continue;
						 
					  }
					 
					  else if (cUpper == arrayOfTiles[i].getName()) {
							flag = true;
							// testing System.out.println(cUpper + " " + arrayOfTiles[i].getName());
						}
						
					}
					
				return flag;
			
		}
		
		public int getTileScore(char c) {
			int score = 0;
			char cUpper = Character.toUpperCase(c);
			
			for(int i=0; i < 7; i++){
				
				  if(arrayOfTiles[i] == null)  {
					// testing System.out.println("null");
					  continue;
					 
				  }
				 
				  else if (cUpper == arrayOfTiles[i].getName()) {
						score = arrayOfTiles[i].score;
					}
					
				}
			
			return score;
		}
		
		
		public void removeFromFrame(char c) {

	    	Tile e = null;
	    	char cUpper = Character.toUpperCase(c);
	    																	
		    	
		    		for(int i=0; i<7;i++) {
		    			if(arrayOfTiles[i] == null)
		    			{
		    				continue;
		    			}
		    			else if(cUpper == arrayOfTiles[i].tname) {
				    		arrayOfTiles[i] = e;
				    		numberOfElements--;
				    		break;
		    			}
		    		}
		}
}
