package rahulshettyacademy.selenimframeworkpageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class landingpage {
	WebDriver driver;
public landingpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
//WebElement email=driver.findElement(By.id("userEmail"));
//Page Factory
@FindBy(id="userEmail")
WebElement Email;
//driver.findElement(By.id("userPassword"))
@FindBy(id="userPassword")
WebElement Password;
@FindBy(css="input[value='Login']")
WebElement loginbutton;
public void landingpag1(String useremail,String userpassword) {
	Email.sendKeys(useremail);
	Password.sendKeys(userpassword);
    loginbutton.click();
}
public void Goto() {
	driver.get("https://rahulshettyacademy.com/client");
}
}

