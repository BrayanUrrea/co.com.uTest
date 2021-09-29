package co.com.utest.tasks;

import co.com.utest.userinterface.UTestEnterFomPage;
import co.com.utest.userinterface.UTestFormPageOne;
import co.com.utest.userinterface.UTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FirstPage implements Task {
    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strBirthMonth;
    private String strBirthDay;
    private String strBirthYear;

    public FirstPage(String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strBirthMonth = strBirthMonth;
        this.strBirthDay = strBirthDay;
        this.strBirthYear = strBirthYear;
    }

    public static FirstPage onThePage(String strFirstName, String strLastName, String strEmail, String strBirthMonth, String strBirthDay, String strBirthYear){
        return Tasks.instrumented(FirstPage.class, strFirstName, strLastName, strEmail, strBirthMonth, strBirthDay, strBirthYear);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(UTestEnterFomPage.JOIN_TODAY_BUTTON),
                Enter.theValue(strFirstName).into(UTestFormPageOne.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UTestFormPageOne.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UTestFormPageOne.INPUT_EMAIL),
                Enter.theValue(strBirthMonth).into(UTestFormPageOne.INPUT_BIRTH_MONTH),
                Enter.theValue(strBirthDay).into(UTestFormPageOne.INPUT_BIRTH_DAY),
                Enter.theValue(strBirthYear).into(UTestFormPageOne.INPUT_BIRTH_YEAR),
                Click.on(UTestFormPageOne.ENTER_BUTTON)
                );
    }
}
