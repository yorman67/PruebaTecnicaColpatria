package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WidgetUI  extends PageObject {

    public static final Target INPUT_FECHA = Target.the("ingresar fecha").located(By.id("datePickerMonthYearInput"));
    public static final Target INPUT_FECHA_HORA = Target.the("ingresar fecha").located(By.id("dateAndTimePickerInput"));

}
