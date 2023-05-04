package com.Ao.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@RunWith(SerenityRunner.class)
public class BasePage {

    public static WebDriver driver;
    public static Properties prop;

    public BasePage() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream("src\\test\\java\\com\\Ao\\config\\config.properties");

            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() {
        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")) {
            //   options.addArguments("--no-sandbox");
          //  ChromeOptions option = new ChromeOptions();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setBinary("C:\\Users\\Raghav Reddy\\AppData\\Local\\Google\\Chrome\\Application\\chrome.exe");
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe"); //The chrome version must be below 73
//            ----------- Create Object of ChromeOption Class--------------------------------------------------------------------


         driver = new ChromeDriver();
   //    } else if (browserName.equals("Firefox")) {
   //        System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\geckodriver.exe");
  //          FirefoxOptions option = new FirefoxOptions();
   //         option.setHeadless(true);
    //        driver = new FirefoxDriver(option);
    //       driver = new FirefoxDriver();


            driver.manage().window().maximize();
            driver.manage().getCookies();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(UtilPage.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(UtilPage.IMPLICIT_WAIT, TimeUnit.SECONDS);
            driver.get(prop.getProperty("url"));
         //   driver.get(prop.getProperty("Homeurl"));
        }
    }

}
