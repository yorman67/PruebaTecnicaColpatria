package utils;

import com.github.javafaker.Faker;


public class GenerarData {

    private  final Faker faker = new Faker();

    public String generarNombre () { return  faker.name().firstName();}
    public String generarApellido() { return faker.name().lastName();}
    public String generarCorreo() {
        return  faker.name().username().concat("@yopmail.com");
    }
    public String generarEdad(){ return  faker.number().digits(2);}
    public String generarSalario(){ return  faker.number().digits(8);}
    public String generarDepartamente() { return faker.country().capital();}

}
