import java.util.Queue;
import java.util.*;

public class RegistroEstudiantes {
    public static void main(String[] args) {
        // Crear un array de 18 estudiantes
        Persona[] estudiantes = new Persona[18];
        estudiantes[0] = new Persona("MIGUEL ANGEL ", "ACERO ", "VALENCIA", new GregorianCalendar(2002, Calendar.MAY, 6).getTime(), 123456, null);
        estudiantes[1] = new Persona("FABRIZZIO JHONATAN ", "ACHABAL ", "VEGA", new GregorianCalendar(2000, Calendar.JUNE, 7).getTime(), 654321, "A");
        estudiantes[2] = new Persona("HILDER", "ALANES ", "TARQUI", new GregorianCalendar(2001, Calendar.MARCH, 14).getTime(), 789123, null);
        estudiantes[3] = new Persona("IVETH ", "CAYOLA ", "FLORES", new GregorianCalendar(1999, Calendar.MARCH, 29).getTime(), 789123, "F");
        estudiantes[4] = new Persona("LUANA DARA  ", "CLAURE ", "CHOQUE", new GregorianCalendar(1999, Calendar.SEPTEMBER, 13).getTime(), 789123, null);
        estudiantes[5] = new Persona("CARLOS RAFAEL ", "CUELLAR ", "CUELLAR", new GregorianCalendar(1999, Calendar.DECEMBER, 26).getTime(), 789123, null);
        estudiantes[6] = new Persona("JHAMIL  ", "GARCIA ", "BARRIOS ", new GregorianCalendar(2003, Calendar.MARCH, 10).getTime(), 789123, null);
        estudiantes[7] = new Persona("JHAMIL PASTOR ", "JARRO ", "ROMAN", new GregorianCalendar(2000, Calendar.JUNE, 22).getTime(), 789123, "V");
        estudiantes[8] = new Persona("JUAN JOSE ", "LIZARAZU ", "QUIROGA", new GregorianCalendar(2005, Calendar.JUNE, 5).getTime(), 789123, null);
        estudiantes[9] = new Persona("JOSE CARLOS  ", "LOPEZ ", "VASQUEZ", new GregorianCalendar(2005, Calendar.APRIL, 8).getTime(), 789123, null);
        estudiantes[10] = new Persona("MATTHEW BENJAMIN ", "MAMANI ", "HURTADO", new GregorianCalendar(1999, Calendar.MARCH, 10).getTime(), 789123, null);
        estudiantes[11] = new Persona("DANIEL ALEJANDRO ", "MENA ", "SANJINES", new GregorianCalendar(1998, Calendar.OCTOBER, 11).getTime(), 789123, "H");
        estudiantes[12] = new Persona("HELEN EVELYN  ", "MURIEL ", "LEDEZMA", new GregorianCalendar(2006, Calendar.JUNE, 9).getTime(), 789123, null);
        estudiantes[13] = new Persona("PABLO LEONARDO  ", "OLIVERA ", "BENAVIDEZ ", new GregorianCalendar(2001, Calendar.NOVEMBER, 29).getTime(), 789123, null);
        estudiantes[14] = new Persona("FRANCO ", "ORELLANA ", "CALDERON", new GregorianCalendar(2004, Calendar.MARCH, 10).getTime(), 789123, null);
        estudiantes[15] = new Persona("KIMBERLY MARIANA  ", "PEREDO ", "BRISTOTT", new GregorianCalendar(2006, Calendar.AUGUST, 31).getTime(), 789123, null);
        estudiantes[16] = new Persona("HUGO ANDRES RIVERA SANCHEZ ", "RIVERA ", "SANCHEZ", new GregorianCalendar(1997, Calendar.DECEMBER, 4).getTime(), 789123, "J");
        estudiantes[17] = new Persona("JUAN DIEGO ", "SOLIZ ", "SORIA", new GregorianCalendar(1999, Calendar.JULY, 31).getTime(), 789123, null);

        // Convertir el array en lista para usar sort
        List<Persona> listaEstudiantes = Arrays.asList(estudiantes);

        // Ordenar por nombre completo
        listaEstudiantes.sort(Comparator.comparing(p -> (p.getNombre() + " " + p.getPrimerApellido() + " " + p.getSegundoApellido())));

        System.out.println("ORDENADO POR NOMBRE:");
        for (Persona persona : listaEstudiantes) {
            // Mostrar nombres completos con el complemento si existe
            System.out.println(persona.getNombre() + persona.getPrimerApellido() + persona.getSegundoApellido() +
                    (persona.ciConComplemento() ? " - Complemento: " + persona.getComplemento() : ""));
        }

        // Ordenar por edad
        listaEstudiantes.sort(Comparator.comparingInt(Persona::CalcularEdad));

        System.out.println("\n=== ORDENADO POR EDAD: ===");

        for (Persona persona : listaEstudiantes) {
            // Mostrar nombres completos con el complemento si existe
            System.out.println(persona.getNombre() + persona.getPrimerApellido() + persona.getSegundoApellido() +
                    (persona.ciConComplemento() ? " - Su carnet tiene Complemento: " + persona.getComplemento() : ""));
        }
    }
}