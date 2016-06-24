/*
 * GasPump-2 Implementation Class
 */
import java.util.Scanner;

import Datastore.DataStore2;
import Datastore.DataStore;
import Factory.AbstractFactory;
import Factory.CFactory2;
import MDEFSM.MDEFSM;


public class GasPump2 {
	float a,b;
	DataStore ds;
	AbstractFactory af;
	MDEFSM mde;
	DataStore2 db;
	/*
	 * Constructor for GasPump2
	 */
	GasPump2(){
		af= new CFactory2();
		mde =new MDEFSM();
		DataStore.af=af;
	}
	/*
	 * List all Possible operations for GasPump2
	 */
	void startGasPump() {
		System.out.println("*****************GasPump-2*****************\n");
		
		System.out.println("The GasPump-2 component supports the following operations: \n"
				+ "1. Activate (float a, float b) \n"  // the gas pump is activated where a is the price of the regular gas and b is the price of super gas per gallon
				+ "2. Start()  \n"		//start the transaction
				+ "3. PayCredit()  \n"		// pay for gas by a credit card
				+ "4. Reject()  \n"		// credit card is rejected
				+ "5. Cancel()  \n"		// cancel the transaction
				+ "6. Approved()  \n"		// credit card is approved
				+ "7. Super()  \n"		// Super gas is selected
				+ "8. Regular() \n"     // Regular gas is selected
				+ "9. StartPump()  \n"		// start pumping gas
				+ "10. PumpGallon()  \n"		// one gallon of gas is disposed
				+ "11. StopPump()  \n"		// stop pumping gas
				+ "12. ExitPump()  \n");		//Exit from Pump1
		
		
		System.out.println("Execution Started for GasPump-2 \n");
		
		boolean cp = true;
		while(cp) {
			System.out.println("\n Operations :\n 1.Activate  "
								+"2.Start  "
								+"3.PayCredit  "
								+"4.Reject  "
								+"5.Cancel  "
								+"6.Approved  "
								+"7.Super  "
								+"8.Regular  "
								+"9.StartPump  "
								+"10.PumpGallon  "
								+"11.StopPump  "
								+"12.Exit \n ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice : \n");
			int op = sc.nextInt();
			
			if(op == 12) {
				System.out.println("GasPump-2 Exit \n");
				break;
			}
			switch(op)
			{
				case 1: 
					float a, b  ;
					System.out.println("\n Operation:  Activate(a,b) \n  ");
					System.out.println("Enter Price of Regular Gas : ");
					try {
						a=sc.nextFloat();
					//	break;
					}
					catch(Exception e) {
						a=0;
						System.out.print("Gas Price must be in float for GasPump-2");   
					}
					System.out.println("Enter Price of Supar Gas : ");
					try {
						b=sc.nextFloat();
					//	break;
					}
					catch(Exception e) {
						b=0;
						System.out.print("Gas Price must be in float for GasPump-2");   
					}
				    
					Activate(a,b);
					break;
				case 2:
					System.out.println("\n Operation:  start() \n  ");
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
					System.out.println("\n Operation:  Super() \n  ");
				     Super();
				     break;
				case 8:
					System.out.println("\n Operation:  Regular() \n  ");
				     Regular();
				     break;
				case 9:
					System.out.println("\n Operation:  StartPump() \n  ");
					StartPump();
					break;	
				case 10:
					PumpGallon();
					break;
				case 11:
					System.out.println("\n Operation:  StopPump() \n  ");
					StopPump();
					break;
				case 12:
					cp = false;
					break;
				default:
					System.out.println("Invalid Choice");
				break;
			}
		}
		
	}
	public void Activate(float a, float b) {
		if(a > 0 && b>0){ 
			db=(DataStore2) af.getdata();
			db.tempa=a;
			db.tempb=b;
			mde.activate();
		}
		else {
			System.out.println("Gas Price must be greater than 0");
		}
	}
	public void start() {
		mde.start();
	}
	public void PayCredit() {
		mde.pay_credit();
	}
	public void Reject() {
		mde.reject();
	}
	public void Cancel() {
		mde.cancel_msg();
	}
	public void Approved() {
		db=(DataStore2) af.getdata();
		db.tempw=1;
		mde.approved();
	}
	public void Super() {
		mde.select_gas(2);
	}
	public void Regular() {
		mde.select_gas(2);
	}
	public void StartPump() {
		System.out.println("\n******Gas Pump Start******");
		db=(DataStore2) af.getdata();
		db.tempG=0;
		mde.start_pump();
	}
	public void PumpGallon() {
		System.out.println("\n******Pumping for Gas Started from GasPump-1******");
		db=(DataStore2) af.getdata();
	   	mde.pump_unite();
	}
	public void StopPump() {   
		mde.stop_pump();
		mde.receipt();
	}
}
