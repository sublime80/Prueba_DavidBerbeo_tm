package starter.filter;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import starter.search.SearchFor;
import starter.ui.SearchForm;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static starter.ui.SearchForm.LIST_ADD_BUTTON;
import static starter.ui.SearchForm.SEARCH_LAST_PRODUCT;

public class FilterBy implements Task {

    public FilterBy() {
    }

    public static Performable selectLastProduct(){
        return instrumented(FilterBy.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(SEARCH_LAST_PRODUCT),
                Click.on(SEARCH_LAST_PRODUCT),
                Click.on(LIST_ADD_BUTTON)

        );

    }
}
