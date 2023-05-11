package Arrays;

public class Ejercicio3 {

    DatosClases obj3 = new DatosClases();
    int i;

    public void NegativosPositivosCeros() {

        System.out.println("Ingrese el tamaño del Vector ");
        obj3.t = Leer.datoInt();
        obj3.Numero = new int[obj3.t];

        System.out.println("Ingrese datos del vector");


        for (i = 0; i < obj3.t; i++) {
            System.out.print("A[ " + i + " ]=  ");
            obj3.Numero[i] = Leer.datoInt();

            if (obj3.Numero[i] > 0) {
                obj3.SumaPositivos += obj3.Numero[i];
                obj3.CPositivos++;
            } else if (obj3.Numero[i] == 0) {
                obj3.CCeros++;
            } else {
                obj3.SumaNegativos += obj3.Numero[i];
                obj3.CNegativos++;
            }


        }
        System.out.println("Usted ingreso " + obj3.CPositivos + " numeros positivos");
        System.out.println("Usted ingreso " + obj3.CCeros + " ceros");
        System.out.println("Usted ingreso " + obj3.CNegativos + " numeros negativos");
        System.out.println("------------------------------------------------");
        System.out.println("La suma de los positivos es: " + obj3.SumaPositivos);
        System.out.println("La suma de los negativos es: " + obj3.SumaNegativos);
    }
}
