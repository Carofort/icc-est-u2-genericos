import models.Persona;
import models.genericos.Caja;

public class App {
    public static void main(String[] args) throws Exception {
        Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInteger = new Caja<>();
        Caja<Persona> cajaPersona = new Caja<>();

        Persona persona = new Persona ();
        persona.setNombre("Carolina");
        persona.setEdad(20);

        cajaString.guardar("Guardo un String");
        cajaInteger.guardar(10);
        cajaPersona.guardar(persona);

        System.out.println(cajaString.obtener());
        System.out.println(cajaInteger.obtener());
        System.out.println(cajaPersona.obtener());

    }
}

