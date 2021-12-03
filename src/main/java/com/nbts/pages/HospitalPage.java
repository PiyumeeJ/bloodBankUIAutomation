package com.nbts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HospitalPage extends BasePage {

    public HospitalPage(WebDriver driver) {
        super(driver);
    }

    private WebElement btnAddNewHospital=driver.findElement(By.xpath("//button[contains(text(),'Add New Hospital')]"));
    WebElement TogetRows = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/div/div/div[3]/table"));
    WebElement ToGetColumns = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/div/div/div[3]/table/tbody/tr"));

    /* Click Add New Hospital Button*/
    public AddNewHospitalPage clickAddHospitalButton() throws InterruptedException {

        btnAddNewHospital.click();
        Thread.sleep(5000);
        return new AddNewHospitalPage(driver);

    }

    /*Get Hospital Details*/
    public void getHospitalDetails() throws InterruptedException {

        List<WebElement> TotalRowsList = TogetRows.findElements(By.tagName("tr"));
        System.out.println("Total number of Rows in the table are : " + TotalRowsList.size());

        List<WebElement> TotalColsList = ToGetColumns.findElements(By.tagName("td"));
        System.out.println("Total Number of Columns in the table are: " + TotalColsList.size());

        for (int i = 0; i <= TotalRowsList.size() - 1; i++) {
            System.out.println(TotalRowsList.get(i).getText());
        }
    }

}
