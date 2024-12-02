import models.Persona;
import models.genericos.Caja;
import models.genericos.Par;

public class App {
    public static void main(String[] args) throws Exception {
        Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInteger = new Caja<>();
        Caja<Persona> cajaPersona = new Caja<>();

        Persona persona = new Persona (null, 0);
        persona.setNombre("Carolina");
        persona.setEdad(20);

        cajaString.guardar("Guardo un String");
        cajaInteger.guardar(10);
        cajaPersona.guardar(persona);

        System.out.println(cajaString.obtener());
        System.out.println(cajaInteger.obtener());
        System.out.println(cajaPersona.obtener());

        Par<String, Integer> parStringInteger = new Par<>();
        Par<Integer, String> parIntegerString = new Par<>();

        parStringInteger.establecerClave("Aguacate");
        parStringInteger.establecerValor(2);
        parIntegerString.establecerClave(12);
        parIntegerString.establecerValor("doce");

        System.out.println(parStringInteger.obtenerClave());
        System.out.println(parStringInteger.obtenerValor());
        System.out.println(parIntegerString.obtenerClave());
        System.out.println(parIntegerString.obtenerValor());

        Persona[] personas = {
            new Persona("Veronica", 17),
            new Persona("Carolina", 16),
            new Persona("Emanuel", 23),
            new Persona("Sebastian", 21),
            new Persona("Esteban", 18),
            new Persona("Juan", 13),
            new Persona("Jonnathan", 12),
            new Persona("Nicole", 35),
            new Persona("Genesis", 22),
            new Persona("Mateo", 19),
        };   
        int personasMayores = 0;
        int personasMenores = 0;

        for (int i = 0; i < personas.length; i++) {
            if(personas[i].getEdad() >= 18){
                personasMayores++;
            } else{
                personasMenores++;
            }
        }
        Par<String,Integer>[] mayores = new Par[personasMayores];
        Par<Integer,String>[] menores = new Par[personasMenores];

        int contadorMayores = 0;
        int contadorMenores = 0;
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() >= 18) {
                mayores[contadorMayores] = new Par<String, Integer>();
                mayores[contadorMayores].establecerClave(personas[i].getNombre());
                mayores[contadorMayores].establecerValor(personas[i].getEdad());
                contadorMayores++;
            }else{
                menores[contadorMenores] = new Par<Integer, String>();
                menores[contadorMenores].establecerClave(personas[i].getEdad());
                menores[contadorMenores].establecerValor(personas[i].getNombre());
                contadorMenores++;
            }
        }
        System.out.println("MAYORES DE EDAD");
        for (Par<String, Integer> par : mayores) {
            System.out.println(par.obtenerClave() + " - " + par.obtenerValor());
        }
        System.out.println("MENORES DE EDAD");
        for(Par<Integer, String> par : menores){
            System.out.println(par.obtenerClave() + " - " + par.obtenerValor());
        }
    }
}

