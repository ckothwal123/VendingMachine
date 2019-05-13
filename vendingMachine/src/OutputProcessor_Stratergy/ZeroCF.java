package OutputProcessor_Stratergy;

import DataStore.DataStore;

/*
 * ZeroCF interface using strategy pattern for OutputProcessor 
 * 
 */

public interface ZeroCF {
	// getter and setter methods for DataStore
	public DataStore getDataStore(); 

	public void setDataStore(DataStore ds); 
	
	public void zeroCF();

}
