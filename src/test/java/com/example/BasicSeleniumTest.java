package com.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class BasicSeleniumTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeEach
    public void setUp(){
        WebDriverManager.firefoxdriver().setup();

        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--headless");
        driver = new FirefoxDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @AfterEach
    public void tearDown(){
        if (driver != null){
            driver.quit();
        }
    }

    private ExpectedCondition<Boolean> pageTitleStartWith(final String searchString) {
        return webDriver -> webDriver.getTitle().toLowerCase().contains(searchString.toLowerCase());
    }

    private void storeExampleThatSearchFor(final String searchString){
        driver.get("http://demo-store.seleniumacademy.com/");
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.click();
        searchField.sendKeys(searchString.toLowerCase());
        searchField.submit();
        wait.until(pageTitleStartWith(searchString));
        assertTrue("The page title does not start with thee search string", driver.getTitle().toLowerCase().contains(searchString.toLowerCase()));
    }
    @Test
    public void searchOneExample() {
        storeExampleThatSearchFor("CHELSEA");
    }
    @Test
    public void searchSecondExample() {
        storeExampleThatSearchFor("ELIZABETH");
    }
}
