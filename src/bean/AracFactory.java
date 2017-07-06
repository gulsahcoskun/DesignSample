package bean;

import util.AracTurleri;

public class AracFactory {

	public Arac getArac(String type){
		if(type == null){
			return null;
		}
		if(type.equalsIgnoreCase(AracTurleri.MOTORSIKLET)){
			return new Motorsiklet();
		} else if(type.equalsIgnoreCase(AracTurleri.MINIBUS)){
			return new Minibus();
		}else if(type.equalsIgnoreCase(AracTurleri.OTOMOBIL)){
			return new Otomobil();
		}else if(type.equalsIgnoreCase(AracTurleri.OTOBUS)){
			return new Otobus();
		}
		return null;
	}
}
