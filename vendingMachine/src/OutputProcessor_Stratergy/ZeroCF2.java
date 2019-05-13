package OutputProcessor_Stratergy;
/*
 * ZeroCF2 Class implemented using ZeroCF interface
 * 
 */
import DataStore.DataStore;

public class ZeroCF2 implements ZeroCF {
	
	
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
	public void zeroCF() {
		
		ds.set_cf2(0);
		
	}
	

}
