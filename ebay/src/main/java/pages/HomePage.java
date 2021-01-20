package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import report.ExtentTestManager;

public class HomePage {


    @FindBy(id = "gh-ac")
    private WebElement searchbar;


    @FindBy(linkText = "Sign in")
    private WebElement signin;


    @FindBy(linkText = " Sell")
    private WebElement sell;


    public void TypeOnSearchBar(String data) {
        searchbar.sendKeys();
        ExtentTestManager.log("typed on search bar : " + data);
    }


    public void ClickOnSignin() {
        signin.click();
        ExtentTestManager.log("clicked on signin button");

    }

    public void ClickOnSell() {
        sell.click();
        ExtentTestManager.log("clicked on sell");
    }


}



