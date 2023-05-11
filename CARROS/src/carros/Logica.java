package carros;

public class Logica {

    DATOS obj1 = new DATOS();

    public void Mostrar() {
        int placa;
        System.out.println("BIENVENIDO A SEGURIDAD PÚBLICA DE LA CIUDAD DE MEXICO");
        //obj1.opcion=Leer.datoInt();
        
        //HACER HASTA QUE
        while (obj1.opcion == 0) {
            System.out.println("INGRESE  EL ULTIMO DIGITO DE SU PLACA");
            obj1.placa = Leer.datoInt();

            if (obj1.placa == 1 || obj1.placa == 2) {
                System.out.println("SU  CARRO  ES  AMARILLO PELELE");
                obj1.Amarillo++;
            } else if (obj1.placa == 3 || obj1.placa == 4) {
                System.out.println("SU  CARRO  ES ROSA PELELE");
                obj1.Rosa++;
            } else if (obj1.placa == 5 || obj1.placa == 6) {
                System.out.println("SU  CARRO  ES  ROJO PELELE");
                obj1.Roja++;
            } else if (obj1.placa == 7 || obj1.placa == 8) {
                System.out.println("SU  CARRO  ES  VERDE  PELELE");
                obj1.Verde++;
            } else if (obj1.placa == 9 || obj1.placa == 0) {
                System.out.println("SU  CARRO  ES AZUL  PELELE");
                obj1.Azul++;

            }else{
                System.out.println("PLACA INVALIDA");
            }
            
            System.out.println("si hay mas vehiculos digite 1, de lo contrario oprima 0");
            obj1.salida=Leer.datoInt();
            if(obj1.salida==0){
               obj1.opcion=1; 
            }
            
        }
        
        System.out.println("LAS  PLACAS  DE COLOR  AMARTILLO  SON " + obj1.Amarillo);
        System.out.println("LAS  PLACAS  DE COLOR  ROSA  SON " + obj1.Rosa);
        System.out.println("LAS  PLACAS  DE COLOR  ROJO  SON " + obj1.Roja);
        System.out.println("LAS  PLACAS  DE COLOR  VERDE SON " + obj1.Verde);
        System.out.println("LAS  PLACAS  DE COLOR AZUL  SON " + obj1.Azul);
    }
}
