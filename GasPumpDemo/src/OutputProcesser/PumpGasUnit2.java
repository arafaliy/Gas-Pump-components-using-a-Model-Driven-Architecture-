/*
 * PumpGasUnit class to calculate pumped gas amount for GasPump-2
 */
package OutputProcesser;

import Datastore.DataStore;

public class PumpGasUnit2 extends PumpGasUnit {

	@Override
	/*Calculate total and G for GasPump2 in float
	 * (non-Javadoc)
	 * @see OutputProcesser.PumpGasUnit#pumpgasunit(Datastore.DataStore)
	 */
	public void pumpGasUnit(DataStore db) {
		db.setG(db.getG()+1);
		db.settotal(db.getpcf()*db.getG());
	}
}
