package pack2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c4 {
	
	@Test(groups="Two")
	public void t4() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		
		ob.get("https://jqueryui.com/datepicker/");
		ob.switchTo().frame(0);
		ob.findElementById("datepicker").click();
		for(int i=0;i<2;i=i+1)
		{
			ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
		}
		ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[1]/td[2]/a").click();
		Thread.sleep(3000);
		ob.quit();
	}

}
