package stepDefinitions;

import action.action;
import io.cucumber.java.en.Given;
import DriverFactory.driverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefinitions {
    action act = new action();




    @Given("Open {string} with predefined options")
    public void openWithPredefinedOptions(String browser) {
        driverFactory.luanchBrowser(browser);
    }

    @Given("navigate to automation practice")
    public void navigateToAutomationPractice() throws InterruptedException {
        act.navigate();

    }

    @Then("search for eminem")
    public void searchForEminem() throws Exception {
        act.search();
    }
}
