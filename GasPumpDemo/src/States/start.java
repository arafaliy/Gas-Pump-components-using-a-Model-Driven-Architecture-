/*
 * Start state class
 */
package States;


public class start extends States {
 public final int ID=0;
	@Override
	public void activate() {
	   //System.out.println("In state start");
		op.storeData();
	}
	@Override
	public int get_ID() {
		return ID;
	}
	@Override
	public void start() {
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}
	@Override
	public void payCredit() {
		System.out.println("\n  Invalid State !"
							+"\n Please Select Appropiate operation... ");
	}
	@Override
	public void reject() {
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}
	@Override
	public void approved() {
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}
	@Override
	public void cancel() {
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}
	@Override
	public void payCash() {
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}
	
	@Override
	public void startPump() {
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}
	@Override
	public void selectGas(int n) {
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}
	@Override
	public void pumpUnit() {
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}
	@Override
	public void stopPump() {
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}
	@Override
	public void receipt() {
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}
	@Override
	public void noReceipt() {
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}
}
