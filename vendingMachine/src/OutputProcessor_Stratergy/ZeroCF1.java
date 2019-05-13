package OutputProcessor_Stratergy;
/*
 * ZeroCF1 Class implemented using ZeroCF interface
 * 
 */
import DataStore.DataStore;

public class ZeroCF1 implements ZeroCF {
	
	
	private DataStore ds;

	@Override
	public DataStore getDataStore() {
		return ds;
	}

	@Override
	public void setDataStore(DataStore ds) {
		this.ds = ds;
	}
	
	public void zeroCF() {
		ds.set_cf1(0);
		
	}
	
	

}
