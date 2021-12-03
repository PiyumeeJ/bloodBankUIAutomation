package com.nbts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BasePage {

   //Elements
    private WebElement txtUsername=driver.findElement(By.xpath("//input[@placeholder='Username']"));
    private WebElement txtPassword=driver.findElement(By.xpath("//input[@placeholder='Password']"));
    private WebElement clickDrpRole=driver.findElement(By.xpath("//a[@Class='dropdown-toggle dropdown-toggle-split btn btn-secondary']"));
    private WebElement drpRole=driver.findElement(By.xpath("//a[contains(text(),'Admin')]"));
    private WebElement btnSignIn=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));

//Constructor
public LoginPage(WebDriver driver) {
    super(driver);
}

    public LoginPage loginPage(String Username, String password, String role) throws InterruptedException {

        txtUsername.clear();
        txtUsername.sendKeys(Username);
        txtPassword.clear();
        txtPassword.sendKeys(password);
        clickDrpRole.click();
        drpRole.click();
        btnSignIn.click();
        Thread.sleep(5000);
        return this;
    }
}
