package rahulshettyacademy.selenimframework;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import rahulshettyacademy.selenimframeworkpageobject.landingpage;
import rahulshettyacademy.selenimframeworkpageobject.productcatlogue;
import rahulshettyacademy.testcomponents.basetest;
import rahulshettyacademy.testcomponents.retry;
public class standonleduplicate extends basetest {

@Test(dataProvider="getdata", retryAnalyzer=retry.class)
public void submitorder(String email, String password) throws IOException{
	
//	landingpage object=luanchapplication();
	    System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");;
	WebDriver driver=new ChromeDriver();
	   
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    landingpage object=new landingpage(driver);
    object.Goto();
	    object.landingpag1(email, password);
	    
	    productcatlogue productsss=new productcatlogue(driver);
	    List <WebElement>Products=productsss.productss();
	    productsss.getproduct();
	    productsss.addproduct();
	    
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("toast-container")));
	    //wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("toast-container")));
	    productsss.clickcart();
	    
	    productsss.cartProducts();
	    Boolean value=productsss.productmatch();
	    Assert.assertTrue(value);
	   productsss.checkout();
	    //driver.findElement(By.cssSelector("[placeholder='Select Country']")).sendKeys("pak");
	//   checkout check=new checkout(driver);
	  // check.selectcountry();
	    //check.confirmationpage();
	    //String abcd=check.confirmationtext();
	   // AssertJUnit.assertTrue(abcd.equalsIgnoreCase("Thankyou for the order."));

}
@DataProvider
public Object[][] getdata() {
	return new Object [][] { {"test78899@yopmail.com","Testuse1" },{"test788909@yopmail.com","Testuse1"} };
}
	


}