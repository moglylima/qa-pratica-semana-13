package com.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.example.BasePage;

public class LoginPage extends BasePage {

    private By inputUserName = By.id("username");
    private By inputPassword = By.id("password");
    private By btnLogin = By.xpath("/html/body/div[2]/div/div/form/button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fillInUserName(String userName) {
        driver.findElement(inputUserName).sendKeys(userName);
    }

    public void fillInPassword(String password) {
        driver.findElement(inputPassword).sendKeys(password);
    }

    public void clickButtonLogin() {
        driver.findElement(btnLogin).click();
    }

}
