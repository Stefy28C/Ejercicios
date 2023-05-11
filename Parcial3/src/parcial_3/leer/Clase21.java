/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial_3.leer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clase21 {

    public static void main(String[] args) {
        //   leer de archivo
        Informacion info = new Informacion();
        Pila pila = new Pila();
        FileReader fr;
        try {
            fr = new FileReader("d:/PruebaArchivo/gustavo.txt");
            BufferedReader entrada = new BufferedReader(fr);
            String linea = entrada.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = entrada.readLine();
                info.dato = linea;
                pila.agregar(info);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Clase1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Clase1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
