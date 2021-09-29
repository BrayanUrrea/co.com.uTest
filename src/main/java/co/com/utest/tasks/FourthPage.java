package co.com.utest.tasks;

import co.com.utest.userinterface.UTestFormPageFour;
import co.com.utest.userinterface.UTestFormPageThree;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class FourthPage implements Task {
    private String strPassword;
    private String strCofirmPassword;
    private String  strPolicy;
    private String  strConduct;


    public FourthPage(String strPassword, String strCofirmPassword, String strPolicy, String strConduct) {
        this.strPassword = strPassword;
        this.strCofirmPassword = strCofirmPassword;
        this.strPolicy = strPolicy;
        this.strConduct = strConduct;
    }


    public static FourthPage onThePage(String strPassword, String strCofirmPassword,String strPolicy,String strConduct){
        return Tasks.instrumented(FourthPage.class, strPassword,  strCofirmPassword, strPolicy, strConduct);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(UTestFormPageThree.ENTER_BUTTON),
                Enter.theValue(strPassword).into(UTestFormPageFour.INPUT_PASSWORD),
                Enter.theValue(strCofirmPassword).into(UTestFormPageFour.INPUT_CONFIRM_PASSWORD),
                Enter.theValue(strPolicy).into(UTestFormPageFour.INPUT_CHECK_POLICY),
                Enter.theValue(strConduct).into(UTestFormPageFour.INPUT_CHECK_CONDUCT),
                Click.on(UTestFormPageFour.ENTER_BUTTON)
                );

    }

}
