package utils.enums;

public enum EnumVariablesSesion {

    CORREO("Correo");

    private String nombreVariable;

    EnumVariablesSesion(String nombreVariable) {
        this.nombreVariable = nombreVariable;
    }

    public String getValue() {
        return this.nombreVariable;
    }
}
