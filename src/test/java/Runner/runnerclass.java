package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"pretty","html:target/cucumber"},
        features ="src/test/Resources",
        strict=true,
        monochrome= true,
        glue = {"IndividualStepdefs"}

      // , tags={""}
)
public class runnerclass {
}
//location of the pom file
// https://github.com/selenium-cucumber/selenium-cucumber-java-maven-example/blob/master/src/test/java/info/seleniumcucumber/userStepDefintions/RunCukeTest.java

//        {"pretty", "html:target/cucumberHtmlReport"},
//        //{"html:target/cucumberHtmlReport"},     //  for html result
//        //{pretty:target/cucumber-json-report.json},  // for json result
//        features = "classpath:features",
//        glue = {"info.seleniumcucumber.stepdefinitions",   // predefined step definitions package
//        "info.seleniumcucumber.userStepDefintions" // user step definitions package