package com.nbts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AddNewHospitalPage extends BasePage {

    public AddNewHospitalPage(WebDriver driver) {
        super(driver);
    }

    private WebElement txtName=driver.findElement(By.id("hospitalName"));
    private WebElement txtID=driver.findElement(By.id("hospitalId"));
    private WebElement txtTel=driver.findElement(By.id("telNumber"));
    private WebElement txtStreet=driver.findElement(By.id("street"));
    private WebElement txtPostalCode=driver.findElement(By.id("postal-code"));
    private WebElement txtLocationLat=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/div/div/div/div/div/div/div/form/div[7]/div[2]/p[1]"));
    private WebElement txtLocationLng=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/div/div/div/div/div/div/div/form/div[7]/div[2]/p[2]"));
    private WebElement btnSubmit=driver.findElement(By.xpath("//button[@type='submit']"));
    private WebElement drpCity=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/div/div/div/div/div/div/div/form/div[5]/div[1]/div/div/button"));
    private WebElement cityValue=driver.findElement(By.xpath("//a[contains(text(),'Anuradhapura')]"));
    private WebElement drpProvince=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/div/div/div/div/div/div/div/form/div[6]/div/button"));
    private WebElement provinceValue=driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/div/div/div/div/div/div/div/form/div[6]/div/div/a[7]"));

    /* Add New Hospital*/
    public void addNewHospital(String name, String ID, String Mobile, String Street, String PostalCode) throws InterruptedException {

        txtName.sendKeys(name);
        txtID.sendKeys(ID);
        txtTel.sendKeys(Mobile);
        txtStreet.sendKeys(Street);
        txtPostalCode.sendKeys(PostalCode);
        drpCity.click();
        cityValue.click();
        drpProvince.click();
        provinceValue.click();
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].innerHTML = '" + "\"lat\":8.3044083309738" +"';", txtLocationLat);
        JavascriptExecutor executor1 = (JavascriptExecutor)driver;
        executor1.executeScript("arguments[0].innerHTML = '" + "\"lng\":80.40798632031253" +"';", txtLocationLng);
       // ((JavascriptExecutor)driver).executeScript("document.getElementBypath('/html/body/div/div/div[2]/div/main/div/div/div/div/div/div/div/form/div[7]/div[2]/p[1]').value='"+30.3434434+"'");
        Thread.sleep(2000);
        btnSubmit.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }
}
