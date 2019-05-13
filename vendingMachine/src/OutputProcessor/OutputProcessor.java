package OutputProcessor;
/*
 * Implemented using the outputProcessor and MDAEFSM actions using  strategy Pattern
 * 
 */
import AbstractFactory.*;
import DataStore.*;
import OutputProcessor_Stratergy.*;

public class OutputProcessor {
	
	private DataStore ds;
	private AbstractFactory af;
	
	private StorePrice storePrice;
	private ReturnCoins returnCoins;
	private IncreaseCF increaseCF;
	private ZeroCF zeroCF;
	private DisposeDrink disposeDrink;
	private DisposeAdditive disposeAdditive;
	
	public OutputProcessor(AbstractFactory af, DataStore ds) {
		this.af = af;
		this.ds = ds;

		// Initialize Abstract Factory class
		storePrice = af.getStorePrice();
		returnCoins = af.getReturnCoins();
		increaseCF = af.getIncreaseCF();
		zeroCF = af.getZeroCF();
		disposeDrink = af.getDisposeDrink();
		disposeAdditive = af.getDisposeAdditive();
	}
	
	
	public void StorePrices() {
		storePrice.setDataStore(ds);
		storePrice.storePrice();
	}
	
	public void ReturnCoins() {
		returnCoins.setDataStore(ds);
		returnCoins.returnCoins();
	}
	
	public void IncreaseCF() {
		increaseCF.setDataStore(ds);
		increaseCF.increaseCF();
	}
	
	public void ZeroCF() {
		zeroCF.setDataStore(ds);
		zeroCF.zeroCF();
	}
	
	public void DisposeDrink(int d) {
		disposeDrink.setDataStore(ds);
		disposeDrink.disposeDrink(d);
	}

	public void DisposeAdditive(int[] a) {
		disposeAdditive.setDataStore(ds);
		disposeAdditive.disposeAdditive(a);
	}
	
	// getter and setter methods
	public DataStore getDataStore() {
		return ds;
	}

	public void setDataStore(DataStore ds) {
		this.ds = ds;
	}

	public AbstractFactory getAbstractFactory() {
		return af;
	}

	public void setAbstractFactory(AbstractFactory af) {
		this.af = af;
	}
}
