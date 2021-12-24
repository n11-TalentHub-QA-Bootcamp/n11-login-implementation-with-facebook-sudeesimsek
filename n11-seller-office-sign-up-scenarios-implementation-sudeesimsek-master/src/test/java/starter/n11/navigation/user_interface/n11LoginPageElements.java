package starter.n11.navigation.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class n11LoginPageElements {
    public static Target FACEBOOK_BTN = Target.the("facebook btn").located(By.xpath("//body/div[@id='wrapper']/div[@id='contentWrapper']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]"));
    public static Target FACEBOOK_IMG = Target.the("facebook img").located(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/h2[1]"));
    public static Target FACEBOOK_EMAIL = Target.the("facebook email").located(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]"));
    public static Target FACEBOOK_PASSWORD = Target.the("facebook password").located(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/input[1]"));
    public static Target FACEBOOK_LOGIN_BTN = Target.the("facebook login btn").located(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/label[2]/input[1]"));


}
