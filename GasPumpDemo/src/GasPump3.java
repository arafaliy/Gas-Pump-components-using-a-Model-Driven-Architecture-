/*
 * GasPump-3 Implementation Class
 */
import java.util.Scanner;

import Datastore.DataStore3;
import Datastore.DataStore;
import Factory.AbstractFactory;
import Factory.CFactory3;
import MDEFSM.MDEFSM;


public class GasPump3 {
	int a;
	DataStore ds;
	AbstractFactory af;
	MDEFSM mde;
	DataStore3 db;
	GasPump3()
	{
		af = new CFactory3();
		mde =new MDEFSM();
		DataStore.af=af;
	}
	void startGasPump() {
		System.out.println("*****************GasPump-3*****************\n");
		
		System.out.println("The GasPump-3 component supports the following operations: \n"
				+ "1. Activate (int a) \n"   	// the gas pump is activated where a is the price of the gas per gallon
				+ "2. Start()  \n"		//start the transaction
				+ "3. PayCash(float c)  \n"		// pay for gas by cash, where c represents prepaid cash
				+ "4. Cancel()  \n"		// cancel the transaction
				+ "5. Premium()  \n"	//Premium gas is Selected	
				+ "6. Regular()  \n"		// Regular gas is selected	
				+ "7. StartPump()  \n"		// start pumping gas
				+ "8. PumpLiter()  \n"		// one gallon of gas is disposed
				+ "10. StopPump()  \n"		// stop pumping gas
				+ "11. Receipt()   \n"      //Receipt is requested
				+ "12. NoReceipt()  \n"    //No Receipt
				+ "13. ExitPump()  \n");		//Exit from Pump1
		
		
		System.out.println("Execution Started for GasPump-3 \n");
		
		boolean cp = true;
		while(cp) {
			System.out.println("\n Operations :\n 1.Activate  "
								+"2.Start  "
								+"3.PayCash  "
								+"4.Cancel  "
								+"5.Regular  "
								+"6.Premium  "
								+"7.StartPump  "
								+"8.PumpLiter  "
								+"9.StopPump  "
								+"10.Receipt  "
								+"11.No Receipt  "
								+"12.Exit \n ");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice : \n");
			int op = sc.nextInt();
			
			if(op == 12) {
				System.out.println("GasPump-3 Exit \n");
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
					System.out.println("Enter Price of Premium Gas : ");
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
					System.out.println("\n Operation:  PayCash(c) \n  ");
					System.out.println("\n Please Enter Cash Amount : ");
				     Scanner pc =new Scanner(System.in);
				     float c = pc.nextFloat();
				     if(c>0) {
				    	 PayCash(c);
				     }
				     else {
				    	 System.out.println("!!! Plese Enter Valid Cash Payment !!!!");
				     }
				     break;
				case 4:
					System.out.println("\n Operation:  Cancel() \n  ");
					Cancel();
					break;
				case 5:
					System.out.println("\n Operation:  Regular() \n  ");
					Regular();
					break;
				case 6:
					System.out.println("\n Operation:  Premium() \n  ");
					Premium();
					break;
				case 7: 
					System.out.println("\n Operation:  StartPump() \n  ");
					StartPump();
				     break;
				case 8:
					System.out.println("\n Operation:  PumpLiter() \n  ");
					PumpLiter();
					break;	
				case 9:
					System.out.println("\n Operation:  StopPump() \n  ");
					StopPump();
					break;
				case 10:
					System.out.println("\n Operation:  Receipt() \n  ");
					Receipt();
					break;
				case 11:
					System.out.println("\n Operation:  NoReceipt() \n  ");
					NoReceipt();
					break;
				case 12:
					cp = false;
					break;
				default:
					System.out.println("Invalid Choice");
				break;
			}
		}
		
		
//		if(op == 1) {
//			System.out.println("Operation :  Acivate(int a) \n");
//			System.out.println("Enter value for a : ");
//			int a = sc.nextInt();
//		}
	}
	public void Activate(float a, float b) {
		if(a > 0 && b>0){ 
			db=(DataStore3) af.getdata();
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
	public void Cancel() {
		mde.cancel_msg();
	}
	public void Premium() {
		mde.select_gas(2);
	}
	public void Regular() {
		mde.select_gas(1);
	}
	
	public void PayCash(float c) {
		db=(DataStore3) af.getdata();
		db.tempw=0;
		db.tempd=c;
		mde.pay_cash();
	}
	public void StartPump() {
		System.out.println("\n******GasPump Start******");
		db=(DataStore3) af.getdata();
		db.tempL=0;
		mde.start_pump();
	}
	public void PumpLiter() {
		System.out.println("\n******Pumping for Gas Started from GasPump-1******");
		db=(DataStore3) af.getdata();
	   	if (db.getd() < ((db.getL()+1)*db.getpcf())) {
	   		mde.stop_pump();
	   	}
	   	else {
	   		mde.pump_unite();
	   	}
	}
	public void StopPump() {   
		mde.stop_pump();
	}
	public void Receipt() {
		mde.receipt();
	}
	public void NoReceipt() {
		mde.no_receipt();
	}
}
