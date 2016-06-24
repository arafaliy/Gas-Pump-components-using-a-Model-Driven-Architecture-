/*
 * GasPump-1 Implementation Class
 */
import java.util.Scanner;

import Datastore.DataStore1;
import Datastore.DataStore;
import Factory.AbstractFactory;
import Factory.CFactory1;
import MDEFSM.MDEFSM;


public class GasPump1 {
	int a;
	DataStore ds;
	AbstractFactory af;
	MDEFSM mde;
	DataStore1 db;
	GasPump1()
	{
		af= new CFactory1();
		mde =new MDEFSM();
		DataStore.af=af;
	}
	/*
	 * Start GasPump-1 and list all Possible operations supported by it.
	 */
	void startGasPump() {
		System.out.println("\n\n*****************GasPump-1*****************\n");
		
		System.out.println("The GasPump-1 component supports the following operations: \n"
				+ "		1. Activate (int a) \n"   	// the gas pump is activated where a is the price of the gas per gallon
				+ "		2. Start()  \n"		//start the transaction
				+ "		3. PayCredit()  \n"		// pay for gas by a credit card
				+ "		4. Reject()  \n"		// credit card is rejected
				+ "		5. Cancel()  \n"		// cancel the transaction
				+ "		6. Approved()  \n"		// credit card is approved
				+ "		7. PayCash(int c)  \n"		// pay for gas by cash, where c represents prepaid cash
				+ "		8. StartPump()  \n"		// start pumping gas
				+ "		9. PumpGallon()  \n"		// one gallon of gas is disposed
				+ "		10. StopPump()  \n"		// stop pumping gas
				+ "		11. ExitPump()  \n");		//Exit from Pump1
		
		
		System.out.println("Execution Started for GasPump-1 \n");
		
		boolean cp = true;
		while(cp) {
			System.out.println("\n---> Select Operations :\n 1.Activate  "
								+" 2.Start  "
								+" 3.PayCredit  "
								+" 4.Reject  "
								+" 5.Cancel  "
								+" 6.Approved  "
								+" 7.PayCash  "
								+" 8.StartPump  "
								+" 9.PumpGallon  "
								+" 10.StopPump  "
								+" 11.Exit \n ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice : ");
			int op = sc.nextInt();
			
			if(op == 11) {
				System.out.println("GasPump-1 Exit \n");
				break;
			}
			switch(op)
			{
				case 1: 
					int a ;
					System.out.println("\n Operation:  Activate(int a) \n  ");
					System.out.println("Enter Value for a (Gas Price) : ");
					try {
						a=sc.nextInt();
					}
					catch(Exception e) {
						a=0;
						System.out.print("\nError!! -  Gas Price must be in Integer for GasPump-1");   
					}
				    
					Activate(a);
					break;
				case 2:
					System.out.println("\n Operation:  Start() \n  ");
					start();
					break;
				case 3:
					System.out.println("\n Operation:  PayCredit() \n  ");
					PayCredit();
					break;
				case 4:
					System.out.println("\n Operation:  Reject() \n  ");
					Reject();
					break;
				case 5:
					System.out.println("\n Operation:  Cancel() \n  ");
					Cancel();
					break;
				case 6:
					System.out.println("\n Operation:  Approved() \n  ");
					Approved();
					break;
				case 7:   
					System.out.println("\n Operation:  PayCash(int c) \n  ");
				     System.out.println("\n Please Enter Cash Amount : ");
				     Scanner pc =new Scanner(System.in);
				     int c = pc.nextInt();
				     if(c>0) {
				    	 PayCash(c);
				     }
				     else {
				    	 System.out.println("!!! Plese Enter Valid Cash Payment !!!!");
				     }
				     break;
				case 8:
					System.out.println("\n Operation:  StartPump() \n  ");
					StartPump();
					break;	
				case 9:
					System.out.println("\n Operation:  PumpGallon() \n  ");
					PumpGallon();
					break;
				case 10:
					System.out.println("\n Operation:  StopPump() \n  ");
					StopPump();
					break;
				case 11:
					cp = false;
					break;
				default:
					System.out.println("Invalid Choice");
				break;
			}
		}
	}
	
	/*
	 * Activate GasPump1 with Gas Price is a
	 */
	public void Activate(int a) {
		if(a > 0){ 
			db=(DataStore1) af.getdata();
			db.tempa=a;
			mde.activate();
			System.out.println("\n ******GasPump 1 is Activated****** ");
		}
		else {
			System.out.println("\n Gas Price must be greater than 0");
		}
	}
	
	/*
	 * Start GasPump1
	 */
	public void start() {
		mde.start();
	}
	/*
	 * Payment by Credit
	 */
	public void PayCredit() {
		mde.pay_credit();
	}
	/*
	 * Reject Credit card
	 */
	public void Reject() {
		mde.reject();
	}
	/*
	 * Cancel Transaction 
	 */
	public void Cancel() {
		mde.cancel_msg();
	}
	/*
	 * Approve Credit card
	 */
	public void Approved() {
		db=(DataStore1) af.getdata();
		db.tempw=1;
		mde.approved();
	}
	/*
	 * Payment by cash
	 */
	public void PayCash(int c) {
		db=(DataStore1) af.getdata();
		db.tempw=0;
		db.tempc=c;
		mde.pay_cash();
	}
	/*
	 * Start Pumping for gas
	 */
	public void StartPump() {
		System.out.println("\n******GasPump Start******");
		mde.select_gas(1);
		db=(DataStore1) af.getdata();
		db.tempG=0;
		mde.start_pump();
	}
	/*
	 * Pumping of Gas is running upto manually select stop pump or cash becomes less then 1 gallon price
	 */
	public void PumpGallon() {
		System.out.println("\n******Pumping for Gas Started from GasPump-1******");
		db=(DataStore1) af.getdata();
	   	if(db.getw()==1) {
	   		mde.pump_unite();
	   		
	   	}
	   	else if (db.getc()<((db.getG()+1)*db.getpc())) {
	   		mde.stop_pump();
	   		mde.receipt();
	   	}
	   	else {
	   		mde.pump_unite();
	   	}
	}
	/*
	 * Stop pumping of gas
	 */
	public void StopPump() {   
		mde.stop_pump();
		mde.receipt();
	}
}
