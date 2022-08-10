package BatchRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(plugin = {"json:target/cucumber.json", "html:target/index.html"}
,features="C:\\Users\\m.a.banerjee\\eclipse-workspace\\DemoTraining1\\Feature\\login88.feature",glue="Stepdefinition"
)
//tags= {"@SIT, @Regression, @UAT"} 
//)

public class TestRunner {
	

}
