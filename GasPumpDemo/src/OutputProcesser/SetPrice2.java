/*
 * SetPrice Class For GasPump-2 & 3
 */
package OutputProcesser;

import Datastore.DataStore;

/*
 * Set price of selected gas type for GasPump2 and 3
 */
public class SetPrice2 extends SetPrice {

	@Override
	public void setPrice(int n, DataStore db) {
		if(n==1) {
			db.setpc(db.getprice_r());
		}
		else if(n==2) {
			db.setpc(db.getprice_s());
		}
	}
}
