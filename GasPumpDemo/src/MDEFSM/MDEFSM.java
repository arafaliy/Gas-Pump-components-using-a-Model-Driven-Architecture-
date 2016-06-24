/*
 * MDEFSM class for whole system
 */
package MDEFSM;

import States.S0;
import States.S1;
import States.S2;
import States.S3;
import States.S4;
import States.S5;
import States.S6;
import States.States;
import States.start;

public class MDEFSM {
	States[] state;
	int id=0;
	/*
	 * Constructor for MDEFSM including all states
	 */
	public MDEFSM() {
		state=new States[8];
		state[0]=new start();
		state[1]=new S0();
		state[2]=new S1();
		state[3]=new S2();
		state[4]=new S3();
		state[5]=new S4();
		state[6]=new S5();
		state[7]=new S6();
	}
	
	public void activate() {   
		state[id].activate();
		if(state[id].get_ID()==0) {
			id=1;
		}
	}
	public void start() { 
		state[id].start();
		if(state[id].get_ID()==1) {
			id=2;
		}
	}
	public void change_Id(int id) {
		this.id=id;
	}
	public void pay_credit() {
		state[id].payCredit();
		if(state[id].get_ID()==2){
			id=3;
		}
	}
	public void pay_cash() {
		state[id].payCash();
		if(state[id].get_ID()==2) {
			id=4;
		}
	}
	public void reject() {
		state[id].reject();
		if(state[id].get_ID()==3){
			id=1;
		}
	}
	public void approved() {
		state[id].approved();
		if(state[id].get_ID()==3) {
			id=4;
		}
	}
	public void cancel_msg() {
		state[id].cancel();
		if(state[id].get_ID()==4) {
			id=1;
		}
	}
	public void select_gas(int i) {
		state[id].selectGas(i);
		if(state[id].get_ID()==4) { 
			id=5;
		}
	}
	public void start_pump() {
		state[id].startPump();
		if(state[id].get_ID()==5) { 
			id=6;
		}	
	}
	public void pump_unite() {
		state[id].pumpUnit();
		if(state[id].get_ID()==6) { 
			id=6;
		}
	}

	public void stop_pump() {
		state[id].stopPump();
		if(state[id].get_ID()==6) { 
			id=7;
		}	
	}
	public void receipt() {
		state[id].receipt();
		if(state[id].get_ID()==7) { 
			id=1;
		}
	}
	public void no_receipt() {     
		state[id].noReceipt();
		if(state[id].get_ID()==7) { 
			id=1;
		}
	}
}
