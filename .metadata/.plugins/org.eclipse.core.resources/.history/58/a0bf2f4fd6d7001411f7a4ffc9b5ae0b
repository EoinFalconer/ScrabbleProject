/*
 *  B’sWhyteFalcon
 *	Assignment  1
 *	Ben Reynolds – 13309656
 *	Conor Whyte -   13324911
 *	Eoin Falconer -   13331016
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;
import java.net.*;
import java.io.InputStreamReader;

public class ReadInFromFile {
	
	private Integer[] indexArray;
	private String[] initialStringArrayOfCharacters = new String[500];
    private String[] initialStringArrayOfTileValues = new String[500];
    private char[] arrayOfLetters = new char[500] ; 
    private int[] arrayOfTileValues = new int[500] ;
	
    public void copyFile(String sourceFileName, String sourceNumFile) 
    	{ 
			 
			 URL lettersURL = null;
			 URL numbersURL = null;
					try 
					{
						lettersURL = new URL("http://breynolds.netsoc.com/abc.txt");
						numbersURL = new URL("http://breynolds.netsoc.com/123.txt");
					} 
					catch (MalformedURLException e1) 
					{
						e1.printStackTrace();
					}
			  
			 /*
			  * Creating the bufferedreader and the reading in
			  * the characters and the integers. 
			  */
		      BufferedReader br = null;
		      BufferedReader b2 = null ;
		      try 
		      {
		          
		    	  br = new BufferedReader(new InputStreamReader(lettersURL.openStream()));
		          b2 = new BufferedReader(new InputStreamReader( numbersURL.openStream() ));
		          
		    	  
		          String line;
		          int i = 0 ; 
		          
		          while ((line = br.readLine() ) != null) 
		          {
		        	 initialStringArrayOfCharacters[i] = line; 
		        	 i++;
		          }
		          
		          	br.close();
		         
			          for(int w = 0;w<100;w++)
			          {
			        	  arrayOfLetters[w] = initialStringArrayOfCharacters[w].charAt(0);
			          }
		         
		          /*
		           *  Reads in the string<int> then converts to int.
		           */
		          	
		          String line2;
		          int x = 0 ; 
		          
			          while ((line2 = b2.readLine() ) != null) 
			          {
			        	 initialStringArrayOfTileValues[x] = line2; 
			        	 x++;
			          }
		          
			          b2.close();
		          
		          for (int z = 0; z < initialStringArrayOfTileValues.length - 1; z++)
		          {
		        	  try
		        	  {
		                  arrayOfTileValues[z] = Integer.valueOf(initialStringArrayOfTileValues[z]); //converts to int
		        	  }
		        	  catch (NumberFormatException e){} 
		              } 
		          
		      }
		      catch (Exception e)
		      {
		    	  e.printStackTrace();
		      }
		      
		      
		      ArrayList<Integer> list = new ArrayList<Integer>();
		        for (int i=0; i<100; i++)
		        {
		            list.add(new Integer(i));
		        }
		        
		        Collections.shuffle(list);
		        indexArray = list.toArray(new Integer[list.size()]);
		                 
	}
		 
		 /*
		  * This array is then used to pick random things from
		  * the char array and then pushes them into a stack.
		  */
		 public Stack<Character> getStack1()
		 {
			 Stack<Character> Stack1 = new Stack<Character>() ;
			 for(int i=0; i<100; i++)
				 {
					 
					 int randNum = indexArray[i];
					 Stack1.push(arrayOfLetters[randNum]); 
				 }
			 
			 return Stack1;
		 }
		 
		 /*
		  * Same thing here with string to integer.
		  */
		 
		 public Stack<Integer> getStack2()
		 {
			 Stack<Integer> Stack2 = new Stack<Integer>();
				 for(int i = 0; i<100; i++)
				 {
					 int randNum = indexArray[i];
					 Stack2.push(arrayOfTileValues[randNum]);
				 }
			 return Stack2;
		 }
}

