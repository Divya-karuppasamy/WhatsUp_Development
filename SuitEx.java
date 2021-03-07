package TestNG;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class SuitEx{
	WebDriver driver;
	static Logger logger=Logger.getLogger(SuitEx.class);
	
	@BeforeTest
	public void Browser(){
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@Test(priority = 0)
	public void CreateAccount(){
		
		driver.findElement(By.linkText("Sign in")).click();
		
		//create account
		  driver.findElement(By.id("email_create")).sendKeys("tester199@test.com");
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  WebElement createaccount=driver.findElement(By.xpath("//*[@class='icon-user left']"));
		  createaccount.click();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		  
		  //personal information
		  
		  WebElement Title=driver.findElement(By.id("id_gender2"));
		  Title.click();
		  
		  WebElement Firstname=driver.findElement(By.id("customer_firstname"));
		  Firstname.sendKeys("HEERA");
		  
		  WebElement Lastname=driver.findElement(By.id("customer_lastname"));
		  Lastname.sendKeys("K");
		  
		  WebElement Password=driver.findElement(By.id("passwd"));
		  Password.sendKeys("test123");
		  
		  WebElement date=driver.findElement(By.id("days"));
		  Select select=new Select(date);
		  select.selectByValue("16");
		  
		  WebElement months=driver.findElement(By.id("months"));
		  Select month=new Select(months);
		  month.selectByValue("11");
		  
		  WebElement years=driver.findElement(By.id("years"));
		  Select year=new Select(years);
		  year.selectByValue("1995");
		  
		  WebElement Address=driver.findElement(By.id("address1"));
		  Address.sendKeys("ABC Street");
		  
		  WebElement City=driver.findElement(By.id("city"));
		  City.sendKeys("Madurai");
		  
		  WebElement States=driver.findElement(By.id("id_state"));
		  Select state=new Select(States);
		  state.selectByValue("7");
		  
		  WebElement pincode=driver.findElement(By.id("postcode"));
		  pincode.sendKeys("00000");
		  
		  WebElement Country=driver.findElement(By.id("id_country"));
		  Select country1=new Select(Country);
		  country1.selectByValue("21");
		  
		  WebElement Mobilenum=driver.findElement(By.id("phone_mobile"));
		  Mobilenum.sendKeys("8012378990");
		  
		  WebElement ref=driver.findElement(By.id("alias"));
		  ref.sendKeys(" Jeno");
		  
		  WebElement Register=driver.findElement(By.id("submitAccount"));
		  Register.click();

	}
	
	/* 
	 @Test(priority = 0)
	public void login() {
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).sendKeys("test1234@tester.com");
		driver.findElement(By.id("passwd")).sendKeys("Divya1234");
		driver.findElement(By.id("SubmitLogin")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}*/
	@Test(priority = 1)
	public void ClickonDress() {
		driver.findElement(By.linkText("DRESSES")).click();
		driver.findElement(By.linkText("Evening Dresses")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority = 2)
	public void Selectphoto() {
		 WebElement Photo=driver.findElement(By.xpath("//*[@class='product_img_link']/img"));
	     Photo.click();
	     
	}
	@Test(priority = 3)
	public void SelectQuantity() {
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@id='quantity_wanted']")).clear();
	     driver.findElement(By.xpath("//input[@id='quantity_wanted']")).sendKeys("2");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority = 4)
	public void Selectsize() {
		WebElement Size=driver.findElement(By.id("group_1"));
	     Select size=new Select(Size);
	     size.selectByValue("3");
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority = 5)
	public void SelectColor() {
		 WebElement Color=driver.findElement(By.id("color_24"));
	     Color.click();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority = 6)
	public void Addtocart() {
		WebElement Addcart=driver.findElement(By.xpath("//*[@name='Submit']/span"));
		 Addcart.click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority = 7)
	public void Proceed() {
		 driver.switchTo().defaultContent();
		WebElement Proceed=driver.findElement(By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span"));
		 Proceed.click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority = 8)
	public void Proceedtocheckout() {
		 WebElement Proceed2=driver.findElement(By.linkText("Proceed to checkout"));
		 Proceed2.click();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority = 9)
	public void Processaddress() {
		 WebElement Proceed3=driver.findElement(By.name("processAddress"));
	     Proceed3.click();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority = 10)
	public void TeamsAndConditions(){
		WebElement Teams=driver.findElement(By.id("cgv"));
	     Teams.click();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority = 11)
	public void ProcessCarrier() {
		WebElement Proceed4=driver.findElement(By.name("processCarrier"));
	     Proceed4.click();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority = 12)
	public void PaybyCheque() {
		WebElement Check=driver.findElement(By.className("cheque"));
	     Check.click();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority = 13)
	public void ConfirmOrder() {
		WebElement Confirmorder=driver.findElement(By.xpath("//*[@class='button btn btn-default button-medium']/span"));
	     Confirmorder.click();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test(priority = 14)
	public void CompleteorNot() {
		String ConfirmationText=driver.findElement(By.xpath("//div[@id='center_column']/p[@class='alert alert-success']")).getText();
	
	
		 if(ConfirmationText.contains("complete")) {
		  	   System.out.println("Order Completed: Test Case Passed");
		  	   System.out.println("Your order on My Store is complete.");
		  	  }
		  	  else {
		  	   System.out.println("Order Not Successfull: Test Case Failed");
		  	  }

	}
	@AfterTest
	public void log() {
		
		DOMConfigurator.configure("log4j.xml");
		
		logger.debug("This is a Debug message");
		logger.info("This is an info");
		logger.warn("This is a warning");
		logger.error("This is an error");
		logger.fatal("This is a fatal message");
		
	}
}
