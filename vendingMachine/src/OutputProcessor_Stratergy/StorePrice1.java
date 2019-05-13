package OutputProcessor_Stratergy;
/*
 * StorePrice1 Class implemented using StorePrice interface
 * 
 */
import DataStore.DataStore;

public class StorePrice1 implements StorePrice {
	
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
	public void storePrice() {
		
		int temp_price;
		temp_price = ds.getIntTemp_p();
		ds.set_price1(temp_price);
		
	}


}
