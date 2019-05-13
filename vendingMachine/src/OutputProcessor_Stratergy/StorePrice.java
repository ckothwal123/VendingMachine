package OutputProcessor_Stratergy;

import DataStore.DataStore;

/*
 * StorePrice interface using strategy pattern for OutputProcessor 
 * 
 */

public interface StorePrice {
	
	public DataStore getDataStore(); 

	public void setDataStore(DataStore ds); 
	
	public void storePrice();

}
