/*
 *  B’sWhyteFalcon
 *	Assignment  1
 *	Ben Reynolds – 13309656
 *	Conor Whyte -   13324911
 *	Eoin Falconer -   13331016
 */


import javax.swing.JOptionPane;


public class Player implements PlayerInterface {
	private int playerScore;
	String playerid;
	
		public Player(String pname) {		//constructor method
			
			if(pname.isEmpty()) {
				
				System.out.println("You must enter a name.");
					changeName();
					// ToDO:  need to prompt name again..
			}
			else {
				
				playerid = pname;
			}
			
		playerScore = 0;
	}
	


	public int addScore(int addscore) {		//adds a score 'addscore' to the player's score
		
			if(addscore > 0) {
				playerScore = playerScore + addscore;
			}
			
			else {
				System.out.println("Cant have negative number");
			}
		return playerScore;
	}

	
	public int getScore() {		//returns players score
		return playerScore;
	}

	
	public void resetGame() {		//resets the game.
		playerid = null;
			playerScore = 0;
	}


	
	public String getName() {		//returns the player name.
		return playerid;
	}
	
	public void changeName() {
		String x = JOptionPane.showInputDialog(null, "Enter Name:");
			if(x.isEmpty()){
				
				x = JOptionPane.showInputDialog(null, "Thats not a name, Enter Name:");
				playerid = x;
			}
			else {
			
				playerid = x;
			}
	}
	
	}
	

