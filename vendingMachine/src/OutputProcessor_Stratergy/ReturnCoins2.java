package OutputProcessor_Stratergy;
/*
 * ReturnCoins2 Class implemented using ReturnCoins interface
 * 
 */
import DataStore.DataStore;

public class ReturnCoins2 implements ReturnCoins {
	
	private DataStore ds;

	@Override
	public DataStore getDataStore() {
		return ds;
	}

	@Override
	public void setDataStore(DataStore ds) {
		this.ds = ds;
	}
	

	@Override
	public void returnCoins() {
		
		System.out.println("Remove Coins" );
		
		
	}

}