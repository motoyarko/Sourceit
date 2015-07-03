package ua.com.sourceit;

/**
 * Created by motoyarko on 03-Jul-15.
 */
public class Locators {

    private String linkForSearch = "http://source-it.com.ua";
    private String searchInGoogle = "source-it";
    private String locatorSearchField = "#lst-ib";
    private String locatorResult = "div#search li:nth-of-type(1) a[href='http://source-it.com.ua/']";
    private String homePage = "https://google.com.ua";

    public String getHomePage() {
        return homePage;
    }

    public String getLocatorSearchField() {
        return locatorSearchField;
    }

    public String getLocatorResult() {
        return locatorResult;
    }

    public String getSearchInGoogle() {
        return searchInGoogle;
    }

    public String getLinkForSearch() {
        return linkForSearch;
    }
}
