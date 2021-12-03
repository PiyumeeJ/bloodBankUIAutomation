package com.nbts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DashboardPage extends BasePage {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    private WebElement lnkBloodStock=driver.findElement(By.xpath("//a[contains(text(),'Blood Stocks')]"));
    private WebElement lnkDonor=driver.findElement(By.xpath("//a[contains(text(),'Donors')]"));
    private WebElement lnkHospitals=driver.findElement(By.xpath("//a[contains(text(),'Hospitals')]"));
    private WebElement lnkProductRequests=driver.findElement(By.xpath("//a[contains(text(),'Product Requests')]"));
    private WebElement lnkSearchProducts=driver.findElement(By.xpath("//a[contains(text(),'Search Products')]"));
    private WebElement lnkUsers=driver.findElement(By.xpath("//a[contains(text(),'Users')]"));
    private WebElement lnkReports=driver.findElement(By.xpath("//a[contains(text(),'Reports')]"));
    private WebElement clickAvatar=driver.findElement(By.xpath("/html/body/div/div/div[2]/header/ul[2]/li[2]/a/div/img"));
    private WebElement clickLogout=driver.findElement(By.xpath("/html/body/div/div/div[2]/header/ul[2]/li[2]/div/a"));


   /* Click logout button*/
    public void clickLogoutButton() throws InterruptedException {

        clickAvatar.click();
        clickLogout.click();
        Thread.sleep(4000);
    }

    /* Click Blood stock tab*/
    public BloodStockPage clickBloodStockTab() throws InterruptedException {
        /*JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", lnkBloodStock);*/
        lnkBloodStock.click();
        Thread.sleep(3000);
        return new BloodStockPage(driver);
    }

    /* Click Donor tab*/
    public DonorPage clickDonorTab() throws InterruptedException {

        lnkDonor.click();
        Thread.sleep(5000);
        return new DonorPage(driver);
    }

    /* Click Hospital tab*/
    public HospitalPage clickHospitalTab() throws InterruptedException {

        lnkHospitals.click();
        Thread.sleep(5000);
        return new HospitalPage(driver);
    }

    /* Click Product Request tab*/
    public ProductRequestPage clickProductRequestTab() throws InterruptedException {

        lnkProductRequests.click();
        Thread.sleep(5000);
        return new ProductRequestPage(driver);
    }

    /* Click Search Products tab*/
    public SearchProductsPage clickSearchProductsTab() throws InterruptedException {

        lnkSearchProducts.click();
        Thread.sleep(5000);
        return new SearchProductsPage(driver);
    }

    /* Click Users tab*/
    public UsersPage clickUsersTab() throws InterruptedException {

        lnkUsers.click();
        Thread.sleep(5000);
        return new UsersPage(driver);
    }

    /* Click Reports tab*/
    public ReportsPage clickReportsTab() throws InterruptedException {

        lnkReports.click();
        Thread.sleep(5000);
        return new ReportsPage(driver);
    }

/*
    public boolean isTextFieldPresent() {
        flag = false;
        try {
            logInstruction("LOG INSTRUCTION: VERIFY IF TEXT FIELD IS PRESENT");
            textField1.waitToBeDisplayed();
            if (textField1.isDisplayed())
                flag = true;
            logInstruction("LOG INSTRUCTION: RETURNED BOOLEAN VALUE IF TEXT FIELD IS PRESENT" + flag);
        } catch (TimeOutException | WebDriverException e) {
            throw new RuntimeException(
                    "UNABLE TO VERIFY IF TEXT FIELD IS PRESENT \nMETHOD: isTextFieldPresent.\n"
                            + e.getLocalizedMessage());
        }
        return flag;
    }
*/

}
