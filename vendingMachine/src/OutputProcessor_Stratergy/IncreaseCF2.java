package OutputProcessor_Stratergy;
/*
 * IncreaseCF2 Class implemented using IncreaseCF interface
 * 
 */
import DataStore.DataStore;

public class IncreaseCF2 implements IncreaseCF {
	
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
	public void increaseCF() {
		
		float tempCF, CF;
		tempCF = ds.getFloatTemp_v();
		CF = ds.get_cf2();
		ds.set_cf2(tempCF + CF);
		
		
	}
	

}
