package stepdefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook {

    @Before
    public void antesDeLaPrueba() {
        OnStage.setTheStage(new OnlineCast());
    }



    @After
    public void  despuesDeLaPrueba() throws InterruptedException {
      //  Thread.sleep(1000000);
    }
}
