package Tests;

import Constants.Constant;
import Utils.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;

import java.io.IOException;

public class ApiTest {
    public static Response response;
    public static ResponseBody responseBody;


    @When("Send a Post Request")
    public int sendPostLoginService() throws IOException {
        response = RestAssured
                .given().auth().preemptive().basic(Constant.email, Constant.password)
                .post(Constant.apiUrl);
        System.out.println("Response" + response);
        responseBody = response.getBody();
        int status = response.getStatusCode();
        System.out.println("Status Code:" + status);
        Login.ProduceJson(responseBody);
        return status;
    }

    @Then("Receive valid HTTP response code (.*)")
    public void verifyGetResponse(String statusCode) throws IOException {
        Assert.assertEquals(sendPostLoginService(), statusCode,"Response code {0} is not proper");
    }
}
