/*
 * Abstract Class for all States
 */
package States;

import OutputProcesser.OP;

public abstract class States {
	public abstract void activate();
	public abstract int get_ID();
	public abstract void start();
	public abstract void payCredit();
	public abstract void reject();
	public abstract void approved();
	public abstract void selectGas(int n);
	public abstract void startPump(); 
	public abstract void pumpUnit();
	public abstract void stopPump();
	public abstract void receipt();
	public abstract void noReceipt();
	public abstract void cancel();
	public abstract void payCash(); 
	public OP op=new OP();
}
