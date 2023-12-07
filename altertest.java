package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class altertest {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91917\\Downloads\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
			WebDriver dr=new ChromeDriver();
			dr.manage().window().maximize();
		dr.get("https://demo.automationtesting.in/Alerts.html");
dr.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
Alert a=dr.switchTo().alert();
Thread.sleep(2000);


dr.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
Thread.sleep(2000);
dr.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
Alert a2=dr.switchTo().alert();

a2.accept();
Thread.sleep(2000);

dr.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
Thread.sleep(2000);
dr.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
Alert a3=dr.switchTo().alert();
a3.accept();
//textbox ch home work


	}

}
