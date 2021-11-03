import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",
        dryRun = false, plugin = {

        "json:target/cucumber.json",
        
},

        tags = "@jr")
public class Cucumber_Runner {
}
