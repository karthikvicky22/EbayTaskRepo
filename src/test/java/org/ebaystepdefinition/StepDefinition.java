package org.ebaystepdefinition;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {

	public WebDriver driver;
	JavascriptExecutor js;

	@Given("user launch ebay application")
	public void user_launch_ebay_application() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

	}

	@When("user choose  electronic category")
	public void user_choose_electronic_category() {

		WebElement entruser = driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
		entruser.click();

	}

	@When("user choose subcategory cellphone,smart watches&accessories and branch")
	public void user_choose_subcategory_cellphone_smart_watches_accessories_and_branch() throws InterruptedException {
		WebElement clickproduct = driver
				.findElement(By.xpath("//a[text()='Cell Phones, Smart Watches & Accessories']"));
		clickproduct.click();
		WebElement clickspec = driver.findElement(By.xpath("//a[text()='Cell Phones & Smartphones']"));
		clickspec.click();
		Thread.sleep(2000);

	}

	@When("user select seeall button")
	public void user_select_seeall_button() throws InterruptedException {
		WebElement clicktosee = driver.findElement(By.xpath("(//span[text()='See All'])[1]"));
		clicktosee.click();
		Thread.sleep(2000);

	}

	@When("user select filters")
	public void user_select_filters() throws InterruptedException {
		WebElement clickbrand = driver.findElement(By.xpath("//div[@id='c3-mainPanel-Brand']"));
		clickbrand.click();

		Thread.sleep(2000);

		WebElement clickapple = driver.findElement(By.xpath("(//span[@class='field'])[11]"));
		clickapple.click();

		Thread.sleep(2000);

		WebElement clicksize = driver.findElement(By.xpath("//div[@id='c3-mainPanel-Screen%20Size']"));
		clicksize.click();

		Thread.sleep(2000);
		WebElement clickinch = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		clickinch.click();

		Thread.sleep(2000);
		WebElement clicklocation = driver.findElement(By.xpath("(//div[@class='x-overlay-aspect '])[24]"));
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", clicklocation);
		Thread.sleep(2000);
		clicklocation.click();

		Thread.sleep(2000);
		WebElement clickwide = driver.findElement(By.xpath("(//input[@type='radio'])[4]"));
		clickwide.click();

	}

	@When("user click apply button")
	public void user_click_apply_button() {
		WebElement clickapply = driver.findElement(By.xpath("(//button[@type='button'])[33]"));
		clickapply.click();

	}

	@Then("user see results based on applied filters")
	public void user_see_results_based_on_applied_filters() throws InterruptedException {
		Thread.sleep(2000);
		WebElement phoneInch = driver.findElement(By.xpath("(//span[text()='Apple 5.0 - 5.4 Inch Cell Phones & Smartphones'])[2]"));
		
		Assert.assertTrue(phoneInch.getText().contains("5.0"));
	}

}
