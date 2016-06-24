/*
 * StoreCash for GasPump-3
 */
package OutputProcesser;

import Datastore.DataStore;


public class StoreCash2 extends StoreCash {

	@Override
	/*Store cash given during cash payment in float for GasPump-3
	 * (non-Javadoc)
	 * @see OutputProcesser.StoreCash#storecash(Datastore.DataStore)
	 */
	public void storeCash(DataStore db) {
		db.setc(db.gettemp_d());
	}
}
