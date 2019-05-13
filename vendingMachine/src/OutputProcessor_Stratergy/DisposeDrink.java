package OutputProcessor_Stratergy;
/*
 * DisposeDrink interface using strategy pattern for OutputProcessor 
 * 
 */
import DataStore.DataStore;

public interface DisposeDrink {
	
	public DataStore getDataStore(); 

	public void setDataStore(DataStore ds); 
	
	public void disposeDrink(int d);

}
