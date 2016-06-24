/*
 * AbstractFactory class for whole system
 */
package Factory;

import Datastore.DataStore;
import OutputProcesser.DisplayMenu;
import OutputProcesser.StoreData;
import OutputProcesser.GasPumpedMsg;
import OutputProcesser.PumpGasUnit;
import OutputProcesser.PayMsg;
import OutputProcesser.Receipt;
import OutputProcesser.StoreCash;
import OutputProcesser.StopMsg;
import OutputProcesser.SetPrice;
import OutputProcesser.SetInitialValue;
import OutputProcesser.SetW;

public abstract class AbstractFactory {
	public abstract DataStore getdata();
	public abstract StoreData getdatastore();
	public abstract PayMsg getpaymsg();
	public abstract GasPumpedMsg getGpMsg();
    public abstract SetW get_w();
    public abstract StoreCash getsc();
    public abstract SetPrice getpsp();
    public abstract SetInitialValue getsv();
    public abstract DisplayMenu getdm();
	public abstract PumpGasUnit getpu();
    public abstract StopMsg getsm();
    public abstract Receipt getrcp();
}
