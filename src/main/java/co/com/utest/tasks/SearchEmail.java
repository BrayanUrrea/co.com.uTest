package co.com.utest.tasks;

import co.com.utest.userinterface.UTestFormPageOne;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SearchEmail implements Task {
    private String email;

    public SearchEmail(String email){
        this.email = email;
    }

    public static SearchEmail the(String email){
        return Tasks.instrumented(SearchEmail.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestFormPageOne.ENTER_BUTTON),
                Enter.theValue(email).into(UTestFormPageOne.INPUT_EMAIL),
                Click.on(UTestFormPageOne.ENTER_BUTTON)
        );

    }
}
