package taller6_2;

public class Persona {

    public String Nombre;
    public long documento;
    public float edad;
    public int peso;
    public int altura;
    public int n_hermanos;
    public int n_hijos;
    public String sexo;
    public float cantidad;
   

    //promedio de edades
    public float promedioEdades() {

        return edad;

    }

    //promedio de estatura
    public float promedioEstatura() {
        return altura;

    }

    //cantidad de hombres
    public String cantidadHombres() {

        return sexo;
    }

    //cantidad de mujeres
    public String cantidadMujeres() {
        return sexo;
    }
}
