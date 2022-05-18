package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");

    public WebElement getUsername() {
        return getDriver().findElement(username);
    }

    public void setUsername(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.username)).sendKeys(username);
    }

    public WebElement getPassword() {
        return getDriver().findElement(password);
    }

    public void setPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.password)).sendKeys(password);
    }

    public WebElement getLoginBtn() {
        return getDriver().findElement(loginBtn);
    }

}
