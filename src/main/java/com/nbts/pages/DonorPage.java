package com.nbts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DonorPage extends BasePage {

    public DonorPage(WebDriver driver) {
        super(driver);
    }

    private WebElement btnAddDonor=driver.findElement(By.xpath("//button[contains(text(),'Add New Donor')]"));
    WebElement ToGetColumns = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/div/div/div[3]/table/tbody/tr"));
    WebElement TogetRows = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/div/div/div[3]/table"));

    /* Click Add Donor button*/
    public void clickAddDonorButton() throws InterruptedException {

        btnAddDonor.click();
       Thread.sleep(5000);
    }

    /*Get Donor Details*/
    public void getDonorDetails() throws InterruptedException {

        List<WebElement> TotalRowsList = TogetRows.findElements(By.tagName("tr"));
        System.out.println("Total number of Rows in the table are : " + TotalRowsList.size());

        List<WebElement> TotalColsList = ToGetColumns.findElements(By.tagName("td"));
        System.out.println("Total Number of Columns in the table are: " + TotalColsList.size());

        for (int i = 0; i <= TotalRowsList.size() - 1; i++) {
            System.out.println(TotalRowsList.get(i).getText());
        }
        /*List<WebElement> firstcol = driver.findElements(By.xpath("/html/body/div/div/div[2]/div/main/div/div/div[3]/table/tbody/tr/td[2]"));
        for (int j = 0; j <= TotalRowsList.size(); j++) {
            System.out.println(firstcol.get(j).getText());
        }*/
    }

    /*public boolean isImageOpenedAfterClickOnIt() {
        return findByXPath("//a[text()='12 health benefits of avocado']").isDisplayed();
    }*/

/*
    private static UUID hasProgram = UUID.randomUUID();
    private static UUID hasDiscipline = UUID.randomUUID();
    UUID hasSubject1 = UUID.randomUUID();
    UUID hasSubject2 = UUID.randomUUID();
    UUID hasKeyword1 = UUID.randomUUID();
    UUID hasKeyword2 = UUID.randomUUID();


    Random random = new Random();
    int randomId = random.nextInt(999);
    String DH_ID = "PD0000" + randomId;
    String productCode = "900" + randomId;
    String doi = "10.1002/(ISSN)1553-4" + randomId;*/






}
