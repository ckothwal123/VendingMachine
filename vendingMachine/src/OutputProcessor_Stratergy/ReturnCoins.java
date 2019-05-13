package OutputProcessor_Stratergy;

import DataStore.DataStore;

/*
 * ReturnCoins interface using strategy pattern for OutputProcessor 
 * 
 */

public interface ReturnCoins {
	// getter and setter methods for DataStore
	public DataStore getDataStore(); 

	public void setDataStore(DataStore ds); 
	
	public void returnCoins();

}
