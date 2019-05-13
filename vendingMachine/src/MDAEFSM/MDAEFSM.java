package MDAEFSM;
/*
 * Contains all the MDAEFSM events()
 * Keeps track of all the states list implemented using the state pattern
 * 
 */
import MDAEFSM_States.*;
import OutputProcessor.*;

/* State pattern design is implemented. This class acts as an MDA-EFSM
 * for vending machine components VM-1 and VM-2
 */

public class MDAEFSM {
	
	private state s;
	private state[] LS;
	public int k = 0;
	public int A[];
	
	public MDAEFSM(OutputProcessor op) {
		
		// Keeps track of states 
		LS = new state[4];

		LS[0] = new start(this, op);
		LS[1] = new no_cups(this, op);
		LS[2] = new idle(this, op);
		LS[3] = new coins_inserted(this, op);
		

		s = LS[0]; //initialize to start state
	}

	// changes state from several state classes
	public void ChangeState(int state) {
		s = LS[state];
//		System.out.println("System State "+state);
	}
	
	public void create() {
		s.create();
	}
	
	public void insert_cups(int n) {
		s.insert_cups(n);
	}
	
	public void coin(int f) {
		s.coin(f);
	}
	
	public void card() {
		s.card();
	}
	
	public void cancel() {
		s.cancel();
	}
	
	public void set_price() {
		s.set_price();
	}
	
	public void dispose_drink(int d) {
		s.dispose_drink(d);
	}
	
	public void additive(int a) {
		s.additive(a);
	}
}
