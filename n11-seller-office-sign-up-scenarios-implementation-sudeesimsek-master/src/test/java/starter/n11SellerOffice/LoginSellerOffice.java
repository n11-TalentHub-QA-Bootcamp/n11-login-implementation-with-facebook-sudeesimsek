package starter.n11SellerOffice;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginSellerOffice implements Task {

    private final String username_text;
    private final String password_text;
    private final String passwordagain_text;
    private final String email_text;
    private final String emailagain_text;
    private final String shopname_text;


    @Step("{0} Login with username '#username_text',password '#password_text',password again '#passwordagain_text',email '#email_text',email again ,'emailagain_text' and shopname 'shopname_text'")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(starter.n11SellerOffice.SellerOfficeHomePageElements.REGISTERNOW_LABEL),
                Click.on(starter.n11SellerOffice.LoginPageElements.USER_FIELD),
                SendKeys.of(this.username_text).into(starter.n11SellerOffice.LoginPageElements.USER_FIELD),
                Click.on(LoginPageElements.PASSWORD_FIELD),
                SendKeys.of(this.password_text).into(LoginPageElements.PASSWORD_FIELD),
                Click.on(LoginPageElements.PASSWORDAGAIN_FIELD),
                SendKeys.of(this.passwordagain_text).into(LoginPageElements.PASSWORDAGAIN_FIELD),
                Click.on(LoginPageElements.EMAIL_FIELD),
                SendKeys.of(this.email_text).into(LoginPageElements.EMAIL_FIELD),
                Click.on(LoginPageElements.EMAILAGAIN_FIELD),
                SendKeys.of(this.emailagain_text).into(LoginPageElements.EMAILAGAIN_FIELD),
                Click.on(LoginPageElements.SHOPNAME_FIELD),
                SendKeys.of(this.shopname_text).into(LoginPageElements.SHOPNAME_FIELD),
                Click.on(LoginPageElements.USERTYPE_FIELD),
                Click.on(LoginPageElements.SIGNUP_BUTTON)
        );


    }

    public LoginSellerOffice(String username_text, String password_text, String passwordagain_text, String email_text, String emailagain_text, String shopname_text) {
        this.username_text = username_text;
        this.password_text = password_text;
        this.passwordagain_text = passwordagain_text;
        this.email_text = email_text;
        this.emailagain_text = emailagain_text;
        this.shopname_text = shopname_text;

    }

    public static LoginSellerOffice loginThePage(String username_text, String password_text, String passwordagain_text, String email_text, String emailagain_text, String shopname_text) {
        return instrumented(LoginSellerOffice.class
                , username_text, password_text, passwordagain_text, email_text, emailagain_text, shopname_text);
    }
}
