package com.stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinStep {
	WebDriver driver;
	@Given("User is on the adactin login page")
	public void user_is_on_the_adactin_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	@When("User should perform login with {string} , {string}")
	public void user_should_perform_login_with(String name, String pass) {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(name);
		WebElement passwrd = driver.findElement(By.id("password"));
		passwrd.sendKeys(pass);
		WebElement btnLogin = driver.findElement(By.id("login"));
		btnLogin.click();

	}

	@When("User should perform search hotel with {string},{string},{string},{string},{string},{string},{string}and{string}")
	public void user_should_perform_search_hotel_with_and(String loc, String htl, String roomType, String noOfRoom, String ckIn, String ckOut, String adult, String child) {
		WebElement location = driver.findElement(By.id("location"));
		Select select=new Select(location);
		select.selectByVisibleText(loc);
		
		WebElement locat = driver.findElement(By.id("location"));
		Select s1=new Select(locat);
		s1.selectByVisibleText(loc);
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s2=new Select(hotel);
		s2.selectByVisibleText(htl);
		
		WebElement rmType = driver.findElement(By.id("room_type"));
		Select s3=new Select(rmType);
		s3.selectByVisibleText(roomType);
		
		WebElement noRoom = driver.findElement(By.id("room_nos"));
		Select s4=new Select(noRoom);
		s4.selectByVisibleText(noOfRoom);
		
		WebElement checkInDate = driver.findElement(By.id("datepick_in"));
		checkInDate.sendKeys(ckIn);
		
		WebElement checkOutDate = driver.findElement(By.id("datepick_out"));
		checkOutDate.sendKeys(ckOut);
		WebElement adultPerRoom = driver.findElement(By.id("adult_room"));
		Select s7=new Select(adultPerRoom);
		
		s7.selectByVisibleText(adult);
		WebElement childPerRoom = driver.findElement(By.id("child_room"));
		Select s8=new Select(childPerRoom);
		s8.selectByVisibleText(child);
		
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();

	}

	@When("User should perform select the hotel")
	public void user_should_perform_select_the_hotel() {
		WebElement selectHotel = driver.findElement(By.id("radiobutton_0"));
		selectHotel.click();
		
		WebElement conti = driver.findElement(By.id("continue"));
		conti.click();
	}

	@When("User should perform book hotel with {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_should_perform_book_hotel_with_and(String firstName, String lastName, String address, String ccNo, String ccType, String exMonth, String exyear, String cvv) {

	WebElement fName = driver.findElement(By.id("first_name"));
	fName.sendKeys(firstName);
	
	WebElement lName = driver.findElement(By.id("last_name"));
	lName.sendKeys(lastName);
	
	WebElement add = driver.findElement(By.id("address"));
	add.sendKeys(address);
	
	WebElement cardNo = driver.findElement(By.id("cc_num"));
	cardNo.sendKeys(ccNo);
	
	WebElement cardType = driver.findElement(By.id("cc_type"));
	cardType.sendKeys(ccType);
	
	WebElement month = driver.findElement(By.id("cc_exp_month"));
	month.sendKeys(exMonth);
	
	WebElement year = driver.findElement(By.id("cc_exp_year"));
	year.sendKeys(exyear);
	
	WebElement cvvNumber = driver.findElement(By.id("cc_cvv"));
	cvvNumber.sendKeys(cvv);
	
	WebElement book= driver.findElement(By.id("book_now"));
	book.click();
	
	
	
	}
	
	@Then("Verify should after login Booking Confirmation")
	public void verify_should_after_login_Booking_Confirm() {

		WebElement orderNo = driver.findElement(By.xpath("//input[@name='order_no']"));
		String attribute = orderNo.getAttribute("value");
		System.out.println(attribute);
		driver.quit();
	}
	








}
