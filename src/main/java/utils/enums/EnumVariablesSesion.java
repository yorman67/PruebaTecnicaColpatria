package utils.enums;

public enum EnumVariablesSesion {

    CORREO("Correo"),
    DATO_ELIMINADO ("Eliminado"),
    FECHA ("Fecha"),
    FECHA_HORA("FechaHora"),
    OPCION_FECHA("OpcionFecha");

    private String nombreVariable;

    EnumVariablesSesion(String nombreVariable) {
        this.nombreVariable = nombreVariable;
    }

    public String getValue() {
        return this.nombreVariable;
    }
}
