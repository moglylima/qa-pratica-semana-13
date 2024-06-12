package com.example.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.example.pages.LoginPage;
import com.example.support.WebSetup;

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setUp() {
        driver = WebSetup.getDriver();
        loginPage = new LoginPage(driver);
        loginPage.navigateTo("https://the-internet.herokuapp.com/login");
    }

    @Test
    public void testLogin() {
        loginPage.fillInUserName("tomsmith");
        loginPage.fillInPassword("SuperSecretPassword!");
        loginPage.clickButtonLogin();

        assertTrue(driver.getPageSource().contains("You logged into a secure area!"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
