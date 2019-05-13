package AbstractFactory;

/*
 * Concrete factory for VendingMachine2 that involves all
 * the output operations for the VendingMachine2
 * 
 * Concrete Class is implemented using the abstract factory pattern from AbstractFactory class
 * 
 */

import DataStore.*;
import OutputProcessor_Stratergy.*;
 

public class vendingMachine2Factory implements AbstractFactory{
	
	
	@Override
	public DataStore getDataStore() {
		// TODO Auto-generated method stub
		return new DS2();
	}

	@Override
	public StorePrice getStorePrice() {
		return new StorePrice2();
	}

	@Override
	public ZeroCF getZeroCF() {
		return new ZeroCF2();
		
	}

	@Override
	public IncreaseCF getIncreaseCF() {
		return new IncreaseCF2();
	}

	@Override
	public ReturnCoins getReturnCoins() {
		return new ReturnCoins2();
	}

	@Override
	public DisposeDrink getDisposeDrink() {
		return new DisposeDrink2();
	}

	@Override
	public DisposeAdditive getDisposeAdditive() {
		return new DisposeAdditive2();
	}
	
	
	

}
