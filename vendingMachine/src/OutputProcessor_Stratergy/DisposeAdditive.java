package OutputProcessor_Stratergy;
/*
 * DisposeAdditive interface using strategy pattern for OutputProcessor 
 * 
 */
import DataStore.DataStore;

public interface DisposeAdditive {
	
	public DataStore getDataStore(); 

	public void setDataStore(DataStore ds); 
	
	public void disposeAdditive(int[] A);

}
