/*
 * S5 state class
 */
package States;


public class S5 extends States{
public final int ID=6;
	@Override
	public void activate() {
		// TODO Auto-generated method stub
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}

	@Override
	public int get_ID() {
		// TODO Auto-generated method stub
		return ID;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}

	@Override
	public void payCredit() {
		// TODO Auto-generated method stub
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}

	@Override
	public void reject() {
		// TODO Auto-generated method stub
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}

	@Override
	public void approved() {
		// TODO Auto-generated method stub
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}

	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}

	@Override
	public void payCash() {
		// TODO Auto-generated method stub
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}

	@Override
	public void selectGas(int n) {
		// TODO Auto-generated method stub
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}

	@Override
	public void startPump() {
		// TODO Auto-generated method stub
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}

	@Override
	public void pumpUnit() {
		// TODO Auto-generated method stub
	op.pump_unit();
	op.gp_msg();
	}

	@Override
	public void stopPump() {
		// TODO Auto-generated method stub
	op.stop_msg();	
	}

	@Override
	public void receipt() {
		// TODO Auto-generated method stub
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}

	@Override
	public void noReceipt() {
		// TODO Auto-generated method stub
		System.out.println("\n  Invalid State !"
				+"\n Please Select Appropiate operation... ");
	}

}
