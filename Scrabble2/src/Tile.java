/*
 *  B’sWhyteFalcon
 *	Assignment  1
 *	Ben Reynolds – 13309656
 *	Conor Whyte -   13324911
 *	Eoin Falconer -   13331016
 */


public class Tile {
	char tname;
	int score;
	public Tile(char c, int d){
		tname = c;
		score = d;
	}
	
	char getName(){
		return tname;
	}
	
	public int getScore(){
		return score;
	}
	
	public boolean isEmpty(){
		if(tname == -1)
		{
			return true;
		}
		else if(score == 0)
		{
			return true;
		}
		else{
			return false;
		}
	}
}

