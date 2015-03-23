/**
 * /*
 *  B’sWhyteFalcon
 *	Assignment  2
 *	Ben Reynolds – 13309656
 *	Conor Whyte -   13324911
 *	Eoin Falconer -   13331016
 *
 *  @author B'sWhyteFalcon
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;


public class Board {
	
	private final int HORIZONTAL_INDEX=15;
    private final int VERTICAL_INDEX=15;
    private Square boardArray[][];
    private String[] arrayOfLines = new String[200];
    private String[] A = new String[500];
    @SuppressWarnings("unused")
	private String[] B = new String[500];
    private String[] C = new String[500];
    private String[] D = new String[500];
    private String[] E = new String[500];
    private String[] F = new String[500];
    private String[] G = new String[500];
    private String[] H = new String[500];
    private String[] I = new String[500];
    private String[] J = new String[500];
    private String[] K = new String[500];
    private String[] L = new String[500];
    private String[] M = new String[500];
    private String[] N = new String[500];
    private String[] O = new String[500];

    int i,j;
    public Board(){
        boardArray = new Square[HORIZONTAL_INDEX][VERTICAL_INDEX];
        for(i=0;i<HORIZONTAL_INDEX;i++) {
            for(j=0;j<VERTICAL_INDEX;j++) {
            	boardArray[i][j] = new Square(i,j); 
            } 
            }
    }
    public Boolean isEmpty(){
    	boolean flag = true;
    	for(int i=0;i<15;i++){
    		for(int j=0;j<15;j++){
    			if(boardArray[i][j].tileInSquareValue != ' '){
    				flag = true;
    				
    			}
    			else{
    				flag = false;
    				break;
    			}
    		}
    	}
    	return flag;
    }
	
    public void resestBoard(){
    	for (int i = 0 ; i<15 ; i++){
    		for (int j = 0 ; j<15 ; j++){
    			boardArray[i][j].tileInSquareValue = ' ' ; 
    			boardArray[i][j].tileInSquareScore = 0 ; 
    		}
    	}
    }
    
    public void populateBoard() throws NullPointerException {
    	 BufferedReader b1 = null;
    	 
    	 URL BoardURL = null;
				try {
					BoardURL = new URL("http://breynolds.netsoc.com/boardtxt.txt");
				} 
				catch (MalformedURLException e1) {
					e1.printStackTrace();
				}
		 try{
			 b1 = new BufferedReader(new InputStreamReader(BoardURL.openStream()));
			 
			 String line;
			 int i = 0;
			 
				 while (((line = b1.readLine() ) != null))  {
					 arrayOfLines[i] = line;
					 i++;
				 }
			 
			 b1.close();
			 
		 }catch (Exception e){
			  e.printStackTrace();
	      }
		 
		 int i = 0;
		    A = arrayOfLines[0].split(" ");
				for(i=0; i < 15; i++) {
					
					boardArray[0][i].getSquareName(A[i]);
					
					switch (i) {
						case 0: boardArray[0][i].getSquareScore("tw"); 
							break;
						case 3: boardArray[0][i].getSquareScore("dl");
							break;
						case 7: boardArray[0][i].getSquareScore("tw"); 
							break;
						case 11: boardArray[0][i].getSquareScore("dl");
							break;
					}
					
				}
			   
				String[] B = arrayOfLines[1].split(" ");
				for(i=0;i < 15;i++){
					boardArray[1][i].getSquareName(B[i]);
					
						switch (i) {
							case 1: boardArray[1][i].getSquareScore("dw"); 
								break;
							case 5: boardArray[1][i].getSquareScore("tl");
								break;
							case 9: boardArray[1][i].getSquareScore("tl"); 
								break;
							case 13: boardArray[1][i].getSquareScore("dw");
								break;
						}
				}
				
				 C = arrayOfLines[2].split(" ");
				for(i=0;i < 15;i++){
					boardArray[2][i].getSquareName(C[i]);
	
					switch (i) {
						case 2: boardArray[2][i].getSquareScore("dw"); 
							break;
						case 6: boardArray[2][i].getSquareScore("dl");
							break;
						case 8: boardArray[2][i].getSquareScore("dl"); 
							break;
						case 12: boardArray[2][i].getSquareScore("dw");
							break;
					}
				}
				
				D = arrayOfLines[3].split(" ");
				for(i=0;i < 15;i++){
					boardArray[3][i].getSquareName(D[i]);
				
					switch (i) {
						case 0: boardArray[3][i].getSquareScore("dl"); 
							break;
						case 7: boardArray[3][i].getSquareScore("dl");
							break;
						case 14: boardArray[3][i].getSquareScore("dl"); 
							break;
						case 3: boardArray[3][i].getSquareScore("dw");
							break;
						case 11: boardArray[3][i].getSquareScore("dw");
							break;
					}
				}
				
				E = arrayOfLines[4].split(" ");
				for(i=0;i < 15;i++){
					 boardArray[4][i].getSquareName(E[i]);
					
					 switch (i) {
						case 4: boardArray[4][i].getSquareScore("dw"); 
							break;
						case 10: boardArray[4][i].getSquareScore("dw");
							break;
					}
					
				}
				
				F = arrayOfLines[5].split(" ");
				for(i=0;i < 15;i++){
					 boardArray[5][i].getSquareName(F[i]);
					
					switch (i) {
						case 1: boardArray[5][i].getSquareScore("tl"); 
							break;
						case 5: boardArray[5][i].getSquareScore("tl");
							break;
						case 9: boardArray[5][i].getSquareScore("tl"); 
							break;
						case 13: boardArray[5][i].getSquareScore("tl");
							break;
					}
				}
				
				G = arrayOfLines[6].split(" ");
				for(i=0;i < 15;i++){
					boardArray[6][i].getSquareName(G[i]); //2 6 8 12
					
					switch (i) {
						case 2: boardArray[6][i].getSquareScore("dl"); 
							break;
						case 6: boardArray[6][i].getSquareScore("dl"); 
							break;
						case 8: boardArray[6][i].getSquareScore("dl"); 
							break;
						case 12: boardArray[6][i].getSquareScore("dl"); 
							break;
					}
				}
				
				 H = arrayOfLines[7].split(" ");
				for(i=0;i < 15;i++){
					boardArray[7][i].getSquareName(H[i]);
					switch(i) {
						case 0: boardArray[7][i].getSquareScore("tw"); 
							break;
						case 14: boardArray[7][i].getSquareScore("tw"); 
							break;
						case 3: boardArray[7][i].getSquareScore("dl"); 
							break;
						case 11: boardArray[7][i].getSquareScore("dl"); 
							break;
						case 7: boardArray[7][i].getSquareScore("*"); 
							break;
					}
				}
					
				 I = arrayOfLines[8].split(" ");
				for( i=0;i < 15;i++){
					boardArray[8][i].getSquareName(I[i]);
					switch (i) {
						case 2: boardArray[8][i].getSquareScore("dl"); 
							break;
						case 6: boardArray[8][i].getSquareScore("dl"); 
							break;
						case 8: boardArray[8][i].getSquareScore("dl"); 
							break;
						case 12: boardArray[8][i].getSquareScore("dl"); 
							break;
					}
				}
				 J = arrayOfLines[9].split(" ");
				for(i=0;i < 15;i++){
					boardArray[9][i].getSquareName(J[i]);
					switch (i) {
					case 1: boardArray[9][i].getSquareScore("tl"); 
						break;
					case 5: boardArray[9][i].getSquareScore("tl");
						break;
					case 9: boardArray[9][i].getSquareScore("tl"); 
						break;
					case 13: boardArray[9][i].getSquareScore("tl");
						break;
				}
				}
				 K = arrayOfLines[10].split(" ");
				for(i=0;i < 15;i++){
					boardArray[10][i].getSquareName(K[i]);
					switch (i) {
						case 4: boardArray[10][i].getSquareScore("dw"); 
							break;
						case 10: boardArray[10][i].getSquareScore("dw");
							break;
					}
				}
				 L = arrayOfLines[11].split(" ");
				for(i=0;i < 15;i++){
					 boardArray[11][i].getSquareName(L[i]);
					 switch (i) {
						case 0: boardArray[11][i].getSquareScore("dl"); 
							break;
						case 7: boardArray[11][i].getSquareScore("dl");
							break;
						case 14: boardArray[11][i].getSquareScore("dl"); 
							break;
						case 3: boardArray[11][i].getSquareScore("dw");
							break;
						case 11: boardArray[11][i].getSquareScore("dw");
							break;
					}
				}
				 M = arrayOfLines[12].split(" ");
				for(i=0;i < 15;i++){
					boardArray[12][i].getSquareName(M[i]);
					switch (i) {
						case 2: boardArray[12][i].getSquareScore("dw"); 
							break;
						case 6: boardArray[12][i].getSquareScore("dl");
							break;
						case 8: boardArray[12][i].getSquareScore("dl"); 
							break;
						case 12: boardArray[12][i].getSquareScore("dw");
							break;
					}
				}
				 N = arrayOfLines[13].split(" ");
				for(i=0;i < 15;i++){
					 boardArray[13][i].getSquareName(N[i]);
					 switch (i) {
						case 1: boardArray[13][i].getSquareScore("dw"); 
							break;
						case 5: boardArray[13][i].getSquareScore("tl");
							break;
						case 9: boardArray[13][i].getSquareScore("tl"); 
							break;
						case 13: boardArray[13][i].getSquareScore("dw");
							break;
					}
				}
				 O = arrayOfLines[14].split(" ");
				for(i=0;i < 15;i++){
					 boardArray[14][i].getSquareName(O[i]);
					 switch (i) {
						case 0: boardArray[14][i].getSquareScore("tw"); 
							break;
						case 3: boardArray[14][i].getSquareScore("dl");
							break;
						case 7: boardArray[14][i].getSquareScore("tw"); 
							break;
						case 11: boardArray[14][i].getSquareScore("dl");
							break;
					}
				}
			
    }
    
    public boolean isPlacedInBoard(String word, String startingCoordinate, String axis){
    	int startingrowCoordinate=-1;
    	int startingcolumnCoordinate= -1;
    	@SuppressWarnings("unused")
		boolean flag1=false,flag2=true;
    	
	    	for(int i=0;i<15;i++){
	    		for(int j=0;j<15;j++){
	    			if(boardArray[i][j].squareName.equalsIgnoreCase(startingCoordinate)){
	    					startingrowCoordinate = i;
	    					startingcolumnCoordinate =j;
	    			}
	    		}
	    	}
	    	
		    	if((startingrowCoordinate == -1) || (startingcolumnCoordinate == -1)){
					flag1 =false;
					return false;
				}
		    	else{
	  	    		flag1 = true;

					if(axis.equalsIgnoreCase("vertical")){
						if(startingrowCoordinate + (word.length()-1) >=15){
							flag2 = false;
						}
					}
				else if(axis.equalsIgnoreCase("horizontal")){
					if(startingcolumnCoordinate + (word.length()-1) >= 15){
						flag2 = false;
					}
				}
				else{
					flag1 =true;
				}
    	}
    	
				if((flag1=true)||(flag2=true)){
			    		return true;
			    	}
			    	else{
			    		return false;
			    	}
			    }
    
    public void displayBoard() throws NullPointerException {
    System.out.println("    1  2  3  4  5  6  7  8  9  10 11 12 13 14 15\n");
	System.out.print("A   ");
    	for(int i=0; i < 15;i++){
    		
    		if(boardArray[0][i].tileInSquareScore != 0){
    			System.out.print(" " + boardArray[0][i].tileInSquareValue + " ");
    		}
    		else if(boardArray[0][i].returnSquareScore() != " "){
			System.out.print(boardArray[0][i].returnSquareScore() + " ");
    		}
    		
    		else {
    			System.out.print("   ");
    		}
		}
    	System.out.print("  A");
    	
    	System.out.println();
    	System.out.print("B   ");
    	for(int i=0; i < 15;i++){
    		if(boardArray[1][i].tileInSquareScore != 0){
    			System.out.print(" " + boardArray[1][i].tileInSquareValue + " ");
    		}
    		else if(boardArray[1][i].returnSquareScore() != " "){
			System.out.print(boardArray[1][i].returnSquareScore() + " ");
    		}
    		
    		else {
    			System.out.print("   ");
    		}
    		}
    	System.out.print("  B");
    	System.out.println();
    	System.out.print("C   ");
    	for(int i=0; i < 15;i++){
    		if(boardArray[2][i].tileInSquareScore != 0){
    			System.out.print(" " + boardArray[2][i].tileInSquareValue + " ");
    		}
    		else if(boardArray[2][i].returnSquareScore() != " "){
			System.out.print(boardArray[2][i].returnSquareScore()  + " ");
    		}
    		
    		else {
    			System.out.print("   ");
    		}
    		}
    	System.out.print("  C");
    	
    	
    	System.out.println();
    	System.out.print("D   ");
    	for(int i=0; i < 15;i++){
    		if(boardArray[3][i].tileInSquareScore != 0){
    			System.out.print(" " + boardArray[3][i].tileInSquareValue + " ");
    		}
    		else if(boardArray[3][i].returnSquareScore() != " "){
			System.out.print(boardArray[3][i].returnSquareScore() + " ");
    		}
    		
    		else {
    			System.out.print("   ");
    		}
    		}
    	System.out.print("  D");
    	
    	System.out.println();
    	System.out.print("E   ");
    	for(int i=0; i < 15;i++){
    		if(boardArray[4][i].tileInSquareScore != 0){
    			System.out.print(" " + boardArray[4][i].tileInSquareValue + " ");
    		}
    		else if(boardArray[4][i].returnSquareScore() != " "){
			System.out.print(boardArray[4][i].returnSquareScore() + " ");
    		}
    		
    		else {
    			System.out.print("   ");
    		}
    		}
    	System.out.print("  E");
    	
    	System.out.println();
    	System.out.print("F   ");
    	for(int i=0; i < 15;i++){
    		if(boardArray[5][i].tileInSquareScore != 0){
    			System.out.print(" " + boardArray[5][i].tileInSquareValue + " ");
    		}
    		else if(boardArray[5][i].returnSquareScore() != " "){
			System.out.print(boardArray[5][i].returnSquareScore() + " ");
    		}
    		
    		else {
    			System.out.print("   ");
    		}
    		}
    	System.out.print("  F");
    	
    	System.out.println();
    	System.out.print("G   ");
    	for(int i=0; i < 15;i++){
    		if(boardArray[6][i].tileInSquareScore != 0){
    			System.out.print(" " + boardArray[6][i].tileInSquareValue + " ");
    		}
    		else if(boardArray[6][i].returnSquareScore() != " "){
			System.out.print(boardArray[6][i].returnSquareScore() + " ");
    		}
    		
    		else {
    			System.out.print("   ");
    		}
    		}
    	System.out.print("  G");
    	
    	System.out.println();
    	System.out.print("H   ");
    	for(int i=0; i < 15;i++){
    		if(boardArray[7][i].tileInSquareScore != 0){
    			System.out.print(" " + boardArray[7][i].tileInSquareValue + " ");
    		}
    		else if(boardArray[7][i].returnSquareScore() != " "){
			System.out.print(boardArray[7][i].returnSquareScore() + " ");
    		}
    		
    		else {
    			System.out.print("   ");
    		}
    		}
    	System.out.print("  H");
    	
    	System.out.println();
    	System.out.print("I   ");
    	for(int i=0; i < 15;i++){
    		if(boardArray[8][i].tileInSquareScore != 0){
    			System.out.print(" " + boardArray[8][i].tileInSquareValue + " ");
    		}
    		else if(boardArray[8][i].returnSquareScore() != " "){
			System.out.print(boardArray[8][i].returnSquareScore() + " ");
    		}
    		
    		else {
    			System.out.print("   ");
    		}
    		}
    	
    	System.out.print("  I");
    	
    	System.out.println();
    	System.out.print("J   ");
    	for(int i=0; i < 15;i++){
    		if(boardArray[9][i].tileInSquareScore != 0){
    			System.out.print(" " + boardArray[9][i].tileInSquareValue + " ");
    		}
    		else if(boardArray[9][i].returnSquareScore() != " "){
			System.out.print(boardArray[9][i].returnSquareScore() + " ");
    		}
    		
    		else {
    			System.out.print("   ");
    		}
    		}
    	System.out.print("  J");
    	
    	System.out.println();
    	System.out.print("K   ");
    	for(int i=0; i < 15;i++){
    		if(boardArray[10][i].tileInSquareScore != 0){
    			System.out.print(" " + boardArray[10][i].tileInSquareValue + " ");
    		}
    		else if(boardArray[10][i].returnSquareScore() != " "){
			System.out.print(boardArray[10][i].returnSquareScore() + " ");
    		}
    		
    		else {
    			System.out.print("   ");
    		}
    		}
    	System.out.print("  K");
    	
    	System.out.println();
    	System.out.print("L   ");
    	for(int i=0; i < 15;i++){
    		if(boardArray[11][i].tileInSquareScore != 0){
    			System.out.print(" " + boardArray[11][i].tileInSquareValue + " ");
    		}
    		else if(boardArray[11][i].returnSquareScore() != " "){
			System.out.print(boardArray[11][i].returnSquareScore() + " ");
    		}
    		
    		else {
    			System.out.print("   ");
    		}
    		}
    	System.out.print("  L");
    	
    	System.out.println();
    	System.out.print("M   ");
    	for(int i=0; i < 15;i++){
    		if(boardArray[12][i].tileInSquareScore != 0){
    			System.out.print(" " + boardArray[12][i].tileInSquareValue + " ");
    		}
    		else if(boardArray[12][i].returnSquareScore() != " "){
			System.out.print(boardArray[12][i].returnSquareScore() + " ");
    		}
    		
    		else {
    			System.out.print("   ");
    		}
    		}
    	System.out.print("  M");
    	
    	System.out.println();
    	System.out.print("N   ");
    	for(int i=0; i < 15;i++){
    		if(boardArray[13][i].tileInSquareScore != 0){
    			System.out.print(" " + boardArray[13][i].tileInSquareValue + " ");
    		}
    		else if(boardArray[13][i].returnSquareScore() != " "){
			System.out.print(boardArray[13][i].returnSquareScore() + " ");
    		}
    		
    		else {
    			System.out.print("   ");
    		}
    		}
    	
    	System.out.print("  N");
    	
    	System.out.println();
    	System.out.print("O   ");
    	for(int i=0; i < 15;i++){
    		if(boardArray[14][i].tileInSquareScore != 0){
    			System.out.print(" " + boardArray[14][i].tileInSquareValue + " ");
    		}
    		else if(boardArray[14][i].returnSquareScore() != " "){
			System.out.print(boardArray[14][i].returnSquareScore() + " ");
    		}
    		
    		else {
    			System.out.print("   ");
    		}
    		}
    	System.out.print("  O");
    	System.out.println("\n\n    1  2  3  4  5  6  7  8  9  10 11 12 13 14 15");
    	
    	
    }
   
    public boolean firstWordInCentre(String chooseWord, String startingCoordinate, String axis){
    	boolean flag = false;
    	int rowCoordinate=0;
    	int columnCoordinate=0;
        
	    	for(int i=0;i<15;i++){
	    		for(int j=0;j<15;j++){
	    			if(boardArray[i][j].squareName.equalsIgnoreCase(startingCoordinate)){
	    				rowCoordinate = i;
	    				columnCoordinate = j;
	    				break;
	    			}
	    		}
	    	}
    	
	        for (int i=0; i < chooseWord.length(); i++) { // while elements in the array 
		        	if(axis.equalsIgnoreCase("horizontal")) {
		        			if((rowCoordinate == 7) && (columnCoordinate == 7)) { 
		        					flag = true;
		        					break;
		        				}
		        			columnCoordinate++;
		        	}
		        	
		        	else if(axis.equalsIgnoreCase("vertical")) {
	        			if((rowCoordinate == 7) && (columnCoordinate == 7)) { 
	        					flag = true;
	        					break;
	        				}
	        			rowCoordinate++;
	        	}
	        }
        
        return flag;
    }
    
    public String getSquareScore(String squareName){
    	String temp = "";
    	for(int i=0;i<15;i++){
    		for(int j=0;j<15;j++){
    			if(squareName.equalsIgnoreCase(boardArray[i][j].squareName)){
    				temp = boardArray[i][j].squareScore;
    			}
    		}
    	}
    	return temp;
    }
    
    public void insertOnBoard(String chooseWord, String startingCoordinate, String axis, Frame f) throws RankOutOfBoundsException, VectorFullException, ArrayIndexOutOfBoundsException, NullPointerException{
    	        int rCoordinate=0, cCoordinate=0;    
    	 
    	        for(int i=0;i<15;i++){
    	        	for(int j=0;j<15;j++){
    	        		if(boardArray[i][j].squareName.equalsIgnoreCase(startingCoordinate)){
    	        			rCoordinate = i;
    	        			cCoordinate = j;
    	        			break;
    	        		}
    	        	}
    	        }
    	      
    	        i = 0;
    	        char letterToBeInserted;
    	        for (int i=0; i < chooseWord.length(); i++) { // while elements in the array 
    	        	
    	        	letterToBeInserted = chooseWord.charAt(i);
	    	        	if(f.isTileInFrame(letterToBeInserted)) {  
	    	        		
	    	        		if(axis.equalsIgnoreCase("horizontal")) {		
	    	        			if(isSquareEmpty(rCoordinate, cCoordinate)){
		    	        			
		    	        			boardArray[rCoordinate][cCoordinate].tileInSquareValue = letterToBeInserted;
		    	        			boardArray[rCoordinate][cCoordinate].tileInSquareScore = f.getTileScore(letterToBeInserted);
		    	        			System.out.println(boardArray[rCoordinate][cCoordinate].tileInSquareScore);
		    	        			cCoordinate++;
		    	        		}
		    	        		
		    	        		else if(!isSquareEmpty(rCoordinate, cCoordinate)) {
		    	        			
		    	        			if(letterToBeInserted == boardArray[rCoordinate][cCoordinate].tileInSquareValue) {
		    	        				cCoordinate++;
		    	        			}
		    	        			
		    	        			else {
		    	        				//stop loop
		    	        				System.out.println("ONE BOY");
		    	        			}		    	   
		    	        		}
	    	        		}
	    	        		
	    	        		else if(axis.equalsIgnoreCase("vertical")) {
	    	        			
	    	        			if(isSquareEmpty(rCoordinate, cCoordinate)){
		    	        			
		    	        			boardArray[rCoordinate][cCoordinate].tileInSquareValue = letterToBeInserted;
		    	        			boardArray[rCoordinate][cCoordinate].tileInSquareScore = f.getTileScore(letterToBeInserted);
		    	        			System.out.println(boardArray[rCoordinate][cCoordinate].tileInSquareScore);

		    	        			rCoordinate++;
		    	        		}
		    	        		
		    	        		else if(!isSquareEmpty(rCoordinate, cCoordinate)) {
		    	        			
		    	        			if(letterToBeInserted == boardArray[rCoordinate][cCoordinate].tileInSquareValue) {
		    	        				rCoordinate++;
		    	        			}		
		    	        			else {
		    	        				//stop loop
		    	        				System.out.println("TWO BOY");
		    	        			}		    	   
		    	        		}
	    	        		}
	    	        	}
	    	        	
	    	        	else { 
		    	        		if(axis.equalsIgnoreCase("horizontal")) {
			    	        		if(isSquareEmpty(rCoordinate, cCoordinate)) {
			    	        			if(letterToBeInserted == boardArray[rCoordinate][cCoordinate].tileInSquareValue) {
			    	        				cCoordinate++;
			    	        			}
			    	        			else {
			    	        				//stop loop
			    	        				System.out.println("THREE BOY");
			    	        			}	    	   
			    	        		}
		    	        		}    	        		
		    	        		else if(axis.equalsIgnoreCase("vertical")) {
		    	        			if(isSquareEmpty(rCoordinate, cCoordinate)) {
			    	        			if(letterToBeInserted == boardArray[rCoordinate][cCoordinate].tileInSquareValue) {
			    	        				rCoordinate++;
			    	        			}
			    	        			
			    	        			else {
			    	        				//stop loop
			    	        				System.out.println("FOUR BOY");
			    	        			}
			    	        	}
		    	        	}	
	    	        	}  
    	        }
    	  }
    	               	               
    public boolean checkWordIsLegal(String chooseWord,String startingCoordinate, String axis) throws ArrayIndexOutOfBoundsException{
    		boolean flag = false;
    		int rowCoordinate=0,columnCoordinate=0;
   
	    		for(int i=0;i<15;i++){
	    			for(int j=0;j<15;j++){
	    				if(boardArray[i][j].squareName.equalsIgnoreCase(startingCoordinate)){
	    					rowCoordinate = i;
	    					columnCoordinate = j;
	    					break;	
	    				}
	    			}
	    		}
 	        
	 	        if(axis.equalsIgnoreCase("horizontal")) {
	 	        	for(int i=0; i < chooseWord.length(); i++ ) {
		 	        		if(i == 0) {
		 	        			// check rowCoordinate - 1 and + 1, columncordinate -1.
		 	        			if( (boardArray[rowCoordinate-1][columnCoordinate].tileInSquareValue != ' ') || (boardArray[rowCoordinate+1][columnCoordinate].tileInSquareValue != ' ') || (boardArray[rowCoordinate][columnCoordinate - 1].tileInSquareValue != ' ') )  {
		 	        				flag = true; 
		 	        				break;
		 	        			}
		 	        		}
		 	        		
		 	        		else if( (i>0) && (i < chooseWord.length()-1)) {
		 	        			if((boardArray[rowCoordinate-1][columnCoordinate].tileInSquareValue != ' ') || (boardArray[rowCoordinate+1][columnCoordinate].tileInSquareValue != ' ')) {
		 	        				flag = true;
		 	        				break;
		 	        			}
		 	        		}
		 	        		
		 	        		else if(i == chooseWord.length()-1)  {
		 	        			if( (boardArray[rowCoordinate-1][columnCoordinate].tileInSquareValue != ' ') || (boardArray[rowCoordinate+1][columnCoordinate].tileInSquareValue != ' ') || (boardArray[rowCoordinate][columnCoordinate + 1].tileInSquareValue != ' ') )  {
		 	        				flag = true;
		 	        				break;
		 	        			}
		 	        		}
	 	        		columnCoordinate++;
	 	        	}
	 	        }
 	        
 	        else if(axis.equalsIgnoreCase("vertical")) {
 	        	for(int i=0; i < chooseWord.length(); i++ ) {
 	        		if(i == 0) {
 	        			// check rowCoordinate - 1 and + 1, columncordinate -1.
 	        			if( (boardArray[rowCoordinate-1][columnCoordinate].tileInSquareValue != ' ') || (boardArray[rowCoordinate][columnCoordinate-1].tileInSquareValue != ' ') || (boardArray[rowCoordinate][columnCoordinate + 1].tileInSquareValue != ' ') )  {
 	        				flag = true; 
 	        				break;
 	        			}
 	        		}
 	        		
 	        		else if( (i>0) && (i < chooseWord.length()-1)) {
 	        			if((boardArray[rowCoordinate][columnCoordinate-1].tileInSquareValue != ' ') || (boardArray[rowCoordinate][columnCoordinate + 1].tileInSquareValue != ' ')) {
 	        				flag = true;
 	        				break;
 	        			}
 	        		}
 	        		
 	        		else if(i == chooseWord.length()-1)  {
 	        			if( (boardArray[rowCoordinate+1][columnCoordinate].tileInSquareValue != ' ') || (boardArray[rowCoordinate][columnCoordinate+1].tileInSquareValue != ' ') || (boardArray[rowCoordinate][columnCoordinate - 1].tileInSquareValue != ' ') )  {
 	        				flag = true;
 	        				break;
 	        			}
 	        		}
 	        		rowCoordinate++;
 	        	}
	        	
	        }
    		
    		
    		return flag;
    	  }
    
    public boolean isSquareEmpty( int i, int j){			
    	boolean flag ; 
		
			if ( boardArray[i][j].tileInSquareValue == ' '){
				flag = true ; 
			}	
			else {	
		    	flag = false ; 
			}
	
		return flag ; 
    }
}
