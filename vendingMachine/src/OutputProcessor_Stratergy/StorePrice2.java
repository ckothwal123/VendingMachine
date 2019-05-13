package OutputProcessor_Stratergy;

import DataStore.DataStore;

public class StorePrice2 implements StorePrice {
	
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
		
		float temp_price;
		temp_price = ds.getFloatTemp_p();
		ds.set_price2(temp_price);
		
	}
}
