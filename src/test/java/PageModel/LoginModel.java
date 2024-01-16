package PageModel;

import Constants.Constant;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class LoginModel extends BaseModel {
    public static By loMainPage = By.id("timus-login-main");
    public static By loLogin = By.id("container-login");
    public static By txtUserName = By.xpath("//*[@id=\"container-login\"]/section/div/div/div/div[1]/form/div[1]/div/div/input");
    public static By txtPassword = By.xpath("//*[@id=\"container-login\"]/section/div/div/div/div[1]/form/div[2]/div/div/input");
    public static By btnSummit = By.xpath("//*[@id=\"container-login\"]/section/div/div/div/div[1]/form/div[5]/div/button[1]");
    public static By btnCreateAccount = By.xpath("//*[@id=\"container-login\"]/section/div/div/div/div[1]/form/div[5]/div/button[2]");
    public static By txtFirstName = By.xpath("//*[@id=\"container-register\"]/div[1]/div[1]/form/div[1]/div[1]/div/div/div/input");
    public static By txtLastName = By.xpath("//*[@id=\"container-register\"]/div[1]/div[1]/form/div[1]/div[2]/div/div/div/input");
    public static By txtEmailAddress = By.xpath("//*[@id=\"container-register\"]/div[1]/div[1]/form/div[2]/div[1]/div/div/div/input");
    public static By cbxCountry = By.xpath("//*[@id=\"container-register\"]/div[1]/div[1]/form/div[2]/div[2]/div/div/div/div/input");
    public static By cbxCountryItem = By.xpath("/html/body/div[2]/div[1]/div[1]/ul/li[228]/span");
    public static By cbxPrivacyPolicy = By.id("privacy_box");
    public static By frPrivacyPolicy = By.xpath("//*[@id=\"container-register\"]/div[3]/div/div[2]/div/iframe");
    public static By btnReadAndAccept = By.xpath("//*[@id=\"container-register\"]/div[3]/div/div[3]/span/button");
    public static By cbxServiceTerms = By.id("term_of_use_box");
    public static By txtGoogle = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/div/textarea");
    public static By btnGoogle = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[6]/center/input[1]");

    Constant constant = new Constant();
    public void visitWebsite() {
        webDriver.get(constant.url);
    }
    public boolean checkIfOpenPage() {//*[@id="container-login"]/section/div/div/div/div[1]/form/div[2]/div/div/input
        return displayed(loMainPage);
    }
    public boolean checkLoginForm(){
        return displayed(loLogin);
    }
    public void setEMailAddress(){
        sendKeys(txtUserName,constant.email);
    }
    public void setPassword(){
        sendKeys(txtPassword,constant.password);
    }
    public void clickContinueLoginButton(){
        clickElement(btnSummit);
    }
    public void clickCreateAccount(){
        clickElement(btnCreateAccount);
    }
    public void setFirstName(String firstName){
        sendKeys(txtFirstName,firstName);
    }
    public void setLastName(String lastName){
        sendKeys(txtLastName,lastName);
    }
    public void setAccountEmail(){
        sendKeys(txtEmailAddress,constant.accountEmail);
    }
    public void selectCountry(String country){
        sendKeys(cbxCountry,country);
        clickElement(cbxCountryItem);
    }

    public void acceptPrivacy(){
        clickElement(cbxPrivacyPolicy);
        wait(3000);
        switchToFrame(findElement(frPrivacyPolicy));
        wait(2000);
        scrollToElement();
        wait(2000);
        //clickToElement();
        switchToDefaultFrame();
        clickElement(btnReadAndAccept);
    }

    public void acceptServiceTerms(){
        clickElement(cbxServiceTerms);
        wait(3000);
        switchToFrame(findElement(frPrivacyPolicy));
        wait(2000);
        scrollToElement();
        wait(2000);
        //clickToElement();
        switchToDefaultFrame();
        clickElement(btnReadAndAccept);
    }

    public void closeDriver(){
        driverQuit();
    }

}
