package parcial_3.leer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {
        Pila pila = new Pila();
         Informacion info = new Informacion();
        int opcion = -1;
        while (opcion != 5) {
            System.out.println("MENU:");
            System.out.println("1. Primer punto(Leer el archivo plano)");
            System.out.println("2. Atender primer y último dato");
            System.out.println("3. Listar");
            System.out.println("4. Cargar datos atendidos al archivo plano");
            System.out.println("5. salir");

            opcion = Leer.datoInt();

            switch (opcion) {
                case 1: {
                   FileReader fr;
                    try {
                        fr = new FileReader("c:/Prueba/Arch.txt");
                        BufferedReader entrada = new BufferedReader(fr);
                        String linea = entrada.readLine();
                        while (linea != null) {
                              info = new Informacion();
                          // System.out.println(linea);
                            
                            info.dato = linea;
                            pila.agregar(info);
                            linea = entrada.readLine();
                        }
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Clase1.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Clase1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
                    
                    break;
                    }
                
                case 2: {
                     info = pila.atender1();
                    System.out.println("El primer y último dato fueron atendidos : ");
                    break;
                }
                case 3:
                    pila.listar();
                    break;

                case 4:
                   pila.BajarArchivo();
                    System.out.println("Ya se cargó el archivo");

                    
                    break;
                    
                        
                default:
                    break;
                
            }
        }
        System.out.println("Terminado");
    }
}
