package com.nbts.test;


import com.nbts.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NBTSTest {
    LoginPage login;
    DashboardPage dbPage;
    BloodStockPage bloodStockPage;
    AddBloodStockPage addbloodStockPage;
    DonorPage donorPage;
    AddNewDonorPage addNewDonorPage;
    AddNewHospitalPage addNewHospitalPage;
    HospitalPage hospitalPage;

    WebDriver driver;

    @BeforeTest
    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://localhost:3001/login");
        driver.manage().deleteAllCookies();
    }

    @Test
    public void login() throws InterruptedException {
        driver.navigate().refresh();
        login=new LoginPage(driver);
        login.loginPage("admin","admin","Admin");
        dbPage=new DashboardPage(driver);
        dbPage.clickLogoutButton();
}

    @Test
    public void getBloodStockDetails() throws InterruptedException {
        driver.navigate().refresh();
        login=new LoginPage(driver);
        login.loginPage("admin","admin","Admin");
        dbPage=new DashboardPage(driver);
        dbPage.clickBloodStockTab();
        bloodStockPage=new BloodStockPage(driver);
        bloodStockPage.getBloodStockCounts();
        dbPage.clickLogoutButton();
    }

    @Test
    public void addNewBloodStock() throws InterruptedException {
        driver.navigate().refresh();
        login=new LoginPage(driver);
        login.loginPage("admin","admin","Admin");
        dbPage=new DashboardPage(driver);
        dbPage.clickBloodStockTab();
        bloodStockPage=new BloodStockPage(driver);
        addbloodStockPage=bloodStockPage.clickAddStockButton();
        addbloodStockPage=new AddBloodStockPage(driver);
        addbloodStockPage.addStock("aPls", "1","908642651V","11/06/2021","12/12/2021", "100235");
        addbloodStockPage.clickLogoutButton();
    }

    @Test
    public void getDonorDetails() throws InterruptedException {
        driver.navigate().refresh();
        login=new LoginPage(driver);
        login.loginPage("admin","admin","Admin");
        dbPage=new DashboardPage(driver);
        dbPage.clickDonorTab();
        donorPage=new DonorPage(driver);
        donorPage.getDonorDetails();
        dbPage.clickLogoutButton();
         }

    @Test
    public void addNewDonors() throws InterruptedException {
        driver.navigate().refresh();
        login=new LoginPage(driver);
        login.loginPage("admin","admin","Admin");
        dbPage=new DashboardPage(driver);
        dbPage.clickDonorTab();
        donorPage=new DonorPage(driver);
        donorPage.clickAddDonorButton();
        addNewDonorPage=new AddNewDonorPage(driver);
        addNewDonorPage.addStock("Menaka","Silva","673245321V","673245321","Moratuwa","Moratuwa","0786563543","menakasilva@gmail.com","A+","Female","Menaka12345","Menaka12345");
        dbPage.clickLogoutButton();
    }

    @Test
    public void addNewHospital() throws InterruptedException {
        driver.navigate().refresh();
        login=new LoginPage(driver);
        login.loginPage("admin","admin","Admin");
        dbPage=new DashboardPage(driver);
        dbPage.clickHospitalTab();
        hospitalPage=new HospitalPage(driver);
        hospitalPage.clickAddHospitalButton();
        addNewHospitalPage=new AddNewHospitalPage(driver);
        addNewHospitalPage.addNewHospital("Kaluthara Hospital","11","0342222261","General Hospital, Mathugama Road, Kaluthara","10322");
        dbPage.clickLogoutButton();
        //Assert.assertEquals(, true);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}