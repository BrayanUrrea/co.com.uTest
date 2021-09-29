package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestFormPageFour {
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password").located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do we write the confirm password").located(By.id("confirmPassword"));

    public static final Target INPUT_CHECK_CONDUCT = Target.the("where do we select the country").located(By.xpath("//label[@class = 'input-check-box signup-consent']//a[@href(), '/terms-and-conditions'"));

    public static final Target INPUT_CHECK_POLICY = Target.the("where do we select the country").located(By.xpath("//label[@class = 'input-check-box signup-consent']//a[@href(), '/privacy-policy'"));

    public static final Target ENTER_BUTTON = Target.the("button to go to the next page").located(By.xpath("//div[@class ='pull-right next-step']//span[text(), 'Complete Setup']"));

}
