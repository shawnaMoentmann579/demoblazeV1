package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
//always need to run through testRunner or reports will not be generated
//we need to specify some options
@RunWith(Cucumber.class)
@CucumberOptions
        (
                //where our features are located
                features = ".//Features/Login.feature",
                //where our step definitions are implemented. Specifying the package
                glue = "stepDefinitions",
                //true=no true execution, cross checks to verify every step has corresponding methods
                // being implemented or not. makes sure everything is aligned correctly
                // False executes it in browser
                dryRun = false,
                //tags = "@pictureInPicture",
                //remove unnecessary characters in your console window when you run. If pretty is not taking
                // properly
                monochrome = true,
                //add a summary report. Pretty prints output very clearly. Html says you want to
                // generate an html report
                plugin = {"pretty","html:test-output"}
        )



public class testRun {
}
