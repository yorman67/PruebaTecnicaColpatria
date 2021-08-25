package interactions;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import utils.Menu;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class Seleccionar implements Interaction {

    private String opcion;
    private Target[] menu;

    public Seleccionar(String opcion) {
        this.opcion = opcion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        switch (opcion){
            case "WebTables":
                menu = Menu.webTables();
                break;
            case "Widgets":
                menu = Menu.webWidgets();
                break;
        }

        for (Target menu : menu) {
            actor.attemptsTo(WaitUntil.the(menu, isClickable()).forNoMoreThan(120).seconds(),
                    Click.on(menu));
        }
    }

    public static Performable opcion (String opcion){
        return Tasks.instrumented(Seleccionar.class,opcion);
    }
}
