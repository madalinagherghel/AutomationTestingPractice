package frontend.steps;

import configurations.frontendConfigs.FrontendPropertiesReader;
import io.cucumber.java.en.Given;

public class CommonSteps extends TestBase{
    @Given("I am on demoQa url")
    public void iAmOnDemoQaUrl() {
        driver.get(FrontendPropertiesReader.getBase_url());
    }
}

