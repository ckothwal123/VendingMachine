package MDAEFSM_States;
/*
 * Abstract class that implements all the states using the
 * State Pattern
 * 
 */
import MDAEFSM.*;
import OutputProcessor.OutputProcessor;

public abstract class state {
	
	MDAEFSM mda;
	OutputProcessor op;
	
	public void create() {
		
	}

	public void insert_cups(int n) {
		
	}
	
	public void coin(int f) {
		
	}
	
	public void card() {
		
	}
	
	public void cancel() {
		
	}
	
	public void set_price() {
		
	}
	
	public void dispose_drink(int d) {
		
	}
	
	public void additive(int a) {
		
	}
	
	// getter and setter methods
	public MDAEFSM getMDAEFSM() {
		return mda;
	}

	public void setMDAEFSM(MDAEFSM mda) {
		this.mda = mda;
	}

	public OutputProcessor getOp() {
		return op;
	}

	public void setOp(OutputProcessor op) {
		this.op = op;
	}
}
