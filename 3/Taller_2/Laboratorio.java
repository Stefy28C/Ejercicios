package Taller_2;

import java.util.Scanner;

public class Laboratorio {

    public void Resultado() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Especifique su genero");
        System.out.println("1. Hombre");
        System.out.println("2. Mujer");
        int sexo = teclado.nextInt();

        System.out.println("Seleccione su rango de edad");
        System.out.println("1. 0 - 1 mes");
        System.out.println("2. 1 y 6 meses ");
        System.out.println("3. 6 y 12 meses");
        System.out.println("4. 1 y 5 años");
        System.out.println("5. 5 y 10 años");
        System.out.println("6. 10 y 15 años ");
        System.out.println("7. mayor de  15 años");
        int edad = teclado.nextInt();

        System.out.println("Ingrese el nivel de hemoglobina");
        float hemo = teclado.nextFloat();

        if (edad == 1 && hemo < 13 || edad == 1 && hemo > 26) {
            System.out.println("El resultado de su examen fue positivo");
        } else if (edad == 2 && hemo < 10 || edad == 2 && hemo > 18) {
            System.out.println("El resultado de su examen fue positivo");
        } else if (edad == 3 && hemo < 11 || edad == 3 && hemo > 15) {
            System.out.println("El resultado de su examen fue positivo");
        } else if (edad == 4 && hemo < 11.5 || edad == 4 && hemo > 15) {
            System.out.println("El resultado de su examen fue positivo");
        } else if (edad == 5 && hemo < 12.6 || edad == 5 && hemo > 15.5) {
            System.out.println("El resultado de su examen fue positivo");
        } else if (edad == 6 && hemo < 13 || edad == 6 && hemo > 15.5) {
            System.out.println("El resultado de su examen fue positivo");
        } else if (edad == 7 && hemo < 12 && sexo == 1 || edad == 7 && hemo > 16 && sexo == 1) {
            System.out.println("El resultado de su examen fue positivo");
        } else if (edad == 7 && hemo < 12 && sexo == 2 || edad == 8 && hemo > 16 && sexo == 2) {
            System.out.println("El resultado de su examen fue positivo");
        } else {
            System.out.println("El resultado de su examen fue negativo");
        }
    }

}
