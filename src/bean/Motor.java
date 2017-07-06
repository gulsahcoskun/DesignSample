package bean;

import java.util.Date;

public class Motor {
	
	private double hacim;
	private String marka;
	private Date uretimtarihi;
	
	public double getHacim() {
		return hacim;
	}
	public void setHacim(double hacim) {
		this.hacim = hacim;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public Date getUretimtarihi() {
		return uretimtarihi;
	}
	public void setUretimtarihi(Date uretimtarihi) {
		this.uretimtarihi = uretimtarihi;
	}
	@Override
	public String toString() {
		return "Motor [hacim=" + hacim + ", marka=" + marka + ", uretimtarihi=" + uretimtarihi + "]";
	}
	

	
	
}
