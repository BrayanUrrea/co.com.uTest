package co.com.utest.tasks;

import co.com.utest.userinterface.UTestFormPageOne;
import co.com.utest.userinterface.UTestFormPageTwo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class SecondPage implements Task {
    private String strcity;
    private String strPostalCode;
    private String strCountry;

    public SecondPage(String strcity, String strPostalCode, String strCountry) {
        this.strcity = strcity;
        this.strPostalCode = strPostalCode;
        this.strCountry = strCountry;
    }

    public static SecondPage onThePage(String strcity, String strPostalCode, String strCountry){
        return Tasks.instrumented(SecondPage.class, strcity ,strPostalCode, strCountry);

    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(UTestFormPageOne.ENTER_BUTTON),
                Enter.theValue(strcity).into(UTestFormPageTwo.INPUT_CITY),
                Enter.theValue(strPostalCode).into(UTestFormPageTwo.INPUT_CODE),
                Enter.theValue(strCountry).into(UTestFormPageTwo.INPUT_COUNTRY),
                Click.on(UTestFormPageTwo.ENTER_BUTTON_TWO)
        );
    }

}
