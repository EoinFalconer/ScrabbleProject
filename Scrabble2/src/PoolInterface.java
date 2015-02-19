/*
 *  B’sWhyteFalcon
 *	Assignment  1
 *	Ben Reynolds – 13309656
 *	Conor Whyte -   13324911
 *	Eoin Falconer -   13331016
 *
 *  @author B'sWhyteFalcon
 */
public interface PoolInterface {
	
	public int size();
	public boolean isEmpty();
	public Tile tileAtRank(int rank) throws RankOutOfBoundsException;
    public Tile frameToPool(int rank, Tile element) throws RankOutOfBoundsException;
    public void insertAtRandom(Tile element) throws RankOutOfBoundsException, VectorFullException;
	public Tile removeTileAtRankFromPool(int rank) throws RankOutOfBoundsException;
	public void populateNewPool() throws RankOutOfBoundsException, VectorFullException;
		
}