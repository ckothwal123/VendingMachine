package OutputProcessor_Stratergy;
/*
 * DisposeDrink1 Class implemented using DisposeDrink interface
 * 
 */
import DataStore.DataStore;


public class DisposeDrink1 implements DisposeDrink {
	
	
	private DataStore ds;
	
	@Override
	public DataStore getDataStore() {
		
		return ds;
	}

	@Override
	public void setDataStore(DataStore ds) {
		this.ds = ds;
		
	}
	
	
	public void disposeDrink(int d) {
		
		if(d==1) {
			System.out.println("tea is disposed");
			
		}
		else if(d==2) {
			System.out.println("Chocolate is disposed");
		}
		
		
	}
	

}
