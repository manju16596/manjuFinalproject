package testpkg;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Basepkg.Redbuspkg;
import pagepkg.Redbusloginpage;
import utilities.excelutilities.excelRedbus;

public class Redbuslogintest extends Redbuspkg {
	@Test
	public void testLogin() {
		
		Redbusloginpage ob=new Redbusloginpage(driver);
		String x1="\"C:\\Users\\DELL\\Downloads\\selenium 4.18\\excelfiles\\Sheet1.xlsx\"";
		String sheet="Sheet1";
		int rowCount=excelRedbus.getRowCount(x1, sheet);
		System.out.println(rowCount);
		
		for(int i=1;i<=rowCount;i++) {
			String username=excelRedbus.getCellValue(x1, sheet, i, 0);
			String password=excelRedbus.getCellValue(x1, sheet, i, 1);
		
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		ob.Trainticket();
		ob.redrail();
		
		ob.Help();
		Actions act= new Actions(driver);
		act.moveToElement(ob.Help).build().perform();
		
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/section[1]/div/div[3]/div[1]/div[1]"));
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		a.accept();
		
		
		
			
			
			
			String expectedURL="https://www.Redbus.com/inventory.html";
			String actualURL=driver.getCurrentUrl();
			
			if(expectedURL.equals(actualURL)) {
				System.out.println("Login Successfull");
			}
			else {
				System.out.println("Login unsuccessfull");
			}
			
		}
	}
}

			


