package utils.enums;

public enum EnumConstantes {

    URL_PAGINA ("https://demoqa.com/");


    private String constante;

    EnumConstantes(String constante) {
        this.constante = constante;
    }

    public String getValue() {
        return this.constante;
    }
}
