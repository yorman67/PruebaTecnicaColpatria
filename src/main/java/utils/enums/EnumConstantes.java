package utils.enums;

import java.util.logging.Logger;

public enum EnumConstantes {

    URL_PAGINA ("https://demoqa.com/"),
    RUTA_ARCHIVO_DATA ("src/test/resources/file/EliminarData.xlsx");


    private String constante;

    public static final Logger LOGGERCOLPATRIA = Logger.getLogger("Colpatria");

    EnumConstantes(String constante) {
        this.constante = constante;
    }

    public String getValue() {
        return this.constante;
    }
}
