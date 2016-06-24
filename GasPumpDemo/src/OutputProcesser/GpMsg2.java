/*
 * GasPumpedMessage for GasPump-3 to show total GasPumped in Unites
 */
package OutputProcesser;

import Datastore.DataStore;

public class GpMsg2 extends GasPumpedMsg {

	@Override
	public void gasPumpedMsg(DataStore db) {
		System.out.println("\n"+db.getL()+" Liter Gas Pumped  " );
	}
}
