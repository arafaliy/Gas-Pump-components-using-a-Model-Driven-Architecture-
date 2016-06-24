/**
 * DataStorage for GasPump-2
 */
package Datastore;

public class DataStore2 extends DataStore {

	
	public float rpriced;
	public float spriced;
	public float tempa;
	public float tempb;
	public int tempw;
	public int wd;
	public int tempc;
	public int cd;
	public int tempG;
	public int Gd;
    public float total;
    public float pricec;
	public float gettemp_2a() {
		return tempa;
	}
	public float gettemp_2b() {
		return tempb;
	}

	public void setprice_r(float price) {
		// TODO Auto-generated method stub
		rpriced=price;
	}
	public void setprice_s(float price) {
		// TODO Auto-generated method stub
		spriced=price;
	}
    public int gettw()
    {
    return tempw;	
    }
    public int getw()
    {return wd;}
    public void setw(int w)
    {
    	wd=w;    }
    public int gettempc(){return tempc;}
    public int getc(){return cd;}
    public void setc(int c){cd=c;}
    public float getpcf(){return pricec;}
    public void setpc(float pc){pricec=pc;}
    public int gettemp_G(){return tempG;}
    public int getG(){return Gd;}
    public void setG(int d){Gd=d;}
    public float getprice_r(){return rpriced;}
    public float getprice_s(){return spriced;}
    public float gettotalf(){return total;}
    public void settotal(float t){total=t;}

}
