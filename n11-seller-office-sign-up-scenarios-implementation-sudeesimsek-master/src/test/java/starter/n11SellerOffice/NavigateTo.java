package starter.n11SellerOffice;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.n11SellerOffice.SellerOfficeHomePage;

public class NavigateTo {
    public static Performable n11SellerOfficeLoginPage() {
        return Task.where("{0} opens the n11 Seller Office login page",
                Open.browserOn().the(SellerOfficeHomePage.class));
    }
}
