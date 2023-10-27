package runner;

import io.cucumber.java.it.Data;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/Resources/features",
                  glue = {"org/opencart/stepdefinations"},
                  plugin ={"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
                  monochrome = true,
                  publish = true)
public class TestRunner extends AbstractTestNGCucumberTests {


    @Override
    @DataProvider(parallel = true)
    public  Object[][] scenarios(){
        return super.scenarios();
    }

}
