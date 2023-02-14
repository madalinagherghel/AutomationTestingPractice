package frontend.steps;

import configurations.frontendConfigs.DriverFactory;
import org.openqa.selenium.WebDriver;

public class TestBase {
    public WebDriver driver = DriverFactory.getDriver();

}

