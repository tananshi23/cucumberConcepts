package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(
            features = "C:\\Users\\ADMIN\\Documents\\Automation\\CucumberConcepts\\src\\test\\resources\\features",
            glue = {"stepDefinitions"},
            tags = "@Smoke",
            plugin ={"pretty"}
    )
    public class TestRunner extends AbstractTestNGCucumberTests {


    }

