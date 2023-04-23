package sample;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Program1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_ver112\\chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");
		
	
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("oneplus 11");
		searchbox.submit();
		//driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		driver.get("https://www.amazon.com/OnePlus-Unlocked-Smartphone-Hasselblad-Processor/dp/B0BNWPSCGB/ref=sr_1_1_sspa?keywords=oneplus%2B11&qid=1682159591&sr=8-1-spons&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyWUJPR0c5TFRPU1BNJmVuY3J5cHRlZElkPUEwMjY2NjAzMlc1T1c1MzZTODIzNSZlbmNyeXB0ZWRBZElkPUEwNDAwNTQ1MlFGTERVQThDVEtLQyZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU&th=1");
		WebElement addToCart = driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
		addToCart.click();
		driver.close();
		
		
		
	}
}
