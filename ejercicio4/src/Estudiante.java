import java.util.Date;

public class Estudiante extends Persona{
    String CodigoSis;

    public Estudiante(String nombre, String primerApellido, String segundoApellido, Date fechaNacimiento, Integer numeroCI, String complemento) {
        super(nombre, primerApellido, segundoApellido, fechaNacimiento, numeroCI, complemento);
    }

    public String getCodigoSis() {
        return CodigoSis;
    }

    public void setCodigoSis(String codigoSis) {
        CodigoSis = codigoSis;
    }
}