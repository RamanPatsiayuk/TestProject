import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import driver.LocalChromeDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        plugin = {
                "pretty", "json:target/Cucumber.json",
                "html:target/cucumber-html-report"
        }
)
public class RunAcceptanceTest {
    @BeforeClass
    public static void initSelenium() { LocalChromeDriver.init(); }

    @AfterClass
    public static void closeSelenium() {
        LocalChromeDriver.close();
    }
}
