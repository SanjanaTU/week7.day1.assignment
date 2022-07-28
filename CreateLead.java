package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	
public ChromeDriver driver; // global variable



@Given("Open the chrome browser")
public void openBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

}

@Given("Load the application url")
public void loadApplicationUrl() {
	driver.get("http://leaftaps.com/opentaps");
}

@Given("Enter the username as {string}")
public void enterUsername(String uName) {
	driver.findElement(By.id("username")).sendKeys(uName);
	
}

@Given("Enter the password as {string}")
public void enterPassword(String pWord) {
	driver.findElement(By.id("password")).sendKeys(pWord);
}

@When("Click on Login button")
public void clickLogin() {
	driver.findElement(By.className("decorativeSubmit")).click();
}

@Then("Homepage should be displayed")
public void verifyHomepage() {
	boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
	if(displayed) {
		System.out.println("Homepage is displayed");
	}
	else {
		System.out.println("Homepage is not displayed");
	}
}

@When("Click on {string} link")
public void CRMSFA(String link) {
	driver.findElement(By.linkText(link)).click();
	
}

@Then("{string} Page should be displayed")
public void myHome(String myhome) {
	boolean displayed = driver.findElement(By.linkText(myhome)).isDisplayed();
	
}
@Given("Enter the CompanyName as {string}")
public void companyName(String Cname) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cname);
	
}

@Given("Enter the FirstName as {string}")
public void firstName(String Fname) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(Fname);
	
}

@Given("Enter the LastName as {string}")
public void lastName(String Lname) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(Lname);
	
}

@Given("Enter the phone number as {string}")
public void phoneNumber(String phno) {
	driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
	
}

@When("Click on Create Lead button")
public void clickCreate() {
	driver.findElement(By.name("submitButton")).click();
	
}

@Then("New Lead should be created")
public void newLead() {
	boolean displayed = driver.findElement(By.xpath("//div[text()='View Lead']")).isDisplayed();
	
}
}