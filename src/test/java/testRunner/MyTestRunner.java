package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = ".\\src\\test\\resources\\features\\AccountUpdate.feature",
        glue = {"stepDefinitions"},
//        tags = "@Smoke",
        plugin ={"pretty"}
)
public class MyTestRunner extends AbstractTestNGCucumberTests{


    


}

