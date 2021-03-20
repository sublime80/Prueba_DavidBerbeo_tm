package starter.Signin;

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

public class AmazonSignin implements Task {

    private final String user;
    private final String password;



    public AmazonSignin(String user, String password) {
        this.user = user;
        this.password = password;



    }
    public static Performable whitCredentials(String user, String password){
        return instrumented(AmazonSignin.class, user, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(user).into(SearchForm.USER_FIELD),
                Click.on(SearchForm.CONTINUE_USER_LOGIN_BUTTON),
                Enter.theValue(password).into(SearchForm.PASSWORD_FIELD),
                Click.on(SearchForm.LOGIN_BUTTON)

        );
    }
}
