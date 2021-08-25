package utils.enums;

public enum EnumVariablesSesion {

    CORREO("Correo"),
    DATO_ELIMINADO ("Eliminado");

    private String nombreVariable;

    EnumVariablesSesion(String nombreVariable) {
        this.nombreVariable = nombreVariable;
    }

    public String getValue() {
        return this.nombreVariable;
    }
}
