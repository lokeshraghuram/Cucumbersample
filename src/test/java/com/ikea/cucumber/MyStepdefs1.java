package com.ikea.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class MyStepdefs1 {

    String url;
    //ResponseHolder responseHolder;
    Response response;

    @Then("^response will have regular price$")
    public void responseWillHaveRegularPrice() {
    }

    @When("^request has one item (\\d+)$")
    public void requestHasOneItem(int arg0) {
        System.out.println("Value is" + arg0);
    }


    @Given("^that the subtotal price API \"([^\"]*)\" is working$")
    public void thatTheSubtotalPriceAPIIsWorking(String url) {
        response = given().body("Hello").when().post(url);
        System.out.println(response.toString());
        Assert.assertEquals(200, response.getStatusCode());
    }
}
