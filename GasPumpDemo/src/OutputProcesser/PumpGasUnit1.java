/*
 * PumpGasUnit class to calculate pumped gas amount for GasPump-1
 */
package OutputProcesser;

import Datastore.DataStore;

public class PumpGasUnit1 extends PumpGasUnit{

	@Override
	/* Calculate G and total for GasPump-1 in integer
	 * (non-Javadoc)
	 * @see OutputProcesser.PumpGasUnit#pumpgasunit(Datastore.DataStore)
	 */
	public void pumpGasUnit(DataStore db) {
	  db.setG(db.getG()+1);
	  db.settotal(db.getpc()*db.getG());
	}
}
