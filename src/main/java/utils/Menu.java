package utils;


import net.serenitybdd.screenplay.targets.Target;

import static userinterface.MenusUI.*;

public class Menu {
    static Target[] strMenu;

    public static Target[] webTables(){
       return strMenu = new Target[]{BTN_ELEMENTS, BTN_WEB_TABLES};
    }

    public static Target[] webWidgets(){
        return strMenu = new Target[]{BTN_WIDGETS,BTN_DATE_PICKER };
    }

    public static Target[] alerts(){
        return strMenu = new Target[]{BTN_ALERTS_FRAMES,BTN_ALERTS };
    }

}
