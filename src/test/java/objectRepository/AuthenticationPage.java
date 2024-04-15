package objectRepository;

import org.openqa.selenium.By;

public class AuthenticationPage {
    public static By loginWithGmail = By.className("mod-button mod-button mod-third-party-login-btn mod-third-party-login-google");
    public static By inputFieldPhone = By.cssSelector("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input");
    public static By inputFieldPassword = By.cssSelector("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input");
}
