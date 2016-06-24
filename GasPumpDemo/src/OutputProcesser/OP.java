/*
 * OutputProcessor class to handle all operations 
 */
package OutputProcesser;
import Datastore.DataStore;
import Factory.AbstractFactory;

public class OP {
	AbstractFactory af;
	StoreData ds1;
	DataStore db1;
	PayMsg pm;
	GasPumpedMsg gm;
	SetW sw;
	DisplayMenu dm;
	StoreCash sc;
	SetPrice sp;
	SetInitialValue sv;
	PumpGasUnit pu;
	StopMsg sm;
	Receipt rcp;
	
	public OP() {
		af=DataStore.af;
	}
	public void storeData() {  
		af=DataStore.af;
		db1=af.getdata();
		ds1=af.getdatastore();
		ds1.datastore(db1);
	}
	public void set_w() {
		af=DataStore.af;
		db1=af.getdata();
		sw=af.get_w();
		sw.setW(db1);
	}
	public void display_menu() {
		af=DataStore.af;
		dm=af.getdm();
		dm.displayMenu();
	}
	public void store_cash() {
		af=DataStore.af;
        sc=af.getsc();
        db1=af.getdata();
        sc.storeCash(db1);
	}
	public void set_price(int n) {
		af=DataStore.af;
		sp=af.getpsp();
		db1=af.getdata();
		sp.setPrice(n, db1);	
	}
	public void setini_val() {
		af=DataStore.af;
		sv=af.getsv();
	    db1=af.getdata();
	    sv.setIniVal(db1);
	}
	public void pump_unit() {
		af=DataStore.af;
		pu=af.getpu();
		db1=af.getdata();
		pu.pumpGasUnit(db1);
	}
	/*
	 * Print Receipt
	 */
	public void print_receipt() {
		af=DataStore.af;
		rcp=af.getrcp();
		db1=af.getdata();
		rcp.printReceipt(db1);
	}
	public void pay_Msg() {
		af=DataStore.af;	
	    pm=af.getpaymsg();
	    pm.payMsg();
	}
	public void pay_credit() {
		System.out.println("Waiting for approvel.");	
	}
	public void reject_msg() {
		System.out.println("Your Card is Rejected");
	}
	public void ready_msg() {
		System.out.println("\n Start Pumping..");	
	}
	public void gp_msg() {
	    af=DataStore.af;
	    gm=af.getGpMsg();
	    db1=af.getdata();
	    gm.gasPumpedMsg(db1);;
	}
	public void stop_msg() {
	    af=DataStore.af;
	    sm=af.getsm();
	    sm.stopMsg();
	}
	public void calcel_msg() {
		System.out.println("\n Cancel Transaction");	
	}
}
