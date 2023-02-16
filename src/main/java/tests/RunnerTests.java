package tests;

import core.DriverManager;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.ClassRule;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features",
        tags = "@run",
        glue = {""}

)
public class RunnerTests {

    @ClassRule
    public static DriverManager manager = new DriverManager();

}
