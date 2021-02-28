package com.Ao.pages;

import com.Ao.util.BasePage;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public static String validateLoginPageTitle() {
        return driver.getTitle();
    }

    public void LoginPage() {
        PageFactory.initElements(driver, this);

    }

}

