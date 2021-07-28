import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",strict = true,
        dryRun = false, plugin = {
        "html:target/cucumber-html-report",
        "json:target/cucumber.json",
        "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json",
        "junit:target/cucumber-results.xml",
        "progress:target/cucumber-progress.txt"
},

        tags = "not @disabled")
public class Cucumber_Runner {
}