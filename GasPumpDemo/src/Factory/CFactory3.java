/*
 * Concrete factory class for GasPump-3
 */
package Factory;

import Datastore.DataStore3;
import Datastore.DataStore;
import OutputProcesser.DisplayMenu;
import OutputProcesser.DisplayMenu3;
import OutputProcesser.SetW;
import OutputProcesser.SetW1;
import OutputProcesser.StopMsg1;
import OutputProcesser.StoreData;
import OutputProcesser.StoreData2;
import OutputProcesser.GasPumpedMsg;
import OutputProcesser.GpMsg2;
import OutputProcesser.PumpGasUnit;
import OutputProcesser.PumpGasUnit3;
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
import OutputProcesser.PayMsg3;

public class CFactory3 extends AbstractFactory{

		DataStore3 db3;
	    StoreData2 ds2;
	    PayMsg3 paymsg3;
	    GpMsg2 gmMsg2;
		StoreCash2 sc2;
		SetPrice2 sp2;
		SetInitialValue2 sv2;
	    SetW1 sw1;
		DisplayMenu3 dm3;
		PumpGasUnit3 pu3;
		StopMsg1 sm1;
		Receipt2 rcp2;
		/*
		 * Concrete Factory for GasPump1
		 */ 
		public CFactory3() {
			db3 =new DataStore3();
		    ds2=new StoreData2();
		    paymsg3=new PayMsg3();
		    gmMsg2 = new GpMsg2();
		    sw1=new SetW1();
		    sc2=new StoreCash2();
		    sp2=new SetPrice2();
		    sv2=new SetInitialValue2();
		    dm3=new DisplayMenu3();
		    pu3=new PumpGasUnit3();
		    sm1=new StopMsg1();
		    rcp2=new Receipt2();
	    }
		 
		@Override
		public DataStore getdata() {
			// TODO Auto-generated method stub
			return db3;
		}

		@Override
		public StoreData getdatastore() {
			// TODO Auto-generated method stub
			return ds2;
		}

		@Override
		public PayMsg getpaymsg() {
			// TODO Auto-generated method stub
			return paymsg3;
		}

		@Override
		public SetW get_w() {
			// TODO Auto-generated method stub
			return sw1;
		}

		@Override
		public DisplayMenu getdm() {
			// TODO Auto-generated method stub
			return dm3;
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
		public PumpGasUnit getpu() {
			// TODO Auto-generated method stub
			return pu3;
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
			return gmMsg2;
		}

}
