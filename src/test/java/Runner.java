

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/VI20466289/eclipse-workspace/JK/src/main/java/Feature/petstore.feature", glue = {
		"bdd_bindings" }, tags=("@cab"))
public class Runner extends AbstractTestNGCucumberTests{

}
