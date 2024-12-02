import models.Persona; 
import models.genericos.Caja;
import models.genericos.Par;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Caja<String> cajaString = new Caja<>();
        Caja<Integer> cajaInteger = new Caja<>();
        Caja<Persona> cajaPersona = new Caja<>();
        Par<String, Integer> par = new Par<>();

        // Implementacion de guardar objeto de la clase Caja
        cajaString.guardar("Guardar un String");
        cajaInteger.guardar(10);
        // Implementacion de guardar objeto de la clase Par
        par.establecerClave("establece clave");
        par.establecerValor(30);
        // Creacion de persona(objeto) y obtener atributos
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setEdad(10);
        cajaPersona.guardar(persona);

        // Imprimir valores
        System.out.println(cajaString.obtener());
        System.out.println(cajaInteger.obtener());
        System.out.println(cajaPersona.obtener());
        System.out.println(cajaPersona.obtener().getNombre());
        System.out.println(cajaPersona.obtener().getEdad());
        System.out.println(par.obtenerClave());
        System.out.println(par.obtenerValor());

        /// ------------------------------------------------------------------------------------

        System.out.println("PRACTICA EN CLASE: " );
        // Creacion de arreglo de 10 objeto Persona con datos
        Persona[] personas = new Persona[10];
        personas[0] = new Persona("Maria", 12);
        personas[1] = new Persona("Juan", 20);
        personas[2] = new Persona("Pedro", 24);
        personas[3] = new Persona("Ana", 17);
        personas[4] = new Persona("Luis", 6);
        personas[5] = new Persona("Carlos", 16);
        personas[6] = new Persona("Jorge", 8);
        personas[7] = new Persona("Sofia", 9);
        personas[8] = new Persona("Daniel", 10);
        personas[9] = new Persona("Eduardo", 11);

        ArrayList<Par<String, Integer>> mayores = new ArrayList<>();
        ArrayList<Par<Integer, String>> menores = new ArrayList<>();

        for (Persona persona1 : personas) {
            if (persona1.getEdad() >= 18) {
                mayores.add(new Par<>(persona1.getNombre(), persona1.getEdad()));
            } else {
                menores.add(new Par<>(persona1.getEdad(), persona1.getNombre()));
            }
        }

        System.out.println("Mayores de edad: ");
        for (Par<String, Integer> par1 : mayores) {
            System.out.println(par1.obtenerClave() + " " + par1.obtenerValor());
        }

        System.out.println("Menores de edad: ");
        for (Par<Integer, String> par2 : menores) {
            System.out.println(par2.obtenerClave() + " " + par2.obtenerValor());
        }
    }
}