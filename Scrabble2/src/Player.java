/*
 *  B’sWhyteFalcon
 *	Assignment  1
 *	Ben Reynolds – 13309656
 *	Conor Whyte -   13324911
 *	Eoin Falconer -   13331016
 */


import javax.swing.JOptionPane;


public class Player implements PlayerInterface  {
	private int playerScore;
	String playerid;
	
		public Player(String pname) {	
			
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
	


	public int addScore(int addscore) {		
		
			if(addscore > 0) {
				playerScore = playerScore + addscore;
			}
			
			else {
				System.out.println("Cant have negative number");
			}
		return playerScore;
	}

	
	public int getScore() {		
		return playerScore;
	}

	
	public void resetGame() {		
			playerid = null;
			playerScore = 0;
	}


	
	public String getName() {		
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
	public void addWordToScore(String enteredWord, Frame f, String startingCoordinate, String axis, Board b) throws RankOutOfBoundsException, NullPointerException{
		Tile temp = null;
		boolean isDword = false;
		boolean isTword = false;
		int immediateScore = 0;
		int tempLetter = Integer.valueOf(startingCoordinate.charAt(0));
		String temp6 = String.valueOf(startingCoordinate.charAt(1));
		int k=0;
		
		for(int i=0;i<enteredWord.length();i++){
			char letterKey = enteredWord.charAt(i);
			
			for(int j=0;j<f.frameSize();j++){
					temp = f.getTileRank(j);
				char tileName = ' ';
				if(temp != null){
					tileName = temp.tname;
				
				
				
				if(tileName == letterKey){
					if(axis.equalsIgnoreCase("horizontal")){
						temp.onSpecialSquare = (b.getSquareScore(startingCoordinate.charAt(0) + Integer.toString(k)));
						k++;
				}
					else{
							temp.onSpecialSquare = b.getSquareScore(Integer.toString(tempLetter) + temp6);
							tempLetter++;
						}
					
					if(temp.onSpecialSquare.equalsIgnoreCase("dletter")){
						playerScore = playerScore + (temp.score * 2);
						immediateScore = immediateScore + (temp.score *2);
					}
					else if(temp.onSpecialSquare.equalsIgnoreCase("tletter")){
						playerScore = playerScore + (temp.score * 3);
						immediateScore = immediateScore + (temp.score *3);
					}
					else if(temp.onSpecialSquare.equalsIgnoreCase("dword")){
						isDword = true;
					}
					else if(temp.onSpecialSquare.equalsIgnoreCase("tword")){
						isTword = true;
					}
					else{
						playerScore = playerScore + temp.score;
					}
					f.removeFromFrame(letterKey);
				}
					
				}
			}	
		}
		if(isDword){
			playerScore = playerScore - immediateScore;
			playerScore = playerScore + (immediateScore*2);
		}
		else if(isTword){
			playerScore = playerScore - immediateScore;
			playerScore = playerScore + (immediateScore*3);
		}
		
		}
	
	
	}
	
