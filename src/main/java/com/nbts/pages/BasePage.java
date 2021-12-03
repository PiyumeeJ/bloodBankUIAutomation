package com.nbts.pages;


import org.openqa.selenium.WebDriver;

public class BasePage {

    public static WebDriver driver;
    protected long timeOut = 60;

    public BasePage(WebDriver driver) {
        this.driver=driver;
        driver.manage().window().maximize();
    }
}
