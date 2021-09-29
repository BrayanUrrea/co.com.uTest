package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestFormPageTwo {
    public static final Target INPUT_CITY = Target.the("where do we write the city").located(By.id("city"));

    public static final Target INPUT_CODE = Target.the("where do we write the code").located(By.id("zip"));

    public static final Target INPUT_COUNTRY = Target.the("where do we select the country").located(By.xpath("//div[@class = 'ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid ng-valid-required ng-touched"));

    public static final Target ENTER_BUTTON_TWO= Target.the("button to go to the next page").located(By.xpath("//div[@class ='pull-right next-step']//span[text(), 'Next: Devices']"));
}
