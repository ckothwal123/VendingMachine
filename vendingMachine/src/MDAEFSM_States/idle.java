package MDAEFSM_States;
/*
 * idle State in State Pattern
 * 
 */
import MDAEFSM.MDAEFSM;
import OutputProcessor.OutputProcessor;

public class idle extends state {
	
	public idle(MDAEFSM mda, OutputProcessor op) {
		this.mda = mda;
		this.op = op;
	}

	public void insert_cups(int n) {
		
		if(n>0) {
			int k = mda.k;
			mda.k = k + n;
	}
	}
	
	public void coin(int f) {
		if(f==0) {
			op.IncreaseCF();
		}
		
		else if (f==1) {
			op.IncreaseCF();
			mda.A = new int[5];
			mda.ChangeState(3);
		}
		
	}
	
	public void card() {
		op.ZeroCF();
		mda.A = new int[5];
		mda.ChangeState(3);
	}
	
	public void set_price() {
		op.StorePrices();
	}
	
}
