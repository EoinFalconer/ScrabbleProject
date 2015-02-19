/*
 *  B’sWhyteFalcon
 *	Assignment  1
 *	Ben Reynolds – 13309656
 *	Conor Whyte -   13324911
 *	Eoin Falconer -   13331016
 */


public interface FrameInterface {
	public int frameSize();
	public String displayFrame();
	public boolean isFrameEmpty();
	public Tile getTileRank(int rank) throws RankOutOfBoundsException;
	public Tile moveTileToPool(char c, Pool p) throws RankOutOfBoundsException, VectorFullException;
	public void refillFrame(Pool p) throws RankOutOfBoundsException, VectorFullException, NullPointerException;
	public void resetFrame(Pool p) throws ArrayIndexOutOfBoundsException, VectorFullException, RankOutOfBoundsException;
	
}