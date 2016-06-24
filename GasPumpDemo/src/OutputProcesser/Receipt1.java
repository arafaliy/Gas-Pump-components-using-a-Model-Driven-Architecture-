/*
 * Receipt Class for GasPump-1
 */
package OutputProcesser;

import Datastore.DataStore;

public class Receipt1 extends Receipt {

	@Override
	/*Print receipt for total value of gas pumped in integer for GasPump1
	 * (non-Javadoc)
	 * @see OutputProcesser.Receipt#printreceipt(Datastore.DataStore)
	 */
	public void printReceipt(DataStore db) {
		// TODO Auto-generated method stub
		System.out.println("\n Receipt : \n Total:  "+db.gettotal());
	}

}
