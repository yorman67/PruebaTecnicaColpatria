package stepdefinitions;

import interactions.Esperar;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.logging.Level;

import static net.serenitybdd.core.Serenity.getDriver;
import static utils.enums.EnumConstantes.LOGGERCOLPATRIA;

public class Hook {

    @Before
    public void antesDeLaPrueba() {
        OnStage.setTheStage(new OnlineCast());
    }



    @After
    public void  despuesDeLaPrueba(){
        LOGGERCOLPATRIA.log(Level.INFO,"LA PRUEBA TERMINO CON EXITO");
        getDriver().quit();
    }
}
