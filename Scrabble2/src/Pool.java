/*
 *  B’sWhyteFalcon
 *	Assignment  1
 *	Ben Reynolds – 13309656
 *	Conor Whyte -   13324911
 *	Eoin Falconer -   13331016
 */


import java.util.Random;
import java.util.Stack;



public class Pool implements PoolInterface{
	
	private int sizeOfPool; 
		private int initialSizeOfPool = 150; //size of array
			private Tile Vector[]; //the object
	
	
	
			public Pool(){
				
				Vector = new Tile[initialSizeOfPool]; 
					sizeOfPool = 0; 
			}

	
			public int size() {
				
				return sizeOfPool; 
			}

			public boolean isEmpty() {
				
				return sizeOfPool == 0; //returns n as 0
				
			}

			public Tile tileAtRank(int rank) throws RankOutOfBoundsException {
					
					if((rank<0)||(rank>sizeOfPool-1))
						{
					//		throw new RankOutOfBoundsException(); //throws exception if out of range
						}
						
					return Vector[rank]; 
				}	
				
		/*
		 * This put tiles from frame back into the pool
		 */
	 
			public Tile frameToPool(int rank, Tile e)			
					throws RankOutOfBoundsException {
				
							if((rank<0)||(rank>sizeOfPool-1))
							{
								throw new RankOutOfBoundsException(); 
							}
							int i=rank;
							while(i<sizeOfPool){
								Vector[i] = Vector[i+1];
							}
						
					e = Vector[rank]; //assigns element to position
						
				return e;
			}

			 /*
			  * Insert tiles into the pool at random.
			  */
				public void insertAtRandom(Tile e)
						throws RankOutOfBoundsException, VectorFullException {
					
					Random rn = new Random();
						int i = rn.nextInt(100 - 0 + 1) + 0;
							int z = 0;
					
							while((z>=i)&&(Vector[z]!=null)&&(z<=100))
							{
								Vector[z+1] = Vector[z]; //shift the vectors
									z++;
							}
						Vector[i] = e; //the desired element is slotted into its place
					sizeOfPool = sizeOfPool+1; 	
				}

	
			public Tile removeTileAtRankFromPool(int rank) throws RankOutOfBoundsException, ArrayIndexOutOfBoundsException {
						
						Tile e=null;
						
							if((rank<0)||(rank>sizeOfPool-1))
							{
								throw new RankOutOfBoundsException();
							}
							else
							{
								e = Vector[rank];
								Vector[rank] =null;
									int i = rank;
										while(i<sizeOfPool)
										{
											Vector[i] = Vector[i+1]; //shifting elements
												i++;
										}
									sizeOfPool = sizeOfPool-1;	
								return e;
							}
					}

					/*
					 * This will populate/reset a new pool. This will fill to
					 * all 100 elements which are needed.
					 */
	
						public void populateNewPool() throws RankOutOfBoundsException, VectorFullException{
							
							ReadInFromFile newpool = new ReadInFromFile(); //this makes a readinfromfile object
								newpool.copyFile("/Users/EoinFalconer/Documents/College/Stage 2/Semester One/Software Engineering Project/Scrabble/src/ConorPool/ConorPool/src/abc.txt","/Users/EoinFalconer/Documents/College/Stage 2/Semester One/Software Engineering Project/Scrabble/src/ConorPool/ConorPool/src/123.txt");
							
								//runs all the randomising stuff in the readinfromfile class
								Stack<Character> Stack1 = newpool.getStack1(); 		//gets the stack from readinfromfile using getstack1 method
									Stack<Integer> Stack2 = newpool.getStack2();		//similar for stack 2
							
							/*
							 * begins to load the tile's properties into the tile
							 * objects from the stacks. It then loads them into the arrayvector which
							 * we can access. This needs to be referenced to reset/start the game.
							 */
								for(int i=0;i<100;i++)
								{
									Tile temp = new Tile(Stack1.pop(), Stack2.pop()); 		
										Vector[i] = temp;
												//System.out.println(Vector[i].tname);
										sizeOfPool++; //size of the pool is increased.
								}
								
							
								
							}
						
				public void	resetPool() throws RankOutOfBoundsException, VectorFullException {
								
							for(int i=0; tileAtRank(i) != null; i++)
						  	{
						  			Vector[i] = null;
						  			sizeOfPool--; //size of the pool is decreased.
						  	}
							
							populateNewPool();
							
					}
}
