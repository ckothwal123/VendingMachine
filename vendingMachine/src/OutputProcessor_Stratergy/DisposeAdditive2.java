package OutputProcessor_Stratergy;
/*
 * DisposeAdditive2 Class implemented using DisposeAdditive interface
 * 
 */
import DataStore.DataStore;

public class DisposeAdditive2 implements DisposeAdditive {
	
	
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
	public void disposeAdditive(int[] A) {
		if(A[1]==1) {
			System.out.println("Cream added");
		}
		if(A[2]==1) {
			System.out.println("Sugar added");
		}
		
	}


}
