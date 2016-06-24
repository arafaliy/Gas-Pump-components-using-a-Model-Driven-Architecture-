
/*
 * Concrete factory class for GasPump-2
 */
package Factory;

import Datastore.DataStore2;
import Datastore.DataStore;
import OutputProcesser.DisplayMenu;
import OutputProcesser.DisplayMenu2;
import OutputProcesser.SetW;
import OutputProcesser.SetW1;
import OutputProcesser.StopMsg1;
import OutputProcesser.StoreData;
import OutputProcesser.StoreData2;
import OutputProcesser.GasPumpedMsg;
import OutputProcesser.GpMsg1;
import OutputProcesser.PumpGasUnit;
import OutputProcesser.PumpGasUnit2;
import OutputProcesser.PayMsg;
import OutputProcesser.Receipt;
import OutputProcesser.Receipt2;
import OutputProcesser.StoreCash;
import OutputProcesser.StoreCash2;
import OutputProcesser.StopMsg;
import OutputProcesser.SetPrice;
import OutputProcesser.SetPrice2;
import OutputProcesser.SetInitialValue;
import OutputProcesser.SetInitialValue2;
import OutputProcesser.PayMsg2;

public class CFactory2 extends AbstractFactory{
   DataStore2 db2;
   StoreData2 ds2;
   PayMsg2 paymsg2;
   GpMsg1 gmMsg1;
    SetW1 sw1;
	StoreCash2 sc2;
	SetPrice2 sp2;
	SetInitialValue2 sv2;
	DisplayMenu2 dm2;
	PumpGasUnit2 pu2;
	StopMsg1 sm1;
	Receipt2 rcp2;
	/*
	 * Concrete Factory for GasPump1
	 */ 
	public CFactory2() {
		db2 =new DataStore2();
	    ds2=new StoreData2();
	    paymsg2=new PayMsg2();
	    gmMsg1 = new GpMsg1();
	    sw1=new SetW1();
	    sc2=new StoreCash2();
	    sp2=new SetPrice2();
	    sv2=new SetInitialValue2();
	    dm2=new DisplayMenu2();
	    pu2=new PumpGasUnit2();
	    sm1=new StopMsg1();
	    rcp2=new Receipt2();
    }
	 
	@Override
	public DataStore getdata() {
		// TODO Auto-generated method stub
		return db2;
	}

	@Override
	public StoreData getdatastore() {
		// TODO Auto-generated method stub
		return ds2;
	}

	@Override
	public PayMsg getpaymsg() {
		// TODO Auto-generated method stub
		return paymsg2;
	}

	@Override
	public SetW get_w() {
		// TODO Auto-generated method stub
		return sw1;
	}


	@Override
	public StoreCash getsc() {
		// TODO Auto-generated method stub
		return sc2;
	}

	@Override
	public SetPrice getpsp() {
		// TODO Auto-generated method stub
		return sp2;
	}

	@Override
	public SetInitialValue getsv() {
		// TODO Auto-generated method stub
		return sv2;
	}
	@Override
	public DisplayMenu getdm() {
		// TODO Auto-generated method stub
		return dm2;
	}


	@Override
	public PumpGasUnit getpu() {
		// TODO Auto-generated method stub
		return pu2;
	}

	@Override
	public StopMsg getsm() {
		// TODO Auto-generated method stub
		return sm1;
	}

	@Override
	public Receipt getrcp() {
		// TODO Auto-generated method stub
		return rcp2;
	}

	@Override
	public GasPumpedMsg getGpMsg() {
		// TODO Auto-generated method stub
		return gmMsg1;
	}

}
