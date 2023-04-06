package pack2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c3 {

	
	@Test(groups="Two")
	public void t3() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		
		ob.get("http://www.seleniumeasy.com");
		//horizontal : move along x axis, y value will be 0
		//         right : +x  lefft -x
		// verticl: move along y axis, x valu will be 0
		//down: +y  up : -y
		/*ob.executeScript("window.scrollBy(0,500)");// down
		Thread.sleep(3000);
		ob.executeScript("window.scrollBy(0,-500)");// up
		Thread.sleep(3000);*/
		
		ob.executeScript("window.scrollBy(0,document.body.scrollHeight)");// down
		Thread.sleep(3000);
		ob.executeScript("window.scrollBy(0,-document.body.scrollHeight)");// up
		Thread.sleep(3000);
		ob.quit();
	}
}
