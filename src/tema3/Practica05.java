package tema3;

public class Practica05 {

    public static void main(String[] args) {
        int p = potencia(4, 1);
        System.out.println(p);
    }

    static int potencia(int base, int exponente) {
        if (exponente == 1)
            return base;
        else
            return base * potencia(base, exponente - 1);
    }

}
