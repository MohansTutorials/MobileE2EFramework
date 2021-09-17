package runnerPackage;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

		features="src/test/java/featuresPac/LoriHomePage.feature",
		glue="stepDefinitions"
)
public class TestRunner extends AbstractTestNGCucumberTests{
	
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
