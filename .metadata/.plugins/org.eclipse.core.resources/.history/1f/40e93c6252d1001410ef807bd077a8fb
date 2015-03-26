import java.util.Scanner;

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

public class UI {
	
	Scanner in = new Scanner(System.in);
	
	int controlGameFlow = 0;
	
	 
	 
	 public String promptPlayer(Player playerOne, Player playerTwo) {  // post requisite, evenodd must be incremented in main after call.
		 String prompt ="";
		 int controlVariable = controlGameFlow % 2;
		 	
		 switch(controlVariable) {
		 	case 0:	
		 		prompt = playerOne.playerid + " it is your turn.";
		 		break;
		 	case 1:
		 		prompt = playerTwo.playerid + " it is your turn.";
		 		break;
		 }
		 
		 return prompt;
	 } 
	 public void resetTurn(){
		 controlGameFlow--;
	 }
	 
	 public String checkInput (String inputString) {
		 
		String splitInput[] = inputString.split(" ");
		String controlWhatHappens = "";
		
		switch(splitInput[0].toUpperCase()) {
			case "QUIT": 
					System.out.println("Thanks for playing.");
					System.exit(0);
					controlGameFlow++;	
				break;
			case "PASS":
				System.out.println("PASSED ROUND");
				controlGameFlow++;		
				break;
			case "EXCHANGE": 
				//take splitInput[1] and call replace frame
				controlWhatHappens = "exchange";	
				break;
			case "HELP":
				System.out.println("HELP MESSAGE \n");
				controlGameFlow++;
				break;
			default:
				controlWhatHappens = "placeonboard";
				//splitInput[0] = b.
				//split[1] is the axis
				//split[2] is the word
			
		} 
		return controlWhatHappens;
	 }
	 
	 public String getName() {
		 System.out.println("Whats your name player one?");
		 String name = in.next();
		 
		 return name;
		 
	 }
	 
	 public String takeGenericInput(){
		 System.out.println("What would you like to do?");
		 String inputString = in.next();
		 return inputString;
	 }
	 
	 public String newGameMessage() {
		String message = "Welcome To B'sWhyteFalcons Scrabble Game. Enjoy Playing.";
		 
		 return message;
		 
	 }
	 
	 public String displayScoreNameAndFrame(String name, int score, String frame) {
		 
		 String outputString = name + " your score : " + score + " and you currently have " + frame + " in your frame.";
		
		 return outputString;
	 }

}
