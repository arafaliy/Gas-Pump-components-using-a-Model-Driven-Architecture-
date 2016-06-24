/*
 * StoreData for GasPump-1 in DataStorage 
 */
package OutputProcesser;


import Datastore.DataStore;

public class StoreData1 extends StoreData {

	/*Store data for GasPump1
	 * (non-Javadoc)
	 * @see OutputProcesser.StoreData#datastore(Datastore.DataStore)
	 */
	public void datastore(DataStore db1) {
		int temp=db1.gettemp_a();
		db1.setprice(temp);
	}
}
