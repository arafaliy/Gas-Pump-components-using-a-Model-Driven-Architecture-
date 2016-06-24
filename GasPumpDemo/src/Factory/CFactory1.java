/*
 * Concrete factory class for GasPump-1
 */
package Factory;

import Datastore.DataStore;
import Datastore.DataStore1;
import OutputProcesser.DisplayMenu;
import OutputProcesser.DisplayMenu1;
import OutputProcesser.SetW;
import OutputProcesser.StoreData;
import OutputProcesser.StoreData1;
import OutputProcesser.GasPumpedMsg;
import OutputProcesser.GpMsg1;
import OutputProcesser.PumpGasUnit;
import OutputProcesser.PumpGasUnit1;
import OutputProcesser.PayMsg;
import OutputProcesser.Receipt;
import OutputProcesser.Receipt1;
import OutputProcesser.StoreCash;
import OutputProcesser.StoreCash1;
import OutputProcesser.StopMsg;
import OutputProcesser.StopMsg1;
import OutputProcesser.SetPrice;
import OutputProcesser.SetPrice1;
import OutputProcesser.SetInitialValue;
import OutputProcesser.SetInitialValue1;
import OutputProcesser.PayMsg1;
import OutputProcesser.SetW1;


public class CFactory1 extends AbstractFactory {
	DataStore1 db1;
	StoreData1 ds1;
	PayMsg1 paymsg1;
	GpMsg1 gpMsg1;
	SetW1 sw;
	StoreCash1 sc1;
	SetPrice1 sp1;
	SetInitialValue1 sv1;
	DisplayMenu1 dm1;
	PumpGasUnit1 pu1;
	StopMsg1 sm1;
	Receipt1 rcp1;
	/*
	 * Concrete Factory for GasPump1
	 */
	public CFactory1() {	 
		db1 =new DataStore1();
	    ds1=new StoreData1();
	    paymsg1=new PayMsg1();
	    gpMsg1 = new GpMsg1();
	    sw=new SetW1();
	    sc1=new StoreCash1();
	    sp1=new SetPrice1();
	    sv1=new SetInitialValue1();
	    dm1=new DisplayMenu1();
	    pu1=new PumpGasUnit1();
	    sm1=new StopMsg1();
	    rcp1=new Receipt1();
	}
	public DataStore getdata() {		
      return db1;		
	}
	@Override
	public StoreData getdatastore() {
		// TODO Auto-generated method stub
		return ds1;
	}
	@Override
	public PayMsg getpaymsg() {
		// TODO Auto-generated method stub
		return paymsg1;
	}
	@Override
	public SetW get_w() {
		// TODO Auto-generated method stub
		return sw;
	}
	@Override
	public StoreCash getsc() {
		// TODO Auto-generated method stub
		return sc1;
	}
	@Override
	public SetPrice getpsp() {
		// TODO Auto-generated method stub
		return sp1;
	}
	@Override
	public SetInitialValue getsv() {
		// TODO Auto-generated method stub
		return sv1;
	}
	@Override
	public DisplayMenu getdm() {
		// TODO Auto-generated method stub
		return dm1;
	}
	
	@Override
	public PumpGasUnit getpu() {
		// TODO Auto-generated method stub
		return pu1;
	}
	@Override
	public StopMsg getsm() {
		// TODO Auto-generated method stub
		return sm1;
	}
	@Override
	public Receipt getrcp() {
		// TODO Auto-generated method stub
		return rcp1;
	}
	@Override
	public GasPumpedMsg getGpMsg() {
		// TODO Auto-generated method stub
		return gpMsg1;
	}
	


}
