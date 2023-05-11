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

public class Clase1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        try {
            fr = new FileReader("d:/PruebaArchivo/gustavo.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Clase1.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader entrada = new BufferedReader(fr);
        String linea = entrada.readLine();
        System.out.println(linea);
        linea = entrada.readLine();
        System.out.println(linea);
        linea = entrada.readLine();
        System.out.println(linea);
    }
}
