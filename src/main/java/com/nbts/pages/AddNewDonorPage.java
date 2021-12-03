package com.nbts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AddNewDonorPage extends BasePage {

    public AddNewDonorPage(WebDriver driver) {
        super(driver);
    }

    private WebElement txtFname=driver.findElement(By.id("firstName"));
    private WebElement txtLname=driver.findElement(By.id("lastName"));
    private WebElement txtID=driver.findElement(By.id("idNumber"));
    private WebElement txtDonorID=driver.findElement(By.id("donorId"));
    private WebElement txtAddress=driver.findElement(By.id("address"));
    private WebElement txtCity=driver.findElement(By.id("city"));
    private WebElement txtMobile=driver.findElement(By.id("telNumber"));
    private WebElement txtEmail=driver.findElement(By.id("email"));
    Select drpBloodType=new Select(driver.findElement(By.id("bloodType")));
    Select drpGender=new Select(driver.findElement(By.id("gender")));
    private WebElement txtPwd=driver.findElement(By.id("password"));
    private WebElement txtVerifyPwd=driver.findElement(By.id("verifPassword"));
    private WebElement btnSubmit=driver.findElement(By.xpath("//button[@type='submit']"));

    /* Add New Donor*/
    public void addStock(String Fname, String Lname, String ID, String DonorID, String Address, String City,String Mobile,
                         String Email,String BloodType, String Gender, String Pwd, String VerifyPwd ) throws InterruptedException {

        txtFname.sendKeys(Fname);
        txtLname.sendKeys(Lname);
        txtID.sendKeys(ID);
        txtDonorID.sendKeys(DonorID);
        txtAddress.sendKeys(Address);
        txtCity.sendKeys(City);
        txtMobile.sendKeys(Mobile);
        txtEmail.sendKeys(Email);
        drpBloodType.selectByVisibleText(BloodType);
        drpGender.selectByVisibleText(Gender);
        txtPwd.sendKeys(Pwd);
        txtVerifyPwd.sendKeys(VerifyPwd);
        btnSubmit.click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    }
}


