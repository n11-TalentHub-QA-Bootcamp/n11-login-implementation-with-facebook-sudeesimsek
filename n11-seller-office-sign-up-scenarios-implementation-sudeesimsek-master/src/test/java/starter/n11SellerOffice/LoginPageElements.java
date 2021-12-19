package starter.n11SellerOffice;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageElements {
    public static Target USER_FIELD = Target.the("username textbox").located(By.name("usernameInputText"));
    public static Target PASSWORD_FIELD = Target.the("password textbox").located(By.id("passwordInputText"));
    public static Target PASSWORDAGAIN_FIELD = Target.the("password again textbox").locatedBy("//input[@id='passwordRetypeInputText']");
    public static Target EMAIL_FIELD = Target.the("email textbox").located(By.name("emailInputText"));
    public static Target EMAILAGAIN_FIELD = Target.the("email again textbox").located(By.name("emailRetypeInputText"));
    public static Target SHOPNAME_FIELD = Target.the("shop name textbox").locatedBy("//input[@id='nicknameInputText']");
    public static Target USERTYPE_FIELD = Target.the("user type btn").locatedBy("//tbody/tr[1]/td[1]/div[1]/div[2]");
    public static Target SIGNUP_BUTTON = Target.the("signup btn").locatedBy("//div[@id='j_id275_j_id_dk']");
    public static Target VERIFY_MESSAGE = Target.the("verify message").locatedBy("//span[contains(text(),'Lütfen sözleşmeyi kabul ettiğinizi onaylayın.')]");

}
