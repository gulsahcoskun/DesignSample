package bean;

public class Arac {
	
	private Motor motor;
	private int tekerlekSayisi;
	private String marka;
	private String model;
	

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public int getTekerlekSayisi() {
		return tekerlekSayisi;
	}

	public void setTekerlekSayisi(int tekerlekSayisi) {
		this.tekerlekSayisi = tekerlekSayisi;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Arac [motor=" + motor.toString() + ", tekerlekSayisi=" + tekerlekSayisi + ", marka=" + marka + ", model=" + model
				+ "]";
	}
	
	
	
	
}
