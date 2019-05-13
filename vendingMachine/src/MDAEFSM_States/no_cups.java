package MDAEFSM_States;
/*
 * no_cups in State Pattern
 */

import MDAEFSM.*;
import OutputProcessor.*;

public class no_cups extends state{

	public no_cups(MDAEFSM mda, OutputProcessor op) {
		this.mda = mda;
		this.op =op;
	}
	
	public void insert_cups(int n) {
		if(n>0) {
			mda.k = n;
			op.ZeroCF();
			mda.ChangeState(2);
			
		}		
	}
	
	public void coin(int f) {
		
		 op.ReturnCoins();
	}
	
}
