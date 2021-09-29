package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestFormPageThree {
    public static final Target INPUT_COMPUTER = Target.the("where do we write OS your computer").located(By.xpath("//div[@class ='ui-select-match']//div[placeholder(), 'Select OS'"));

    public static final Target INPUT_VERSION     = Target.the("where do we write the version of your computer ").located(By.xpath("//div[@class ='ui-select-match']//div[placeholder(), 'Select a Version']"));

    public static final Target INPUT_LANGUAGE = Target.the("where do we write the lenguage of your computer ").located(By.xpath("//div[@class ='ui-select-match']//div[placeholder(), 'Select OS language']"));

    public static final Target INPUT_MOBIL_DEVICE = Target.the("where do we write the mobile device").located(By.xpath("//div[@class ='ui-select-match']//div[placeholder(), 'Select Brand'"));

    public static final Target INPUT_MODEL     = Target.the("where do we write the model of mobile ").located(By.xpath("//div[@class ='ui-select-match']//div[placeholder(), 'Select a Model']"));

    public static final Target INPUT_OS_MOBILE = Target.the("where do we write the OS of mobile ").located(By.xpath("//div[@class ='ui-select-match']//div[placeholder(), 'Select OS']"));

    public static final Target ENTER_BUTTON = Target.the("button to go to the next page").located(By.xpath("//div[@class ='pull-right next-step']//span[text(), 'Next: Last Step']"));

}
