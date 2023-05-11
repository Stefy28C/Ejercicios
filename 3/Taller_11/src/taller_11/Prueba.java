
package taller_11;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Prueba {

    public static void main(String[] args) {
        PrintStream salida = null;
        try {
            salida = new PrintStream("C:/Dato/tablas.txt");
            for (int i = 0; i <= 10; i++) {
                salida.println("Tabla de multiplicar del " + i);
                for (int j = 0; j <=10; j++) {
                    salida.println(i  + " X " + j + " =" + i*j);
                }
            } } catch (FileNotFoundException ex) {
            Logger.getLogger(Prueba.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            salida.close();
        }
    }
    }
