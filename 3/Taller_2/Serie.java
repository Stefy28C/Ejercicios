package Taller_2;

public class Serie {

    public void Patron() {

        int limite = 0;
        int num = 1000;

        while (limite < 8) {
            limite++;
            num = num + 10;
            if (limite == 6) {
                num = num + 10;
            } else if (limite == 8) {
                num = num + 910;
            }
             System.out.println(num);
        }
       
    }
}
