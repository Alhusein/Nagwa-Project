package org.example.StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class D01_LanguageStepDef
{
    @Given("User go to home page")
    public void HomePage() throws InterruptedException {
        WebElement DL = Hooks.driver.findElement(By.className("dropdown"));
        DL.click();
        Thread.sleep(3000);
    }

    @And("user choose a language to open the home page")
    public void chooseLanguage() {
        String optioToSelect= "English";
        int count= 0;
        List<WebElement> optionList = Hooks.driver.findElements(By.xpath("//ul[@class= 'dropdown-menu languages']//li"));
        for (WebElement ele: optionList){
            String currentOption = ele.getText();
            if (currentOption.contains(optioToSelect)){
                ele.click();
                count++;
                break;
            }
        }
        if(count!=0){
            System.out.println(optioToSelect + "has been selected in the DD");
        }
        else {
            System.out.println("erorr");
        }


    }
}
