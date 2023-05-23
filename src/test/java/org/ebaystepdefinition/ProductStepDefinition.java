package org.ebaystepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDefinition {

	public static WebDriver driver;

	
	@When("user enter the product to search")
	public void user_enter_the_product_to_search() throws InterruptedException {
		WebElement entrstring = driver.findElement(By.xpath("//input[@id='gh-ac']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeAsyncScript("arguments[0].setAttribute('value','macbook');", entrstring);
	}

	@When("user click search button")
	public void user_click_search_button() throws InterruptedException {
		WebElement clicksrch = driver.findElement(By.xpath("//input[@type='submit']"));
		clicksrch.click();
		Thread.sleep(2000);

	}

	@When("user choose the search category")
	public void user_choose_the_search_category() {
		WebElement clickcatogry = driver.findElement(By.xpath("(//select[@class='gh-sb '])[1]"));
		clickcatogry.click();
		WebElement option = driver.findElement(By.id("gh-cat"));

		Select s = new Select(option);
		s.selectByVisibleText("Computers/Tablets & Networking");

		WebElement clicksubmit = driver.findElement(By.xpath("(//input[@type='submit'])[1]"));
		clicksubmit.click();

	}

	@Then("user see the products based on")
	public void user_see_the_products_based_on() {
		System.out.println("java");
	}

	

}
