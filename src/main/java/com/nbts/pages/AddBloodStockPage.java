package com.nbts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddBloodStockPage extends BasePage {

    public AddBloodStockPage(WebDriver driver) {
        super(driver);
    }


    Select drpProductType=new Select(driver.findElement(By.id("product-select")));
    Select drpProductUnits=new Select(driver.findElement(By.id("product-unit-select")));
    Select drpDonorID=new Select(driver.findElement(By.id("donor-select")));
    private WebElement dateExtracted=driver.findElement(By.id("extract-date-input"));
    private WebElement dateExpre=driver.findElement(By.id("expire-date-input"));
    private WebElement txtUnitID=driver.findElement(By.id("unit-id-input"));
    private WebElement btnSubmit=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/div/div/div/div/div/div/footer/button[1]"));
    private WebElement btnReset=driver.findElement(By.xpath("//button[@type='reset']"));
    private WebElement clickAvatar=driver.findElement(By.xpath("/html/body/div/div/div[2]/header/ul[2]/li[2]/a/div/img"));
    private WebElement clickLogout=driver.findElement(By.xpath("/html/body/div/div/div[2]/header/ul[2]/li[2]/div/a"));

    /* Add New Blood Stock*/
    public void addStock(String type, String units, String DonorID, String ExtractedDate, String ExpireDate, String UnitID) throws InterruptedException {

        drpProductType.selectByValue(type);
        drpProductUnits.selectByVisibleText(units);
        drpDonorID.selectByVisibleText(DonorID);
        dateExtracted.sendKeys(ExtractedDate);
        dateExpre.sendKeys(ExpireDate);
        txtUnitID.sendKeys(UnitID);
         JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", btnSubmit);
        Thread.sleep(5000);
    }
    public void clickLogoutButton() throws InterruptedException {

        clickAvatar.click();
        clickLogout.click();
    }
}
