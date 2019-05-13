package InputProcessor;

import DataStore.*;
import MDAEFSM.*;


public class vendingMachine1 {
	
	private MDAEFSM mda;
	private DataStore ds;
	
	
	// Constructor
	public vendingMachine1(MDAEFSM mda, DataStore ds) {
		this.mda = mda;
		this.ds = ds;
	}
	
	public void create(int p) {
		ds.setIntTemp_p(p);
		mda.create();
	}
	
	public void coin(int v) {
		ds.setIntTemp_v(v);
		if(ds.get_cf1()+v>=ds.get_price1())
			mda.coin(1);
		else 
			mda.coin(0);
	}
	
	public void card(float x) {
		if(x>=ds.get_price1()) {
			mda.card();
		}
	}
	
	public void sugar() {
		mda.additive(1);
	}
	
	public void tea() {
		mda.dispose_drink(1);
	}
	
	public void chocolate() {
		mda.dispose_drink(2);
	}
	
	public void insert_cups(int n) {
		mda.insert_cups(n);
	}
	
	public void set_price(int p) {
		ds.setIntTemp_p(p);
		mda.set_price();
	}
	
	public void cancel() {
		mda.cancel();
	}

}
