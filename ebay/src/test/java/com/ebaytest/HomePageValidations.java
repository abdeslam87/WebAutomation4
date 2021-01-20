package com.ebaytest;

import base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageValidations extends TestBase {


    @Test
    public void VlidateUserCanTypeOnSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.TypeOnSearchBar("Java books");

    }

    @Test
    public void ValidateUserBeingAbletoClickOnSignin() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnSignin();

    }

    @Test
    public void ValidateUserBeingAbleToClickOnSellButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnSell();

    }

}



