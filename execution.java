package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class execution {
	@Test(groups="food")
	
	public void zomato() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/india");
		
		
	}
	@Test
	
	public void fb() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
	}
	@Test(groups="food")
	public void swiggy() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		
		
	}

}


