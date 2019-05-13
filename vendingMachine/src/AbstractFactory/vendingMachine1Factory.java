package AbstractFactory;

/*
 * Concrete factory for VendingMachine1 that involves all
 * the output operations for the VendingMachine1
 * 
 * Concrete Class is implemented using the abstract factory pattern from AbstractFactory class
 * 
 */

import DataStore.*;
import OutputProcessor_Stratergy.*;

public class vendingMachine1Factory implements AbstractFactory {

	@Override
	public DataStore getDataStore() {
		// TODO Auto-generated method stub
		return new DS1();
	}

	@Override
	public StorePrice getStorePrice() {
		return new StorePrice1();
	}

	@Override
	public ZeroCF getZeroCF() {
		return new ZeroCF1();
		
	}

	@Override
	public IncreaseCF getIncreaseCF() {
		return new IncreaseCF1();
	}

	@Override
	public ReturnCoins getReturnCoins() {
		return new ReturnCoins1();
	}

	@Override
	public DisposeDrink getDisposeDrink() {
		return new DisposeDrink1();
	}

	@Override
	public DisposeAdditive getDisposeAdditive() {
		return new DisposeAdditive1();
	}

}
