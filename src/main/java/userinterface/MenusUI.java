package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MenusUI extends PageObject {

    public static final Target BTN_ELEMENTS = Target.the("boton del menu elements").locatedBy("//h5[contains(text(),'Elements')]");
    public static final Target BTN_WEB_TABLES = Target.the("boton del menu web tables").locatedBy("//span[contains(text(),'Web Tables')]");
    public static final Target BTN_WIDGETS = Target.the("boton del menu widgets").locatedBy("//h5[contains(text(),'Widgets')]");
    public static final Target BTN_DATE_PICKER = Target.the("boton del menu date picker").locatedBy("//span[contains(text(),'Date Picker')]");
    public static final Target BTN_ALERTS_FRAMES = Target.the("boton del menu Alerts, Frame & Windows").locatedBy("//h5[contains(text(),'Alerts, Frame & Windows')]");
    public static final Target BTN_ALERTS = Target.the("boton del menu Alerts, Frame & Windows").locatedBy("//span[contains(text(),'Alerts')]");


}
