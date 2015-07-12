import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class CheckFile {
	
	public static void main(String args[]){
		
		System.out.println("Hello");
		
	/*	FirefoxDriver dr=new FirefoxDriver();
		FirefoxDriver dr1=new FirefoxDriver();
		dr1.get("http://google.com");
		dr.get("http://msn.com");
		*/
		
/*
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe" );
		ChromeDriver cr=new ChromeDriver();
		cr.get("http://msn.com");
	*/
		/*
		System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\iedriver\\IEDriverServer.exe" );
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://msn.com");
		*/
		
		
		//dynamic browsers
		String browser="Mozila";
		WebDriver driver=null;
		
		if(browser.equals("Mozila"))
			{driver=new FirefoxDriver();}
		else if(browser.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe" );
			driver=new ChromeDriver();
		}
		else if(browser.equals("IE")){
		 	System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\iedriver\\IEDriverServer.exe" );
			driver=new InternetExplorerDriver();
		}
		driver.get("http://gmail.com");
		System.out.println(browser+ driver.getTitle());
	
		WebElement username=driver.findElement(By.id("Email"));
		username.sendKeys("ullasdwaraka@gmail.com");
		WebElement password=driver.findElement(By.id("Passwd"));
		password.sendKeys("Uk2760051!@#");
		WebElement Login=driver.findElement(By.id("signIn"));
		Login.click();
		
		
		
	}
	

}
