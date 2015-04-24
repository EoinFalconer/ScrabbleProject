import java.io.FileNotFoundException;


public class BotTest {
	public static void main(String[] args) throws RankOutOfBoundsException, ArrayIndexOutOfBoundsException, NullPointerException, VectorFullException, FileNotFoundException{
		Pool pool = new Pool();
		BotBoard board = new BotBoard();
		Bot botOne = new Bot();
		Bot botTwo = new Bot();
		BotFrame FrameOne = new BotFrame(botOne);
		BotFrame FrameTwo = new BotFrame(botTwo);
		boolean endGame = false;
		int gameController = 0;
		//insert game here.
		while(!endGame){
		if(gameController % 2 ==0){
			String wordToBeInserted = botOne.getCommand(board, FrameOne);
			String[] finalWord = wordToBeInserted.split(" ");
			//Format: score, word, sc, axis.
	
			board.insertOnBoard(finalWord[1], finalWord[2], finalWord[3], FrameOne);
			botOne.botScore = botOne.botScore + Integer.parseInt(finalWord[0]);
			gameController++;
		}
		else{
			String wordToBeInserted = botTwo.getCommand(board, FrameTwo);
			String[] finalWord = wordToBeInserted.split(" ");
			
			board.insertOnBoard(finalWord[1], finalWord[2], finalWord[3], FrameTwo);
			botTwo.botScore = botOne.botScore + Integer.parseInt(finalWord[0]);
			gameController++;
		}
		if(pool.size() <= 0){
			endGame = true;
		}
		}
			System.out.println("The Game is over");
			board.displayBoard();
		
	}
}