package com.Ao.stepDefinations;

import com.Ao.util.BasePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PIExampleTeststepDefs extends BasePage {

    @Given("user navigate to RestfulBookerPlatform Home page")
    public void user_navigate_to_RestfulBookerPlatform_Home_page() {
        // Write code here that turns the phrase above into concrete actions
        BasePage.initialization();
    }

    @When("I click on admin panel link")
    public void i_click_on_admin_panel_link() throws InterruptedException {
        WebElement link =
                driver.findElement(By.cssSelector("a[alt='Link to admin page']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);
        js.executeScript("arguments[0].click();", link);
    }

    @And("I enter username in text box")
    public void i_enter_username_in_text_box() {
        // Write code here that turns the phrase above into concrete actions
        WebElement ele = driver.findElement(By.xpath("//input[@id='username']"));
        ele.sendKeys("admin");
    }

    @When("I enter password in text box")
    public void i_enter_password_in_text_box() {
        // Write code here that turns the phrase above into concrete actions
        WebElement el = driver.findElement(By.cssSelector("#password"));
        el.sendKeys("password");
    }

    @And("I click on login button")
    public void i_click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        WebElement login =
                driver.findElement(By.xpath("//button[@id='doLogin']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", login);
    }

    @Then("click on logout button")
    public void click_on_logout_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(5000);
        WebElement logout =
                driver.findElement(By.xpath("//a[normalize-space()='Logout']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", logout);
    }

    @When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
    public void I_enter_Username_as_and_Password_as(String arg1, String arg2) {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
        ;
        driver.findElement(By.cssSelector("#password")).sendKeys("password");
        ;
        driver.findElement(By.xpath("//button[@id='doLogin']")).click();
    }

    @Then("^login should be unsuccessful$")
    public void validateRelogin() {
        if (driver.getCurrentUrl().equalsIgnoreCase(
                "https://automationintesting.online/#/admin")) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Failed");
        }
        driver.close();
    }

    @When("I enter booking details \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"")
    public void i_enter_booking_details(String arg1, String arg2, String arg3, String arg4, String arg5) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='roomName']")).sendKeys("101");

        Select select = new Select(driver.findElement(By.xpath("//select[@id='type']")));
        select.selectByVisibleText("Twin");
        Select Aselect = new Select(driver.findElement(By.xpath("//select[@id='accessible']")));
        Aselect.selectByVisibleText("false");
        driver.findElement(By.xpath("//input[@id='roomPrice']")).sendKeys("100");
        driver.findElement(By.xpath("//input[@id='wifiCheckbox']")).click();
        driver.findElement(By.xpath("//input[@id='tvCheckbox']")).click();
    }

    @Then("click create button")
    public void click_create_button() {
        driver.findElement(By.xpath("//button[@id='createRoom']")).click();
        driver.close();
    }
}




