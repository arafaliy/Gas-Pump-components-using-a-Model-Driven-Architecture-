/*
 * SetInitialValue class for GasPUmp-1 & 2 to set G
 */package OutputProcesser;

import Datastore.DataStore;

public class SetInitialValue1 extends SetInitialValue {

	@Override
	/*Set initial value is equal to 0 for G
	 * (non-Javadoc)
	 * @see OutputProcesser.SetInitialValue#setinvalue(Datastore.DataStore)
	 */
	public void setIniVal(DataStore db) {
		// TODO Auto-generated method stub
		db.setG(db.gettemp_G());
	}
}
