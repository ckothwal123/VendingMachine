package OutputProcessor_Stratergy;

import DataStore.DataStore;

/*
 * Increase interface using strategy pattern for OutputProcessor 
 * 
 */
public interface IncreaseCF {
	
	public DataStore getDataStore(); 

	public void setDataStore(DataStore ds); 
	
	public void increaseCF();
}
