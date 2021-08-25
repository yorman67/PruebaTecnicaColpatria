package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WebTablesUI extends PageObject {

    public static final Target BTN_AGREGAR = Target.the("boton para agregar un nuevo elemento").located(By.id("addNewRecordButton"));
    public static final Target INPUT_PRIMER_NOMBRE = Target.the("Campo para ingresar el nombre").located(By.id("firstName"));
    public static final Target INPUT_APELLIDO = Target.the("Campo para ingresar el apellido").located(By.id("lastName"));
    public static final Target INPUT_CORREO = Target.the("Campo para ingresar el correo").located(By.id("userEmail"));
    public static final Target INPUT_EDAD = Target.the("Campo para ingresar la edad").located(By.id("age"));
    public static final Target INPUT_SALARIO = Target.the("Campo para ingresar salario").located(By.id("salary"));
    public static final Target INPUT_DEPARTAMENTO = Target.the("Campo para ingresar departamento").located(By.id("department"));
    public static final Target BTN_ENVIAR = Target.the("boton para enviar el registro").located(By.id("submit"));
    public static final Target FILTRO = Target.the("filtro de la tabla").located(By.id("searchBox"));
    public static final Target RESULTADO_BUSQUEDA = Target.the("filtro de la tabla").locatedBy("//div[contains(text(),'{0}')]");
    public static final Target BTN_ELIMINAR = Target.the("boton para eliminar elemento").locatedBy("//span[@title='Delete']");
}
