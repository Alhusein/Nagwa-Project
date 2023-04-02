package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D02_SearchStepDef {

    @Given("user clicks on search field")
    public void search() {
        WebElement searchIcon = Hooks.driver.findElement(By.className("search"));
        searchIcon.click();
    }

    @And("user search for lesson name like \"addition\"")
    public void searchTxt()
    {
        WebElement searchField = Hooks.driver.findElement(By.id("txt_search_query"));
        searchField.sendKeys("addition");
    }

    @And("user click on Enter Button")
    public void EntClick() throws InterruptedException {
        Hooks.driver.findElement(By.id("txt_search_query")).sendKeys(Keys.ENTER);
        Thread.sleep(4000);
    }

    @Then("user could search successfully")
    public void search_successfully() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://www.nagwa.com/en/search/?q=addition"), "search URL");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    @And("user click on 2nd lesson in the search result")
    public void ndLesson()
    {
       WebElement lesson = Hooks.driver.findElement(By.xpath("/html/body/div/div/div/div/main/div[3]/ul/li[2]/div/a"));
       lesson.click();
    }

    @Then("user can navigate to its home page successfully")
    public void  chosse_successfully() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://www.nagwa.com/en/lessons/568150658980/"), "search URL");
        Thread.sleep(4000);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @And("user go to worksheet section and click preview button")
    public void worksheet()
    {
        WebElement worksheet = Hooks.driver.findElement(By.xpath("/html/body/div/div/div/div/aside/div/ul/li[4]/div/a"));
        worksheet.click();
    }

    @And("user can navigate to worksheet page successfully")
    public void navigate_successfully()
    {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://www.nagwa.com/en/worksheets/737102191030/"), "search URL");
    }

    @Then("count number of questions displayed on web page and print the count")
    public void countNum()
    {
        List<WebElement> count = Hooks.driver.findElements(By.tagName("b"));
        System.out.println("The Number of Questions: " + count.size() );
    }









}
