package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WordCloudTest {
    public static void main(String[] args){
        try {
            // path set to the chromedriver
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            //maximize the window
            driver.manage().window().maximize();
            // to open the url to be open
            driver.get("https://qawordcloud.ccbp.tech/");
            // enter the text as a input
            WebElement inputText=driver.findElement(By.xpath("//input[@id='userInput']"));
            inputText.sendKeys("light");
            // add to the text on display
            WebElement textAdd=driver.findElement(By.xpath("//button[@id='addBtn']"));
            // click button
            textAdd.click();
            // clear the inputfeild
            inputText.clear();
            // enter the second input
            WebElement inputText1=driver.findElement(By.xpath("//input[@id='userInput']"));
            inputText1.sendKeys("flight");
            // clcik the add button
            WebElement textAdd1=driver.findElement(By.xpath("//button[@id='addBtn']"));
            // to click the button
            textAdd1.click();
            // exit the driver
            driver.close();





        }catch (Exception e){
            System.out.println("hi venkatesh uhave an exception error:"+e);
        }
    }
}
