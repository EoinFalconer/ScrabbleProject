
/**
 * /*
 *  B’sWhyteFalcon
 *	Assignment  1
 *	Ben Reynolds – 13309656
 *	Conor Whyte -   13324911
 *	Eoin Falconer -   13331016
 *
 *  @author B'sWhyteFalcon
 */




public class Square implements SquareInterface {
    String squareScore = " "; // e.g. normal, double, triple
    String squareName = " "; //A1,A2,A3
    private boolean flag;
    int tileInSquareScore = 0;
    char tileInSquareValue;
    int i,j;
    
 

    public Square(int i2, int j2) {
		i = i2;
		j = j2;
	}


	public void getSquareName(String s) 
    {
        squareName = s;
    }
    
    
    public void getSquareScore(String s){
    	squareScore = s;
    }
    public String returnSquareName(){
    	return squareName;
    }
    
    public String returnSquareScore(){
    	return squareScore;
    }
    @Override
    public boolean isSquareEmpty() {
        if(flag == false){
        	return false;
        }
        else{
        	return true;
        }
    }
    public int calculateTileScore(Tile e){
    	int temp = 0;
    	if(squareScore == "tletter"){
    		temp = e.score * 3; 
    	}
    	return temp;
    }


	public void tileToSquareValues(Tile e) {
		tileInSquareScore = e.score;
		tileInSquareValue = e.tname;
		
	}
     
 
}