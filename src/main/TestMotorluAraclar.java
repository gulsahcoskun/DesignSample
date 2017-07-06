package main;
import java.util.Date;

import bean.Arac;
import bean.AracFactory;
import bean.Motor;
import util.AracTurleri;

public class TestMotorluAraclar {

	public static void main(String[] args){
		AracFactory aracFactory  = new AracFactory();
		Arac motorsiklet = aracFactory.getArac(AracTurleri.MOTORSIKLET);
		Arac otobus = aracFactory.getArac(AracTurleri.OTOBUS);
		Arac minibus = aracFactory.getArac(AracTurleri.MINIBUS);
		
		Motor motor =  new Motor();
		motor.setHacim(5.5);
		motor.setMarka("test");
		Date date = new Date();
		motor.setUretimtarihi(date);
		
		motorsiklet.setMotor(motor);
		motorsiklet.setMarka("motorsiklet");
		motorsiklet.setModel("yeni");
		motorsiklet.setTekerlekSayisi(2);
		System.out.println(motorsiklet.toString());
		
		System.out.println();
		
		otobus.setMotor(motor);
		otobus.setMarka("otobüs");
		otobus.setModel("eski");
		motorsiklet.setTekerlekSayisi(4);
		System.out.println(otobus.toString());
		
		System.out.println();
		
		minibus.setMotor(motor);
		minibus.setMarka("minibüs");
		minibus.setModel("eski");
		minibus.setTekerlekSayisi(4);
		System.out.println(minibus.toString());
		
	}
}
