package InputProcessor;

import DataStore.DataStore;
import MDAEFSM.MDAEFSM;

public class vendingMachine2 {

	
	private MDAEFSM mda;
	private DataStore ds;
	
	
	// Constructor
	public vendingMachine2(MDAEFSM mda, DataStore ds) {
		this.mda = mda;
		this.ds = ds;
	}
	
	public void CREATE(float p) {
		ds.setFloatTemp_p(p);
		mda.create();
	}
	
	public void COIN(float v) {
		ds.setFloatTemp_v(v);
		if(ds.get_cf2()+v>=ds.get_price2())
			mda.coin(1);
		else 
			mda.coin(0);
	}
	
	
	public void SUGAR() {
		mda.additive(2);
	}
	
	public void CREAM() {
		mda.additive(1);
	}
	
	public void COFFEE() {
		mda.dispose_drink(1);
	}
	
	public void InsertCups(int n) {
		mda.insert_cups(n);
	}
	
	public void SetPrice(float p) {
		ds.setFloatTemp_p(p);
		mda.set_price();
	}
	
	public void CANCEL() {
		mda.cancel();
	}
}
