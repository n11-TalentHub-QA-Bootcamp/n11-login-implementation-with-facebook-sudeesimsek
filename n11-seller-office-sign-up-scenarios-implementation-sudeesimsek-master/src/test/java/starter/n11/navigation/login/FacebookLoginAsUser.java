package starter.n11.navigation.login;

import lombok.SneakyThrows;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.thucydides.core.annotations.Step;
import starter.n11.navigation.user_interface.n11HomePageElements;
import starter.n11.navigation.user_interface.n11LoginPageElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FacebookLoginAsUser implements Task {

    private final String facebook_email_text;
    private final String facebook_password_text;

    @SneakyThrows
    @Step("{0} Login with email '#facebook_email_text' and password '#facebook_password_text'")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(n11HomePageElements.LOGIN_LINK),
                Click.on(n11LoginPageElements.FACEBOOK_BTN),
                Click.on(n11LoginPageElements.FACEBOOK_IMG),
                Click.on(n11LoginPageElements.FACEBOOK_EMAIL),
                SendKeys.of(this.facebook_email_text).into(n11LoginPageElements.FACEBOOK_EMAIL),
                Click.on(n11LoginPageElements.FACEBOOK_PASSWORD),
                SendKeys.of(this.facebook_password_text).into(n11LoginPageElements.FACEBOOK_PASSWORD),
                Click.on(n11LoginPageElements.FACEBOOK_LOGIN_BTN)
        );
    }

    public FacebookLoginAsUser(String email_text, String password_text) {
        this.facebook_email_text = email_text;
        this.facebook_password_text = password_text;

    }


    public static FacebookLoginAsUser FacebookloginThePage(String facebook_email_text, String facebook_password_text) {
        return instrumented(FacebookLoginAsUser.class
                , facebook_email_text, facebook_password_text);
    }




}
