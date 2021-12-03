package com.nbts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BloodStockPage extends BasePage {

    public BloodStockPage(WebDriver driver) {
        super(driver);
    }


    private WebElement btnAddStock=driver.findElement(By.xpath("//button[contains(text(),'Add Blood Stocks')]"));
    private WebElement btnReleaseStock=driver.findElement(By.xpath("//button[contains(text(),' Release Blood Stocks')]"));
    WebElement TogetRows = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/div/div/div[2]/table"));
    WebElement ToGetColumns = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/main/div/div/div[2]/table/tbody/tr"));

    /* Click Add New Blood Stock Button*/
    public AddBloodStockPage clickAddStockButton() throws InterruptedException {

        btnAddStock.click();
        Thread.sleep(5000);
        return new AddBloodStockPage(driver);

    }

    public void getBloodStockCounts() throws InterruptedException {

        List<WebElement> TotalRowsList = TogetRows.findElements(By.tagName("tr"));
        System.out.println("Total number of Rows in the table are : " + TotalRowsList.size());

        List<WebElement> TotalColsList = ToGetColumns.findElements(By.tagName("td"));
        System.out.println("Total Number of Columns in the table are: " + TotalColsList.size());

        for (int i = 0; i <= TotalRowsList.size() - 1; i++) {
            System.out.println(TotalRowsList.get(i).getText());
        }

        /*List<WebElement> firstcol = driver.findElements(By.xpath("/html/body/div/div/div[2]/div/main/div/div/div[2]/table/tbody/tr/td[2]"));
        for (int j = 0; j <= TotalRowsList.size(); j++) {
            System.out.println(firstcol.get(j).getText());
        }*/
    }
  /*  int dataTableActualRowCount=0;

    JavascriptExecutor js=(JavascriptExecutor)driver;
    driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

    dataTableActualRowCount =  ((Number)js.executeScript("return $('#example').DataTable().rows().data().toArray().length;")).intValue();
  System.out.println("Data table row count="+dataTableActualRowCount);

    String displayedCount = driver.findElement(By.id("example_info")).getText().split(" ")[5];

    int displayedCountOfRowsOnPage = Integer.parseInt(displayedCount);
  System.out.println("Data table display count on page ="+displayedCountOfRowsOnPage);

  if(Integer.compare(dataTableActualRowCount, displayedCountOfRowsOnPage)==0) {
        System.out.println("Displayed count on page is equals to the data table row count ");
    }else {
        System.out.println("Displayed count on page is NOT equals to the data table row count");
        throw new Exception("Displayed count on page is NOT equals to the data table row count");
    }*/
}
