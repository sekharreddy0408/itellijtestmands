package IndividualStepdefs;

import Methods.homepagemethods;
import Utilities.util;
import Utilities.webconnector;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import static Utilities.webconnector.*;


/**
 * Created by Chandra on 8/18/2017.
 */
public class homepagestepdefs {
    public homepagemethods homepage_method;

    public homepagestepdefs(){

        homepage_method  =PageFactory.initElements(webconnector.open_browser(),homepagemethods.class);

    }

    @Before()
    public void openBrowser(){

        open_browser();
        webconnector.driver.get("http://www.marksandspencer.com/");       // System.out.println(open_browser());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }




    }


    @Given("^gotowebsite$")
    public void gotowebsite() throws InterruptedException {
        System.out.println("firstmethod");
        System.out.println(webconnector.driver.getCurrentUrl());
      // util.gotowebsite();

        homepage_method.click_on_Arrangement_tab();
        System.out.println("secondmethod");
    }

    @Given("^click on the kids link$")
    public void clickonthekidslink() throws InterruptedException {
        System.out.println("kidsmethod");
        System.out.println(webconnector.driver.getCurrentUrl());
        // util.gotowebsite();

        homepage_method.clickOnkidsbutton();
        System.out.println("kidssecondmethod");
    }
}
