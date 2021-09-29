package co.com.utest.tasks;

import co.com.utest.userinterface.UTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUpOne implements Task {
    private static UTestPage uTestPage;
    public static Performable thepage(){
        return Tasks.instrumented(OpenUpOne.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(uTestPage));
    }

}
