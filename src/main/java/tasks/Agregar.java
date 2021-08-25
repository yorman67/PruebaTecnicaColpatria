package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import utils.GenerarData;
import utils.enums.EnumConstantes;
import utils.enums.EnumVariablesSesion;

import java.util.logging.Level;

import static userinterface.WebTablesUI.*;

public class Agregar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        GenerarData data = new GenerarData();

        actor.remember(EnumVariablesSesion.CORREO.getValue(), data.generarCorreo());

        actor.attemptsTo(
                Click.on(BTN_AGREGAR),
                Enter.theValue(data.generarNombre()).into(INPUT_PRIMER_NOMBRE),
                Enter.theValue(data.generarApellido()).into(INPUT_APELLIDO),
                Enter.theValue(actor.recall(EnumVariablesSesion.CORREO.getValue()).toString()).into(INPUT_CORREO),
                Enter.theValue(data.generarEdad()).into(INPUT_EDAD),
                Enter.theValue(data.generarSalario()).into(INPUT_SALARIO),
                Enter.theValue(data.generarDepartamente()).into(INPUT_DEPARTAMENTO),
                Click.on(BTN_ENVIAR),
                Enter.theValue(actor.recall(EnumVariablesSesion.CORREO.getValue()).toString()).into(FILTRO)
        );
        EnumConstantes.LOGGERCOLPATRIA.log(Level.INFO, "Se agrega un nuevo elemento de manera exitosa");
    }

    public static Agregar elemento() {
        return Tasks.instrumented(Agregar.class);
    }
}
