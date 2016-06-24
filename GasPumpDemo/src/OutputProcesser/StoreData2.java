/*
 * StoreData for GasPump-2 & 3 in DataStorage 
 */
package OutputProcesser;


import Datastore.DataStore;

public class StoreData2 extends StoreData {

	/* Store data for GasPump-1 and 2 for Gas Prices
	 * (non-Javadoc)
	 * @see OutputProcesser.StoreData#datastore(Datastore.DataStore)
	 */
	public void datastore(DataStore db1) {
		float temp1=db1.gettemp_2a();
		float temp2=db1.gettemp_2b();
		db1.setprice_r(temp1);
		db1.setprice_s(temp2);;
	}
}
