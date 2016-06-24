/*
 * PumpGasUnit class to calculate pumped gas amount for GasPump-3
 */
package OutputProcesser;

import Datastore.DataStore;

public class PumpGasUnit3 extends PumpGasUnit{

	@Override
	/* Calculate total and L for GasPump3
	 * (non-Javadoc)
	 * @see OutputProcesser.PumpGasUnit#pumpgasunit(Datastore.DataStore)
	 */
	public void pumpGasUnit(DataStore db) {
	  db.setL(db.getL()+1);
	  db.settotal(db.getpcf()*db.getL());
	}
}
