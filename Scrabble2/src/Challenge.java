import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 *  B’sWhyteFalcon
 *	Assignment 4 
 *	Ben Reynolds – 13309656
 *	Conor Whyte -   13324911
 *	Eoin Falconer -   13331016
 */



public class Challenge {

    
    
	public boolean CheckWord(String theWord, File theFile) throws FileNotFoundException {
		Scanner scanner = new Scanner(theFile);
		return (scanner.useDelimiter("\\Z").next()).contains(theWord);
	}
	
	
}
