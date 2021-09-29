package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestEnterFomPage {
    public static final Target JOIN_TODAY_BUTTON = Target.the("button that shows us the form to register").located(By.xpath("//div[@class='unauthenticated-nav-bar__links navbar-right hidden-sm hidden-xs']//a[contains(text(),'Join Today']"));
}
