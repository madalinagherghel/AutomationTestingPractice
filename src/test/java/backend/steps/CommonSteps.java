package backend.steps;

import backend.apiEngine.endpoints.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class CommonSteps {
    @Given("I set request specifications")
    public void iSetRequestSpecifications() {
        CommonMethods.iSetTheRequestSpecifications();
    }


    @And("I am an authorized user")
    public void iAmAnAuthorizedUser() {
        CommonMethods.iSetRequestSpecificationsWithToken();
    }


}
