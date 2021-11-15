package com.Mini_project2;

import org.openqa.selenium.WebDriver;

import com.BaseClass.Base_Class;
import com.Help.FileReader;
import com.SDP.Singleton;

public class PomandSdp_Project extends Base_Class {

	public static WebDriver wd = Base_Class.Browser("chrome");
	
	public static Singleton sdp = new Singleton(wd);
	
	public static void main(String[] args) throws Throwable {

		String url = FileReader.getfr().getcr().url();
		Get_URL(url);
		snap("photo.png");
		sleep(5000);
		
		click(sdp.getHp().getSignbtn());
		snap("photo1.png");
		sleep(5000);
		
		String username = FileReader.getfr().getcr().username();
		Pass(sdp.getL().getUsername(), username);
		implicity();
		String password = FileReader.getfr().getcr().password();
		Pass(sdp.getL().getPassword(), password);
		implicity();
		click(sdp.getL().getLogin());
		sleep(2000);
		snap("photo2.png");
		sleep(5000);
		
		click(sdp.getW().getWomen());
		sleep(2000);
		snap("photo3.png");
		sleep(5000);
		
		click(sdp.getP().getPd());
		sleep(2000);
		snap("photo4.png");
		sleep(5000);
		
		click(sdp.getCart().getAc());
		sleep(2000);
		snap("photo5.png");
		sleep(5000);
		
		click(sdp.getProc().getCed());
		sleep(2000);
		snap("photo6.png");
		sleep(5000);
		
		click(sdp.getPro().getCeed());
		sleep(2000);
		snap("photo7.png");
		sleep(5000);
		
		click(sdp.getPro3().getPro3());
		sleep(2000);
		snap("photo8.png");
		sleep(5000);

		click(sdp.getT().getCon());
		sleep(2000);
		snap("photo9.png");
		sleep(5000);

		click(sdp.getPro4().getPro4());
		sleep(2000);
		snap("photo10.png");
		sleep(5000);

		click(sdp.getPay().getPay());
		sleep(2000);
		snap("photo11.png");
		sleep(5000);

		click(sdp.getPay2().getPay1());
		sleep(2000);
		snap("photo12.png");
		sleep(5000);
		
		sleep(3000);
		quit();
		
	}
}