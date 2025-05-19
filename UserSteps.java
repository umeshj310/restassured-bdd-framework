package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class UserSteps {
    Response response;

    @Given("User API is available")
    public void user_api_is_available() {
        baseURI = "https://reqres.in";
    }

    @When("I hit GET user API")
    public void i_hit_get_user_api() {
        response = when().get("/api/users/2");
    }

    @Then("Status code should be 200")
    public void status_code_should_be_200() {
        response.then().statusCode(200);
    }
}
