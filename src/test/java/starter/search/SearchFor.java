package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static starter.ui.SearchForm.LIST_ADD_BUTTON;
import static starter.ui.SearchForm.SEARCH_LAST_PRODUCT;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Scroll;
import starter.ui.SearchForm;

public class SearchFor implements Task {

    private final String Product;


    public SearchFor(String Product) {
        this.Product = Product;



    }
    public static Performable products(String Product){
        return instrumented(SearchFor.class, Product);
    }




    @Override
    public <T extends Actor> void performAs(T actor){

            actor.attemptsTo(
                Enter.theValue(Product).into(SearchForm.SEARCH_FIELD),
                Click.on(SearchForm.SEARCH_BUTTON),
                    Click.on(SearchForm.SEARCH_BRAND)


            );
    }





}
