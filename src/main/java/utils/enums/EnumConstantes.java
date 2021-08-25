package utils.enums;

import java.util.logging.Logger;

public enum EnumConstantes {

    URL_PAGINA ("https://demoqa.com/"),
    FECHA_CON_HORA ("conHora"),
    FEHA_SIN_HORA("sinHora"),
    RUTA_ARCHIVO_DATA_ELIMINAR("src/test/resources/file/EliminarData.xlsx"),
    RUTA_ARCHIVO_DATA_FECHA ("src/test/resources/file/Fecha.xlsx");


    private String constante;

    public static final Logger LOGGERCOLPATRIA = Logger.getLogger("Colpatria");

    EnumConstantes(String constante) {
        this.constante = constante;
    }

    public String getValue() {
        return this.constante;
    }
}
