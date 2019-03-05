package com.ikea.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs1 {

    @Then("^response will have regular price$")
    public void responseWillHaveRegularPrice() {
    }

    @When("^request has one item (\\d+)$")
    public void requestHasOneItem(int arg0) {
        System.out.println("Value is" + arg0);
    }

    @Given("^I have created project$")
    public void iHaveCreatedProject() {
    }
}
