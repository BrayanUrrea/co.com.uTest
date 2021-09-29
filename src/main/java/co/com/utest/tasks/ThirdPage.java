package co.com.utest.tasks;

import co.com.utest.userinterface.UTestFormPageThree;
import co.com.utest.userinterface.UTestFormPageTwo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ThirdPage implements Task {
    private String strComputer;
    private String strVersion;
    private String strLanguage;
    private String strMobile;
    private String strModel;
    private String stringOS;

    public ThirdPage(String strComputer, String strVersion, String strLanguage, String strMobile, String strModel, String stringOS) {
        this.strComputer = strComputer;
        this.strVersion = strVersion;
        this.strLanguage = strLanguage;
        this.strMobile = strMobile;
        this.strModel = strModel;
        this.stringOS = stringOS;
    }

    public static ThirdPage onThePage(String strComputer, String strVersion, String strLanguage, String strMobile, String strModel, String stringOS){
        return Tasks.instrumented(ThirdPage.class, strComputer,  strVersion, strLanguage, strMobile, strModel, stringOS);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(UTestFormPageTwo.ENTER_BUTTON_TWO),
                Enter.theValue(strComputer).into(UTestFormPageThree.INPUT_COMPUTER),
                Enter.theValue(strVersion).into(UTestFormPageThree.INPUT_VERSION),
                Enter.theValue(strLanguage).into(UTestFormPageThree.INPUT_LANGUAGE),
                Enter.theValue(strMobile).into(UTestFormPageThree.INPUT_MOBIL_DEVICE),
                Enter.theValue(strModel).into(UTestFormPageThree.INPUT_MODEL),
                Enter.theValue(stringOS).into(UTestFormPageThree.INPUT_OS_MOBILE),
                Click.on(UTestFormPageThree.ENTER_BUTTON)
                );
    }
}
