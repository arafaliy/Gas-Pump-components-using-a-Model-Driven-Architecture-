/*
 * Receipt Class for GasPump-2 & 3
 */
package OutputProcesser;

import Datastore.DataStore;

public class Receipt2 extends Receipt {

	@Override
	/*Print receipt for total value of gas pumped in float for gaspump-2 and 3
	 * (non-Javadoc)
	 * @see OutputProcesser.Receipt#printreceipt(Datastore.DataStore)
	 */
	public void printReceipt(DataStore db) {
		System.out.println("\n Receipt : \n Total:  "+db.gettotalf());
	}

}
