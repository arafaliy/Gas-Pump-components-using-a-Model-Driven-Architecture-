/*
 * StoreCash for GasPump-1
 */
package OutputProcesser;

import Datastore.DataStore;


public class StoreCash1 extends StoreCash {

	@Override
	/*Store cash given during cash payment in integer for GasPump-1
	 * (non-Javadoc)
	 * @see OutputProcesser.StoreCash#storecash(Datastore.DataStore)
	 */
	public void storeCash(DataStore db) {
		db.setc(db.gettemp_c());
	}


}
