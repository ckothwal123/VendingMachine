package MDAEFSM_States;
/*
 * coins_inserted State in State Pattern
 * 
 */
import MDAEFSM.MDAEFSM;
import OutputProcessor.OutputProcessor;

public class coins_inserted extends state {
	public coins_inserted(MDAEFSM  mda, OutputProcessor op) {
		this.mda = mda;
		this.op = op;
	}
	
	public void coin(int f) {
		op.ReturnCoins();
	}
	
	public void cancel() {
		op.ReturnCoins();
		op.ZeroCF();
		mda.ChangeState(2);
	}
	
	public void dispose_drink(int d) {
		int k = mda.k;
		
		if(k>1) {
			op.DisposeDrink(d);
			op.DisposeAdditive(mda.A);
			op.ZeroCF();
			k = k-1;
			mda.ChangeState(2);
		}
		else {
			op.DisposeDrink(d);
			op.DisposeAdditive(mda.A);
			mda.ChangeState(1);
		}
	}

	
	public void additive(int a) {
		
		if(mda.A[a]==0)
			mda.A[a]=1;
		else if(mda.A[a]==1)
			mda.A[a]=0;
			
	}

}
