package com.Ao.stepDefinations;
import com.Ao.util.BasePage;
import com.Ao.util.UtilPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.*;
import java.util.concurrent.TimeUnit;

public class AostepDefs extends BasePage {

    @Given("^user navigate to Ao Home page$")
    public void user_navigate_to_Ao_Home_page() {
        // throw new cucumber.api.PendingException();
        BasePage.initialization();
    }

    @When("user entered text as Washing machines in search box")
    public void user_entered_text_as_Washing_machines_in_search_box() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        WebElement el = driver.findElement(By.xpath("//input[@id='siteSearch-input']"));
        el.sendKeys("Washing machines");

    }

    @And("click on search button")
    public void click_on_search_button() throws InterruptedException {
        WebElement searchBtn =
                driver.findElement(By.xpath("//span[@class='ico ico-search leading-none static']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", searchBtn);
    }


    @And("select a brand called Beko from brand lister page")
    public void select_a_brand_called_Beko_from_brand_lister_page() throws InterruptedException {
        WebElement bOption =
                driver.findElement(By.xpath("//a[normalize-space()='Beko']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", bOption);
    }


    @When("I select energy rating as A+++ check box")
    public void I_select_energy_rating_as_A_check_box() throws InterruptedException {
        WebElement bOption =
                driver.findElement(By.xpath("//label[@for='Energy Rating-facet_fv_aplusplusplus-A+++']"));
        driver.manage().timeouts().implicitlyWait(UtilPage.IMPLICIT_WAIT, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", bOption);
    }
    @And("select Wash Load option as Large")
    public void select_Wash_Load_option_as_Large() throws InterruptedException {
        WebElement WLOption =
                driver.findElement(By.id("Wash Load-facet_fv_101112102e51715-Large: 10kg and above"));
        driver.manage().timeouts().implicitlyWait(UtilPage.IMPLICIT_WAIT, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", WLOption);
    }


    @And("select colour as White option")
    public void select_colour_as_silver_option() throws InterruptedException {
        WebElement colourOption =
                driver.findElement(By.id("Colour-facet_fv_white-White"));
        driver.manage().timeouts().implicitlyWait(UtilPage.IMPLICIT_WAIT, TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", colourOption);
    }

    @Then("validate the return results are expected colour and wash load")
    public void validate_the_return_results_are_expected_colour_and_wash_load() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        String expectedText = "Beko WTK104151W 10Kg Washing Machine with 1400 rpm - White - A+++ Rated";
        String actualText = driver.findElement(By.xpath("//h2[contains(text(),'Beko WTK104151W 10Kg Washing Machine with 1400 rpm')]")).getText();
        Thread.sleep(3000);
        Assert.assertTrue("Beko WTK104151W 10Kg Washing Machine with 1400 rpm - White - A+++ Rated", expectedText.equals(actualText));
    }
    @And("also validate the return results are expected energy rating")
    public void also_validate_the_return_results_are_expected_energy_rating() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        Thread.sleep(3000);
        String expectedText = "A+++";
        String actualText = driver.findElement(By.xpath("//*[@id=\"WTK104151W_WH\"]/div/div[2]/div/div/div/div[1]/div[1]/div/div/button/div")).getText();
        Thread.sleep(3000);
        Assert.assertTrue("A+++", expectedText.equals(actualText));

    }
    @After
    @Then("^Close the browser$")
    public void close_the_browser() {
        driver.quit();
    }
}
