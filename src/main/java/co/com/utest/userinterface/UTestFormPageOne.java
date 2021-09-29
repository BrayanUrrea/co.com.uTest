package co.com.utest.userinterface;



import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestFormPageOne  {
    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name").located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name").located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("where do we write the email").located(By.id("email"));

    public static final Target INPUT_BIRTH_MONTH = Target.the("where do we write the birth month").located(By.id("birthMonth"));

    public static final Target INPUT_BIRTH_DAY = Target.the("where do we write the birth day").located(By.id("birthDay"));

    public static final Target INPUT_BIRTH_YEAR = Target.the("where do we write the birth year").located(By.id("birthYear"));

    public static final Target ENTER_BUTTON = Target.the("button to go to the next page").located(By.xpath("//div[@class ='form-group col-xs-12 text-right']//span[text(), 'Next: Location']"));


}
