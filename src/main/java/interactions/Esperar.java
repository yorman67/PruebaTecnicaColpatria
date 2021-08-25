package interactions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import utils.enums.EnumVariablesSesion;

import static net.serenitybdd.core.Serenity.getDriver;

public class Esperar implements Interaction {

    private String tiempo;

    public Esperar(String tiempo){
        this.tiempo = tiempo;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Thread.sleep(Integer.valueOf(tiempo) * 1000);
        } catch (NumberFormatException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Esperar por(String tiempo) {
        return Tasks.instrumented(Esperar.class, tiempo);
    }

}
