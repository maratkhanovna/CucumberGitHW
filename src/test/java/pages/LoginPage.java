package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
    @FindBy(id = "txtUsername")
    public WebElement usernameTextField;

    @FindBy(id = "txtPassword")
    public WebElement passwordTextField;

    @FindBy(id = "btnLogin")
    public WebElement loginButton;
}
