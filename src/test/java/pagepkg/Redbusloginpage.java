package pagepkg;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Redbusloginpage {
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"rail_tickets_vertical\"]/div/div/img")
	WebElement Traintickets;
	@FindBy(xpath="//*[@id=\"root\"]/section[1]/div/div[3]/div[2]/div/form/button")
	WebElement Search;
	@FindBy(xpath="//*[@id=\"root\"]/section[1]/div/div[3]/div[1]/div[1]")
	WebElement redrail;
	@FindBy(xpath="//*[@id=\"root\"]/section[1]/div/div[3]/div[2]/div/form/div[1]/label")
	WebElement From;
	@FindBy(xpath="//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/div/div")
	WebElement To;
	@FindBy(xpath="//*[@id=\"root\"]/section[1]/div/div[3]/div[1]/div[2]/p")
	WebElement checkPNRStatus;
	@FindBy(xpath="//*[@id=\"root\"]/section[1]/div/div[3]/div[1]/div[3]/p")
	WebElement LivetrainStatus;
	@FindBy(xpath="//*[@id=\"root\"]/div/nav/div/div[2]/div[1]/a")
	public
	
	WebElement Help;




	public  Redbusloginpage (WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}


	public void Trainticket() {
		Traintickets.click();
	}


	public void redrail() {
		redrail.click();
	}
	public void SearchTrainsclick() {
		Search.click();
		
	}

	public void Fromclick() {
		From.sendKeys("Newdelhi");
	}
		public void Toclick() {
			To.sendKeys("Mumbai");
		}


	public void checkPNRStatus() {
		checkPNRStatus.click();
	}
	public void LivetrainStatus() {
		LivetrainStatus.click();
	}
		public void Help() {
			Help.click();
			
		
	}
		
		public void checkout() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("javascript:window.scrollBy(0,1000)");
			Help.click();
		}
		}



