package stepdefinitions;

import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import org.openqa.selenium.WebDriver;
import userinterfaces.StorePage;

import java.util.List;

public class EscenariosSteps {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("GalesDev");
    private StorePage StorePage = new StorePage();

    @Given("^the store to the custom$")
    public void theStoreToTheCustom() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(StorePage));
    }

    @When("^Client add two items into the shooping car$")
    public void clientAddTwoItemsIntoTheShoopingCar(List<String> datos) {

    }

    @Then("^Continues searching products$")
    public void continuesSearchingProducts() {
    }

    @Given("^shopping car list to client$")
    public void shoppingCarListToClient() {
    }

    @When("^Client have finished to shopping$")
    public void clientHaveFinishedToShopping() {
    }

    @Then("^She or he wants to see the shooping car$")
    public void sheOrHeWantsToSeeTheShoopingCar() {
    }

}
