package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import starter.filter.FilterBy;
import starter.navigation.NavigateTo;
import starter.search.SearchFor;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AmazonCartStepDefinitions {

    String actor;

    @Before
    public void setTheStage(){

        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) goes to main page")
    public void user_goes_to_main_page(String actor) {
        // Write code here that turns the phrase above into concrete actions
        this.actor = actor;
        theActorCalled("David").attemptsTo(
                NavigateTo.theAmazonHomePage());
    }

    @When("he looks up Mobile phones")
    public void he_looks_up_Mobile_phones() {


        theActorInTheSpotlight().attemptsTo(
                SearchFor.products("Mobile Phones"));
    }

    @When("selects  Motorola")
    public void selects_Motorola() {

        theActorInTheSpotlight().attemptsTo(
             FilterBy.selectLastProduct()
        );
    }

    @Then("he should Add that mobile to cart")
    public void he_should_Add_that_mobile_to_cart() {


    }



}
