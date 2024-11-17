package rahulshettyabstractcomponenetsreuse;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class abstractcomponents {
	WebDriver driver;
	
	public abstractcomponents(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public void waitelementtoappear(By findby) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
	}
	public void waitelementtodisapper(By ele) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(ele));
	}
}
