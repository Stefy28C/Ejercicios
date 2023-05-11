package taller6_2;

import java.util.ArrayList;

public class ProcesadorArraylist {

    public void imprimirArraylistPersonas(ArrayList<Persona> imprimirPersona) {
        Persona persona = new Persona();
        int i = 0;
        System.out.println(
                "Nombre\t\t\t"
                + "Numero de documento\t\t\t"
                + "Edad\t\t\t"
                + "Peso\t\t\t"
                + "Estatura\t\t\t"
                + "Numero de hermanos\t\t\t"
                + "Numero de hijos\t\t\t"
                + "Genero\t\t\t"
                + "Promedio Edades\t\t\t"
                + "Promedio Estatura\t\t\t"
                + "Cantidad de Hombres\t\t\t"
                + "Cantidad de Mujeres\t\t\t"
        );

        while (i < imprimirPersona.size()) {
            System.out.println(
                    imprimirPersona.get(i).Nombre + "\t\t\t"
                    + imprimirPersona.get(i).documento + "\t\t\t"
                    + imprimirPersona.get(i).edad + "\t\t\t"
                    + imprimirPersona.get(i).peso + "\t\t\t"
                    + imprimirPersona.get(i).altura + "\t\t\t"
                    + imprimirPersona.get(i).n_hermanos + "\t\t\t"
                    + imprimirPersona.get(i).n_hijos + "\t\t\t"
                    + imprimirPersona.get(i).sexo + "\t\t\t"
            );

            i++;

        }

    }

}
