
/*
 *  B’sWhyteFalcon
 *	Assignment  3
 *	Ben Reynolds – 13309656
 *	Conor Whyte -   13324911
 *	Eoin Falconer -   13331016
 */


public interface uiInterface {
	public String promptPlayer(Player playerOne, Player playerTwo);
	public void resetTurn();
	public String checkInput (String inputString);
	public String getName();
	public String takeGenericInput();
	public String newGameMessage();
	public String displayScoreNameAndFrame(String name, int score, String frame);
	
}