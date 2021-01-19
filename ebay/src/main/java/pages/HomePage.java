package pages;

import com.aventstack.extentreports.ExtentTest;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import report.ExtentTestManager;

public class HomePage {

    private static Logger LOGGER = Logger.getLogger(HomePage.class);

    @FindBy(id="gh-ac")
    private WebElement searchbar;

    @FindBy(id="gh-btn")
    private WebElement searchbtn;


    @FindBy(linkText = "Sign in")
    private WebElement signinBtn;






    public void TypeOnSearchBar(String data){
        searchbar.sendKeys(data);
        ExtentTestManager.log("type on search bar : "+data);

    }

    public void ClickOnSearchButton(){
        searchbtn.click();
        ExtentTestManager.log("clicked on search button");
    }

    public void ClickOnSignInButton(){
        signinBtn.click();
        ExtentTestManager.log("clicked on sign in button");
    }






}
