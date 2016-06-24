package OutputProcesser;

import Datastore.DataStore;

public class SetW1 extends SetW {

	@Override
	public void setW(DataStore db) {
		db.setw(db.gettw());
	}

}
