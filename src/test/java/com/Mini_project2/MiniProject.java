package com.Mini_project2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.Base_Class;

public class MiniProject extends Base_Class {

	public static WebDriver wd;
	
	public static void main(String[] args) throws Throwable {

		wd = Browser("chrome");
		
		Get_URL("http://automationpractice.com/index.php");
		
		WebElement dress = wd.findElement(By.xpath("(//a[@title='Printed Dress'])[4]"));
		click(dress);
		sleep(2000); 
		WebElement drop = wd.findElement(By.id("group_1"));
		Drop_Down(drop, "byvalue", "3");
		sleep(2000); 
		WebElement addtocart = wd.findElement(By.name("Submit"));
		click(addtocart);
		sleep(2000); 
		WebElement proceed = wd.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
		click(proceed);
		sleep(2000); 
		WebElement checkout = wd.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
		click(checkout);
		sleep(2000); 
		WebElement id = wd.findElement(By.id("email"));
		Pass(id, "ajithleo67@gmail.com");
		implicity();
		WebElement pass = wd.findElement(By.name("passwd"));
		Pass(pass, "Password0007");
		implicity();
		WebElement login = wd.findElement(By.name("SubmitLogin"));
		click(login);
		sleep(2000); 
		WebElement proceed2 = wd.findElement(By.name("processAddress"));
		click(proceed2);
		sleep(2000);
		WebElement agree = wd.findElement(By.id("cgv"));
		click(agree);
		sleep(2000); 
		WebElement proceed3 = wd.findElement(By.name("processCarrier"));
		click(proceed3);
		sleep(2000); 
		WebElement payment = wd.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a"));
		click(payment);
		sleep(2000); 
		WebElement confirm = wd.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button"));
		click(confirm);
		sleep(5000); 
		snap("shot5.png");
		sleep(5000);
		navigate_to("https://www.facebook.com/");
		sleep(2000);
		quit();
	}
}