package Tests;
import PageModel.LoginModel;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginTest {
    LoginModel loginModel = new LoginModel();

    @Given("^Timus login page is opened$")
    public void visitWebsite() {
        loginModel.visitWebsite();
    }

    @Then("^Timus login page was displayed$")
    public void checkIfOpenPage() {
        Assert.assertTrue(loginModel.checkIfOpenPage());
    }

    @Then("^User sees the login form$")
    public void checkLoginForm() {
        Assert.assertTrue(loginModel.checkLoginForm());
    }

    @And("^User sets email address$")
    public void setEMailAddress() {
        loginModel.setEMailAddress();
    }

    @And("^User sets password button$")
    public void setPassword() {
        loginModel.setPassword();
    }

    @When("^User summits login button$")
    public void summitLoginButton() {
        loginModel.clickContinueLoginButton();
    }

    @And("^User click create account button$")
    public void clickAccountButton() {
        loginModel.clickCreateAccount();
    }

    @And("^User sets (.*) in first name$")
    public void setFirstName(String firstName){
        loginModel.setFirstName(firstName);
    }

    @And("^User sets (.*) in last name$")
    public void setLastName(String lastName){
        loginModel.setLastName(lastName);
    }

    @And("^User sets account email$")
    public void setAccountEmail(){
        loginModel.setAccountEmail();
    }

    @And("^User sets (.*) in country")
    public void selectCountry(String country){
        loginModel.selectCountry(country);
    }

    @And("^User accept Privacy Policy")
    public void acceptPrivacy(){
        loginModel.acceptPrivacy();
    }

    @And("^User accept Terms of Service")
    public void acceptServiceTerms(){
        loginModel.acceptServiceTerms();
    }

    @And("^driver close$")
    public void closeDriver() {
        loginModel.closeDriver();
    }


}
