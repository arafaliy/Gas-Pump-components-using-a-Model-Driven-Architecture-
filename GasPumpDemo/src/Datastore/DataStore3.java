/**
 * DataStorage for GasPump-3
 */
package Datastore;

public class DataStore3 extends DataStore {

	
	public float rpriced;
	public float spriced;
	public float tempa;
	public float tempb;
	public int tempw;
	public int wd;
	public int tempL;
	public int Ld;
    public float total;
	public float tempd;
	public float cd;
    public float pricec;
    
	public float gettemp_2a() {
		return tempa;
	}
	public float gettemp_2b() {
		return tempb;
	}
	public float getprice_r(){
    	return rpriced;
    }
    public float getprice_s(){
    	return spriced;
    }
    public float gettotalf(){
    	return total;
    }
    public void settotal(float t){
    	total=t;
    }
	public void setprice_r(float price) {
		rpriced=price;
	}
	public void setprice_s(float price) {
		spriced=price;
	}
    
    public float gettemp_d(){
    	return tempd;
    }
    public float getd(){
    	return cd;
    }
    public void setc(float c){
    	cd=c;
    }
    public float getpcf(){
    	return pricec;
    }
    public void setpc(float pc){
    	pricec=pc;
    }
    public int gettemp_L(){
    	return tempL;
    }
    public int getL(){
    	return Ld;
    }
    public void setL(int d){
    	Ld=d;
    }
    

}
