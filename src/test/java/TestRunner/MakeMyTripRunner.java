package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//features//makemytrip.feature",glue="StepDefination",dryRun = true
		)
public class MakeMyTripRunner {


}
