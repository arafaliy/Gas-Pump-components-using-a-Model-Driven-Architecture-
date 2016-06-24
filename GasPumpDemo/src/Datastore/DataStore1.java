/**
 * DataStorage for GasPump-1
 */
package Datastore;

public class DataStore1 extends DataStore {

	public int priced;
	public int tempa;
	public int tempw;
	public int wd;
	public int tempc;
	public int cd;
	public int tempG;
	public int Gd;
    public int total;
    public int pricec;
	public int gettemp_a() {
		return tempa;
	}

	public void setprice(int price) {
		priced=price;
	}
    public int gettw() {
    return tempw;	
    }
    public int getw()
    {return wd;}
    public void setw(int w) {
    	wd=w;   
    }
    public int gettempc(){return tempc;}
    public int getc(){return cd;}
    public void setc(int c){cd=c;}
    public int getpc(){return pricec;}
    public void setpc(int pc){pricec=pc;}
    public int gettemp_G(){return tempG;}
    public int getG(){return Gd;}
    public void setG(int c){Gd=c;}
    public int getprice(){return priced;}
    public int gettotal(){return total;}
    public void settotal(int t){total=t;}
    
}
