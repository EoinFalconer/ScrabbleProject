import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Comparator;

/*
 * B's Whyte Falcon
 * 
 * Ben Reynolds - 13309656
 * Eoin Falconer - 13331016
 * Conor Whyte - 13324911
 * 
 */

public class Bot  {

	private Word word = new Word();
	private Word prevWord = new Word();
	private String letters;
	private int firstWord = 0;
	char bestSq = ' ';
	int bestTileiCoordinate = 0;
	int bestTilejCoordinate = 0;
	int exceptionsIterator = 0;
	String[] exceptions = new String[200];
	int numberOfExceptions = 0;
	int controlVertHor = 0;
	char[] notWantedChar = {'V','X','Z','W','J','Q','K','G','B','P','M','C','U','L','D','R','H','S','O','N','I','A','E','F','T','Y'};
	int numberOfLettersOnBoard = 0;
				
	Bot () {
		word.setWord(0, 0, Word.HORIZONTAL, "HELLO");
		letters = "";
	}
	
	
	public int getCommand (Player player, Board board, Dictionary dictionary) throws FileNotFoundException, ArrayIndexOutOfBoundsException {
		letters = "";
		int tempNumberOfLettersOnBoard = 0;
		for(int i=0;i<15;i++){
			for(int j=0;j<15;j++){
				if(board.getSqContents(i, j) != ' '){
					tempNumberOfLettersOnBoard++;
				}
			}
		}
			
		//	System.out.println("NUMBER OF EXCEPTIONS: " + numberOfExceptions);
		boolean endSearch = false;
		int numberOfLettersCount = 0;
		for(int j=0;(j<notWantedChar.length-1)&&(numberOfLettersCount <= 1);j++){
			
			for(int k=0;(k<player.getFrame().size()-1)&&(numberOfLettersCount <= 1);k++){
				if(notWantedChar[j] == player.getFrame().getTile(k).getFace()){
					//System.out.println("Does " + notWantedChar[j] + " match " + player.getFrame().getTile(k).getFace());
					numberOfLettersCount++;
					letters = letters + player.getFrame().getTile(k).getFace();
					//System.out.println("FOUND LETTER");
					if(numberOfLettersCount == 2){
						endSearch = true;
						break;
					}
				}
			}
		}
		if(tempNumberOfLettersOnBoard > numberOfLettersOnBoard){
			for(int i=0; i<exceptions.length-1; i++) {
				exceptions[i] = "";
				numberOfExceptions = 0;
			}
			numberOfLettersOnBoard = tempNumberOfLettersOnBoard;
		}
		else if(numberOfExceptions > numberOfLettersOnBoard){
			for(int i=0; i<exceptions.length-1; i++) {
				exceptions[i] = "";
				numberOfExceptions = 0;
			}
			return UI.COMMAND_EXCHANGE;
		}
		
		long start = System.currentTimeMillis();
		ArrayList<String> permList = new ArrayList<String>();
		String frameString ="";
		int bestSqScore =0;
		for(int i=0;i<player.getFrame().size();i++){
			if(player.getFrame().getTile(i).getFace() != '*'){
				frameString = frameString + player.getFrame().getTile(i).getFace();
			}
			else{
				frameString = frameString + 'T';
			}
		}
		
		boolean letterCheck = false ; 
		
		for(int i=0; i<frameString.length(); i++) {
			for(int j = 0; j < notWantedChar.length-1; j++ ) {
				if(frameString.charAt(i) == notWantedChar[j]) {
					frameString = frameString.replaceFirst(Character.toString(frameString.charAt(i)), "");
					letterCheck = true ; 
					break;
				}
			}
			if(letterCheck = true){
				break ; 
			}
		}
		
		//System.out.println(frameString);
		
		if(!board.isFirstPlay()){
			for(int i=0;i<15;i++){
				for(int j=0;j<15;j++){
					if(board.getSqContents(i, j)!=' '){
						 Tile tempSq = new Tile(board.getSqContents(i, j)); 
						 if(bestSqScore < tempSq.getValue()){
							String tempString = Character.toString(tempSq.getFace()) + Integer.toString(i) + Integer.toString(j);
							boolean ifInExceptions = false;
								
								for(int l=0;l<numberOfExceptions-1;l++){
									if(tempString.equalsIgnoreCase(exceptions[l])){
										ifInExceptions = true;
										break;
									}
								}
								
								if(!ifInExceptions){
									bestSq = tempSq.getFace();
									bestSqScore = tempSq.getValue();
									bestTileiCoordinate = i;
									bestTilejCoordinate = j;
								}
							}
						}
					}
				}
			frameString = frameString + bestSq;
			numberOfExceptions++;
			exceptions[numberOfExceptions] = Character.toString(bestSq) + Integer.toString(bestTileiCoordinate) + Integer.toString(bestTilejCoordinate);
		}
					Set<String> s = this.generatePerm(frameString);
					String perms = s.toString();
					String[] overallArray = perms.split(", ");
					//System.out.println(frameString);
					overallArray[0] = overallArray[0].substring(1);
					overallArray[overallArray.length-1] = overallArray[overallArray.length-1].replaceAll("]", "");
					for(int i=0;i<overallArray.length-1;i++){
						permList.add(overallArray[i]);
					}
					int x=0;
					ArrayList<String> dictionaryPasser = new ArrayList<String>();
					while(x<7){
						for(int i=0;i<overallArray.length-1;i++){
							int w = permList.size()-1;
							if(overallArray[i].substring(x).length()>3){
								permList.add(overallArray[i].substring(x));
							}
						}
						x++;
				for(int i=0;i<permList.size()-1;i++){
					dictionaryPasser.add(permList.get(i));
					if(!dictionary.areWords(dictionaryPasser)){
						dictionaryPasser.remove(permList.get(i));
					}
				}
				long end = System.currentTimeMillis();
				//System.out.println(end-start);
			}
		
		
					Set<String> set = new HashSet<String>(dictionaryPasser);
					//System.out.println(set.toString());
					Word temp = this.findBestWord(set, board, player, dictionary);
					//System.out.println("BEST WORD: " + temp.getLetters());
					if(board.checkWord(temp, player.getFrame())==UI.WORD_OK) {
						if(temp!=null){
							word = temp;
							return UI.COMMAND_PLAY;
						}
						else{
							return UI.COMMAND_PASS;
						}
					}
					else if(board.checkWord(temp, player.getFrame())==UI.WORD_NO_CONNECTION) {
						return UI.COMMAND_PASS;
					}
					else if(board.checkWord(temp, player.getFrame())==UI.WORD_OUT_OF_BOUNDS) {
						return UI.COMMAND_PASS;
					}
					/*else if(word == null){
						return  UI.COMMAND_EXCHANGE;
					} 
					else if(board.checkWord(temp, player.getFrame())==UI.WORD_NO_LETTER_FROM_FRAME) {
						return UI.COMMAND_PASS;
					} */
					else {
						return UI.COMMAND_PLAY;
					}
		
		}
	public Word findBestWord(Set<String> set, Board board, Player player, Dictionary dictionary) {
		boolean WordCanBePlaced = false;
		ArrayList<String> bestList = new ArrayList<String>();
		bestList.addAll(set);
		String longestWord = " ";
		boolean notPlaced = true;
		int x = 0;
		int bestScore = 0;
		Word bestWordInQuestion = new Word();
		while(x<bestList.size()-1){
			bestList.remove(longestWord);
			longestWord = bestList.get(0);
			for(int i=0;i<bestList.size()-1;i++){
				if(longestWord.length() < bestList.get(i).length()){
					longestWord = bestList.get(i);
				}
			}
			
			int horVert = 1;
			Word tempWord = new Word();
			if(firstWord == 0 ){
					tempWord.setWord(board.CENTRE,board.CENTRE,0,longestWord);
					if(board.checkWord(tempWord, player.getFrame())==UI.WORD_OK){
						int tempScore = board.getTotalWordScore(tempWord);
						ArrayList<String> al = board.getWords();
						if(dictionary.areWords(al)){
							if(bestScore<board.getTotalWordScore(tempWord)){
								bestScore = board.getTotalWordScore(tempWord);
								bestWordInQuestion = tempWord;
								WordCanBePlaced = true;
							}
						}
					}
			}
			else{
				int[] arrayofIndexes = new int[10];
				int count = 0;
				for(int i=0;i<longestWord.length();i++){
					if(longestWord.charAt(i) == bestSq){
						arrayofIndexes[count] = i;
						count++;
					}
				}
				for(int counter = 0;counter<arrayofIndexes.length;counter++){
				for(int i=0;i<15;i++){	
					for(int j=0;j<15;j++){
						if(controlVertHor %2 == 0){
							int tempjCoordinate = bestTilejCoordinate - arrayofIndexes[counter];
							tempWord.setWord(bestTileiCoordinate ,tempjCoordinate , 1, longestWord);
						}
						if(controlVertHor %2 == 1){
							int tempiCoordinate = bestTileiCoordinate - arrayofIndexes[counter];
							tempWord.setWord( tempiCoordinate ,  bestTilejCoordinate , 0, longestWord);
						}
						if(board.checkWord(tempWord, player.getFrame()) == UI.WORD_OK){
							int tempScore = board.getTotalWordScore(tempWord);
							ArrayList<String> al = board.getWords();
							if(dictionary.areWords(al)){
								
								if(bestScore < board.getTotalWordScore(tempWord)){
									bestScore = board.getTotalWordScore(tempWord);
									bestWordInQuestion = tempWord;
									WordCanBePlaced = true;
								}
							}
							}
						}
					}
				
				}
				}
			x++;}
			
		controlVertHor++;
		firstWord++;
		exceptionsIterator++;
		prevWord = bestWordInQuestion;
		return bestWordInQuestion;
	}
	public  Word getWord () {
		// should not change
		return(word);
	}
		
	public  String getLetters () {
		// should not change
		return(letters);
	}
	public  Set<String> generatePerm(String input)
	{
	    Set<String> set = new HashSet<String>();
	    if (input == "")
	        return set;

	    Character a = input.charAt(0);

	    if (input.length() > 1)
	    {
	        input = input.substring(1);

	        Set<String> permSet = generatePerm(input);

	        for (String x : permSet)
	        {
	            for (int i = 0; i <= x.length(); i++)
	            {
	                set.add(x.substring(0, i) + a + x.substring(i));
	            }
	        }
	    }
	    else
	    {
	        set.add(a + "");
	    }
	    return set;
	}
}