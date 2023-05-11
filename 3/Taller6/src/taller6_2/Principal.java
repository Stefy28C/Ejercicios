package taller6_2;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Persona> listaPersona = new ArrayList<Persona>();
        Persona persona = new Persona();

        System.out.println("Ingrese la cantidad de personas");
        persona.promedioEdades();
        int cant = Leer.datoInt();
        // persona.cantidad=Leer.datoInt();
        float acumEdad = 0;
        float acumEst = 0;
        float edadTotal = 0;
        float estaturaTotal = 0;
        int contadorMujeres = 0;
        int contadorHombres = 0;
        for (int i = 0; i < cant; i++) {
            persona = new Persona();
            persona.cantidad = cant;
            System.out.println("______________________________________");

            System.out.println("Ingrese el nombre ");
            persona.Nombre = Leer.dato();
            System.out.println("Ingrese el documento ");
            persona.documento = Leer.datoInt();
            System.out.println("Ingrese la edad");

            persona.edad = Leer.datoInt();
            System.out.println("Ingrese el peso");
            persona.peso = Leer.datoInt();
            System.out.println("Ingrese la estatura");
            persona.altura = Leer.datoInt();
            System.out.println("Ingrese el numero de hermanos");
            persona.n_hermanos = Leer.datoInt();
            System.out.println("Ingrese el numero de hijos");
            persona.n_hijos = Leer.datoInt();
            System.out.println("Ingrese el genero");
            persona.sexo = Leer.dato();

            //operaciones de edades 
            acumEdad += persona.promedioEdades();
            edadTotal = acumEdad / cant;
            //operaciones de estatura
            acumEst += persona.promedioEstatura();
            estaturaTotal = acumEst / cant;
            //conteo de hombres 
            if (persona.sexo.equals("F")) {
                contadorMujeres++;
            }

            if (persona.sexo.equals("M")) {
                contadorHombres++;
            }

            listaPersona.add(persona);

        }

        ProcesadorArraylist p = new ProcesadorArraylist();
        p.imprimirArraylistPersonas(listaPersona);

        System.out.println("------------------------------------------------------------------------------");
        //System.out.println("El promedio de edades es: " + acum + "\n");
        System.out.println("El promedio de edades es: " + edadTotal + "\n");
        System.out.println("El promedio de estatura es " + estaturaTotal + "\n");
        System.out.println("La cantidad de mujeres es " + contadorMujeres);
        System.out.println("La cantidad de hombres es " + contadorHombres);

    }

}
