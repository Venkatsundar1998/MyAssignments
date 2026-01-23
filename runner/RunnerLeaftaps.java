package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/java/features/CreateAccount.feature",
		"src/test/java/features/EditAccount.feature", "src/test/java/features/DeActivateAccount.feature" }, glue = {
				"stepDefinition", "hookImplementation" }, publish = true)
public class RunnerLeaftaps extends AbstractTestNGCucumberTests {

}
