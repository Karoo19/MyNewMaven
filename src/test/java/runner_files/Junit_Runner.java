package runner_files;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		dryRun= false,
		publish=true,
		monochrome=true,
		features= {"src/test/ressources/"},
		glue= {"cucumber_project"},
		plugin= {"pretty"},
		tags="@Rediff"
		
		
		
		)

public class Junit_Runner {
	

}
