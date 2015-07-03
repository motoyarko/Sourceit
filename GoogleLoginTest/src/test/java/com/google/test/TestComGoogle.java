package com.google.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ua.com.sourceit.HomePage;
import ua.com.sourceit.Locators;
import ua.com.sourceit.ResultPage;
import ua.com.sourceit.Wait;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by motoyarko on 30-Jun-15.
 */
public class TestComGoogle {

    WebDriver driver;
    WebDriverWait wait;
    private String searchInGoogle = new Locators().getSearchInGoogle();
    private String linkForSearch = new Locators().getLinkForSearch();
    private String homePage = new Locators().getHomePage();
    private String locatorResult = new Locators().getLocatorResult();


    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 20);
        driver.get(homePage);
    }

    @Test
    public void shouldBeSourceIt() throws Exception {
        HomePage home = new HomePage(driver);
        ResultPage resultPage = home.search(searchInGoogle);
        System.out.println(resultPage.getFirstResultLink(driver, locatorResult));
        assertTrue(resultPage.getFirstResultLink(driver, locatorResult).contains(linkForSearch));
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }
}
