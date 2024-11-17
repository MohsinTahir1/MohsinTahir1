package rahulshettyacademy.selenimframeworkpageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import rahulshettyabstractcomponenetsreuse.abstractcomponents;

public class productcatlogue extends abstractcomponents {
	WebDriver driver;
public productcatlogue(WebDriver driver) {
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
//WebElement email=driver.findElement(By.id("userEmail"));
//Page Factory
//List<WebElement>Products=driver.findElements(By.cssSelector(".mb-3"));

@FindBy(css=".mb-3")
List<WebElement> Products;
@FindBy(css="[routerlink='/dashboard/cart']")
WebElement cart;
@FindBy(css=".cartSection h3")
List<WebElement> cartProduct;
@FindBy(css=".totalRow button")
WebElement checkou;
By Toastmeesage=By.id("toast-container");
By Toastmeesagedisapper=By.id("toast-container");
public  List<WebElement> productss() {
	return Products;

}
public WebElement getproduct()
{
	 WebElement prod=  Products.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);
	 return prod;
}
public void addproduct() {
	WebElement prod=getproduct();
	prod.findElement(By.className("w-10")).click();
	waitelementtoappear(Toastmeesage);
	waitelementtodisapper(Toastmeesagedisapper);
	
}
public void clickcart()
{
 cart.click();	
}
public List<WebElement> cartProducts() {
	return cartProduct;
}
public boolean productmatch() {
	boolean productmatches=cartProduct.stream().anyMatch(producttextassert->producttextassert.getText().equalsIgnoreCase("ZARA COAT 3"));
	return productmatches;
}
public void checkout() {
	checkou.click();
}

}


