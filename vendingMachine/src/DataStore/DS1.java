package DataStore;

public class DS1 extends DataStore {
	
	private int temp_p, temp_v, price, cf;
	
	public int getIntTemp_p() {
		return temp_p;
	}
	
	public void setIntTemp_p(int temp_p) {
		this.temp_p = temp_p;		
	}
	
	public int getIntTemp_v() {
		return temp_v;
	}
	
	public void setIntTemp_v(int temp_v) {
		this.temp_v = temp_v;
	}
	
	public int get_price1() {
		return price;
	}
	
	public void set_price1(int price) {
		this.price = price;
	}
	
	public int get_cf1() {
		return cf;
	}
	
	public void set_cf1(int cf) {
		this.cf = cf;
	}
	


	@Override
	public float getFloatTemp_p() {
		return 0;
	}

	@Override
	public void setFloatTemp_p(float temp_p) {
	}

	@Override
	public float getFloatTemp_v() {
		return 0;
	}

	@Override
	public void setFloatTemp_v(float temp_v) {
	}

	@Override
	public float get_price2() {
		return 0;
	}

	@Override
	public void set_price2(float price2) {
		
	}

	@Override
	public float get_cf2() {
		
		return 0;
	}

	@Override
	public void set_cf2(float cf2) {
		
	}


	
}
