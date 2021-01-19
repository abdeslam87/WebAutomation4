package com.ebaytest;

import base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageValidations extends TestBase {

    @Test(enabled = false)
    public void ValidateUserCanTypeOnSearchBar() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.TypeOnSearchBar("Java Books");

    }
        @Test

     public void ValidateUserBeinAbleToclickOnSearchButton() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnSearchButton();

        }

        @Test
    public void ValidateUserCanClickOnSigninButton(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.ClickOnSignInButton();
        }
































    }



