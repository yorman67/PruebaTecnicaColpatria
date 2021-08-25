package utils;


import net.serenitybdd.screenplay.targets.Target;

import static userinterface.MenusUI.BTN_ELEMENTS;
import static userinterface.MenusUI.BTN_WEB_TABLES;

public class Menu {
    static Target[] strMenu;

    public static Target[] webTables(){
       return strMenu = new Target[]{BTN_ELEMENTS, BTN_WEB_TABLES};
    }

}
