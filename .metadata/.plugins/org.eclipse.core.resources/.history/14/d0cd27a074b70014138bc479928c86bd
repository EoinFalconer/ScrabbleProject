/*
 *  B’sWhyteFalcon
 *	Assignment  1
 *	Ben Reynolds – 13309656
 *	Conor Whyte -   13324911
 *	Eoin Falconer -   13331016
 */

public class Frame implements FrameInterface {
	
	
	private int numberOfElements; 			//the amount of elements being used
	private int numOfElementsInFrame = 7; 	//size of array
	Tile arrayOfTiles[]; 					//the object
	private String personName;
	
	
		public Frame(Player p){
			
			arrayOfTiles = new Tile[numOfElementsInFrame];  //making array object of size N
			numberOfElements = 0;  					  //setting the used array objects to 0
			personName = p.playerid;
			
		}
	 
		public int frameSize() {
			return numberOfElements; 				  //returns n, discussed above
		}

	 
		public boolean isFrameEmpty() {
			return numberOfElements == 0; 			  //returns n as 0
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
										numberOfElements = numberOfElements+1; //iterate
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
	 
	public void removeAtRank(char c, Pool p) throws RankOutOfBoundsException, VectorFullException {
		
		Tile e;
			
			for(int i=0; i<7; i++){
				if(arrayOfTiles[i].tname == c)
					break;
					e = arrayOfTiles[i];
					p.insertAtRandom(e);
					numberOfElements = numberOfElements-1;
				}
		}
	
	
	public String displayFrame(){ 
			
			String frameString = "";
				frameString = "[" + String.valueOf(arrayOfTiles[0].tname);
					
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
}
