package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.n11.navigation.user_interface.n11UserHomePageElements;
import starter.n11SellerOffice.*;

public class n11SellerOfficeStepDefinations {
    Actor actor = Actor.named("patikabootcampers");
    @Managed
    WebDriver webDriver;

    @Given("user launch browser and open the login page")
    public void user_launch_browser_and_open_the_login_page() {
        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(NavigateTo.n11SellerOfficeLoginPage());
    }

    @When("user signed in selleroffice with valid credentials")
    public void user_signed_in_selleroffice_with_valid_credentials() {
        actor.attemptsTo(LoginSellerOffice.loginThePage("sudesimsek", "1234567", "1234567", "sudesimsek@gmail.com", "sudesimsek@gmail.com", "sudesimsek"));

    }

    @Then("user signed in selleroffice successfully")
    public void user_signed_in_selleroffice_successfully() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                Ensure.that(LoginPageElements.VERIFY_MESSAGE).isDisplayed(),
                Ensure.that(LoginPageElements.VERIFY_MESSAGE).value().startsWith("Lütfen sözleşmeyi kabul ettiğinizi onaylayın.")
        );

    }


}
