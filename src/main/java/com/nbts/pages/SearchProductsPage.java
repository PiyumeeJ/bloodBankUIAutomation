package com.nbts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchProductsPage extends BasePage {

    public SearchProductsPage(WebDriver driver) {
        super(driver);
    }


    private WebElement btnAddStock=driver.findElement(By.xpath("//button[contains(text(),'Add Blood Stocks')]"));
    private WebElement btnReleaseStock=driver.findElement(By.xpath("//button[contains(text(),' Release Blood Stocks')]"));

    /* Click Add New Blood Stock Button*/
    public AddBloodStockPage clickAddStockButton() throws InterruptedException {

        btnAddStock.click();
        Thread.sleep(5000);
        return new AddBloodStockPage(driver);

    }
}
