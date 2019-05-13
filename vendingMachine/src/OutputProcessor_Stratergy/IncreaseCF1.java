package OutputProcessor_Stratergy;
/*
 * IncreaseCF1 Class implemented using IncreaseCF interface
 * 
 */
import DataStore.DataStore;

public class IncreaseCF1 implements IncreaseCF{

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
		
		int tempCF, CF;
		
		tempCF = ds.getIntTemp_v();
		CF = ds.get_cf1();
		ds.set_cf1(tempCF + CF);
		
	}
	
	

}
