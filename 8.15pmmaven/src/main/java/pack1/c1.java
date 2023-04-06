package pack1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class c1 {
	
	@Test(groups="One")
	public void t1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Documents\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.google.com");
		System.out.println(ob.getTitle());
		ob.quit();
	}

}
