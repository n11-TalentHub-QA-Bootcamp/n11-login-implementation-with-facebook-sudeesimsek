package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.n11.navigation.login.FacebookLoginAsUser;
import starter.n11.navigation.tasks.NavigateTo;
import starter.n11.navigation.user_interface.n11UserHomePageElements;

public class N11LoginStepDefinitions {

    Actor actor = Actor.named("patikabootcampers");

    @Managed
    WebDriver webDriver;


    @Given("user launch browser and open the main page")
    public void userLaunchBrowserAndOpenTheMainPage() throws InterruptedException {

        actor.can(BrowseTheWeb.with(webDriver));
        Thread.sleep(3000);
        actor.wasAbleTo(NavigateTo.theN11HomePage());
    }

    @When("user logged in with valid credentials")
    public void userLoggedInWithValidCredentials() throws InterruptedException {
        actor.attemptsTo(FacebookLoginAsUser.FacebookloginThePage("serenitysdet@gmail.com","serenitysdet-1"));
        Thread.sleep(3000);

    }

    @Then("user logged in successfully")
    public void userLoggedInSuccessfully() {


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //serenity tester
        actor.attemptsTo(
                Ensure.that(n11UserHomePageElements.USERNAME_LINK).isDisplayed(),
                Ensure.that(n11UserHomePageElements.USERNAME_LINK).value().startsWith("serenity")

        );

        /*actor.should(
                GivenWhenThen.seeThat(the(n11UserHomePageElements.USERNAME_LINK)
                        ,containsText("serenity tester"))
        );*/
    }
}
