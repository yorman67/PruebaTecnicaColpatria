package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AlertsUI extends PageObject {

    public static final Target BTN_SEE_ALERT = Target.the("boton para ver alerta emergente").located(By.id("alertButton"));
    public static final Target BTN_WAIT_ALERT = Target.the("boton para ver alerta despues de 5s").located(By.id("timerAlertButton"));
    public static final Target BTN_COMFIRM_ALERT = Target.the("boton para ver alerta de confirmacion").located(By.id("confirmButton"));
    public static final Target BTN_INPUT_ALERT = Target.the("boton para ver alerta con campo de texto").located(By.id("promtButton"));
    public static final Target INPUT_RESULTADO = Target.the("label para ver el resultado de la accion seleccionada").located(By.id("promptResult"));
    public static final Target CONFIRMACION_RESULTADO = Target.the("label para ver el resultado de la accion seleccionada").located(By.id("confirmResult"));


}
