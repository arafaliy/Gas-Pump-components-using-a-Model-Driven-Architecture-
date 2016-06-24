/*
 * SetInitialValue class for GasPUmp-3 to set L
 */
package OutputProcesser;

import Datastore.DataStore;

public class SetInitialValue2 extends SetInitialValue {

	@Override
	/*set initial value equals to 0 for L
	 * (non-Javadoc)
	 * @see OutputProcesser.SetInitialValue#setinvalue(Datastore.DataStore)
	 */
	public void setIniVal(DataStore db) {
		db.setL(db.gettemp_L());
	}

}
