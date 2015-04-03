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
	
	int controlGameFlow = 0;			// Variable to control all game flow.
	

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
	 
	 public String promptWhenSpacePlayed(String enteredWord){
		 System.out.println("Which letter would you like to use for your space character?");
		 String temp = in.next();
		 in.nextLine();
		 char tempChar = temp.charAt(0);
		 String newEnteredWord = "";
		 for(int i=0;i<enteredWord.length();i++){
			 if(enteredWord.charAt(i) == '$'){
				 newEnteredWord = newEnteredWord + tempChar;
			 }
			 else{
				 newEnteredWord = newEnteredWord + enteredWord.charAt(i);
			 }
		 }
		 System.out.println(newEnteredWord);
		 
		 return newEnteredWord;
	 }
	 
	 
	 public String promptChallenge(Player playerToBePrompted){
		 String answer = "";
		 System.out.println(playerToBePrompted.playerid + " would you like to challenge the word");
		 answer = in.next();
		 in.nextLine();
		 return answer;
	 }
	 public void resetTurn(){
		 controlGameFlow--;
	 }
	 
	 public String checkInput (String inputString) {		// checks whether player wants help, to quit, etc.
		 
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
						controlWhatHappens = "pass";
						controlGameFlow++;		
						break;
					case "EXCHANGE": 
						//take splitInput[1] and call replace frame
						controlWhatHappens = "exchange";	
						break;
					case "HELP":
						System.out.println("Inorder to Place on the board use the syntax: ABC-H8-Horizontal \n To Change letters in frame use Exchange-ABC. \n To end game write QUIT \n To pass round write PASS.");
						controlWhatHappens = "help";
						
						break;
					default:
						controlWhatHappens = "placeonboard";	
				}
				
		return controlWhatHappens;
	 }
	 
	 public String setName() {			// sets players names.
		 System.out.println("Whats your name player one?");
		 String name = in.nextLine();
		 return name;
	 }
	 
	 public String takeGenericInput(){			// takes in all input.
		 String inputString = "";
		 	System.out.println("What would you like to do?");
			 	inputString = in.nextLine(); 
		 return inputString;
	 }
	 
	 public String newGameMessage() {
		String message = "Welcome To B'sWhyteFalcons Scrabble Game. Enjoy Playing.";	
		 	return message; 
	 }
	 
	 public String displayScoreNameAndFrame(String name, int score, String frame) {		// displays Players score and Frame.
		 	String outputString = name + " your score : " + score + " and you currently have " + frame + " in your frame.";
		 return outputString;
	 }
	 
	 public Boolean InputValidationWhilePlacing(String a, String b, String c) {		//validates placing input.
			boolean flag = true;
				if((a==null) || (b==null) || (c==null)) {
					flag = false;
				}
			 return flag;
		 }
 
	 public Boolean InputValidationWhileExchanging(String a, String b) {			// validates exchange input
			boolean flag = true;
				if((a==null) || (b==null)) {
					flag = false;
				}
			return flag;
		 }

}
