package PageModel;

import Driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseModel extends Driver {
    WebDriverWait wait = new WebDriverWait(webDriver, 2000);

    public WebElement findElement(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return webDriver.findElement(by);
    }

    public void clickElement(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }

    public void sendKeys(By by, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        findElement(by).sendKeys(text);
    }

    public boolean displayed(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return webDriver.findElement(by).isDisplayed();
    }

    public void wait(int sleepTime) {
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getAttribute(By by, String value) {
        return findElement(by).getAttribute(value);
    }

    public void scrollToElement() {
        ((JavascriptExecutor) webDriver).executeScript("window.scrollBy(0,8000)");
    }

    public void clickToElement() {
        ((JavascriptExecutor) webDriver).executeScript("document.querySelectorAll('#container-register > div.el-dialog__wrapper > div > div.el-dialog__footer > span > button')[0].click()");
    }

    public void switchToFrame(WebElement element){
        webDriver.switchTo().frame(element);
    }

    public void switchToDefaultFrame(){
        webDriver.switchTo().defaultContent();
    }

    public void driverQuit() {
        webDriver.quit();
    }
}

