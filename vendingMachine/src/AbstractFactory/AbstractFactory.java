package AbstractFactory;
/*
 * Implements the abstract factory class for the vending machine factories
 * uses the abstract factory pattern to implement concrete factory classes
 * 
 */
import DataStore.*;
import OutputProcessor_Stratergy.*;

public interface AbstractFactory {
	
	
	DataStore getDataStore();
	
	StorePrice getStorePrice();
	
	ZeroCF getZeroCF();
	
	IncreaseCF getIncreaseCF();
	
	ReturnCoins getReturnCoins();
	
	DisposeDrink getDisposeDrink();
	
	DisposeAdditive getDisposeAdditive();
	

}
