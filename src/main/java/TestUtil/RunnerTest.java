package TestUtil;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty","html:target/cucumber-reports.html" }
        ,features = {"src/main/resources"}
        ,glue = {"stepDefination"}
        ,tags = "@smoke"
        ,monochrome = true
)
public class RunnerTest {

    public static void main(String[] args){
        JUnitCore.main(RunnerTest.class.getName());
    }
}
