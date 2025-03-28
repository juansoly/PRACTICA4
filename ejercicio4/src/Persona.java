import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;


public class Persona {
    String Nombre;
    String PrimerApellido;
    String SegundoApellido;
    Date FechaNacimiento;
    Integer NumeroCI;
    String complemento;
 public Persona(){

 }

    public Persona(String nombre, String primerApellido, String segundoApellido,
                   Date fechaNacimiento, Integer numeroCI, String complemento) {
        this. Nombre = nombre;
        this.PrimerApellido = primerApellido;
        this.SegundoApellido = segundoApellido;
        this.FechaNacimiento = fechaNacimiento;
        this.NumeroCI = numeroCI;
        this.complemento = complemento;
    }
    public  Integer CalcularEdad() {
        Calendar nacimiento = Calendar.getInstance();
        nacimiento.setTime(FechaNacimiento);
        Calendar hoy = Calendar.getInstance();
        int edad= hoy.get(Calendar.YEAR)-nacimiento.get(Calendar.YEAR);
        if(hoy.get(Calendar.DAY_OF_YEAR)<nacimiento.get(Calendar.DAY_OF_YEAR))
            edad--;
        return edad;

    }
    public boolean ciConComplemento(){
     if (complemento ==null){
         return Boolean.FALSE;

     }else {
         return Boolean.TRUE;
     }
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        PrimerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        SegundoApellido = segundoApellido;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public Integer getNumeroCI() {
        return NumeroCI;
    }

    public void setNumeroCI(Integer numeroCI) {
        NumeroCI = numeroCI;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
