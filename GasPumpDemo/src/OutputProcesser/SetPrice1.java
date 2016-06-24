/*
 * SetPrice Class For GasPump-1
 */
package OutputProcesser;

import Datastore.DataStore;

public class SetPrice1 extends SetPrice{

	@Override
	/*Set price for gas in Gaspump1
	 * (non-Javadoc)
	 * @see OutputProcesser.SetPrice#setprice(int, Datastore.DataStore)
	 */
	public void setPrice(int n, DataStore db) {
		if(n==1) {
			db.setpc(db.getprice());
		}
	}
}
