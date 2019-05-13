package MDAEFSM_States;
/*
 * Start State in State Pattern
 * 
 */
import MDAEFSM.*;
import OutputProcessor.*;

public class start extends state{

	public start(MDAEFSM mda, OutputProcessor op) {
		this.mda = mda;
		this.op =op;
	}
	
	public void create() {
		
		op.StorePrices();
		mda.ChangeState(1);
		
	}
	
}
