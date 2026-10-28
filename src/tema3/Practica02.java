package tema3;
import java.util.Scanner;

public class Practica02 {

    public static void main(String[] args) {
        System.out.println("Menú");
        System.out.println("1.Cuadrado con relleno");
        System.out.println("1.Cuadrado sin relleno");

        metodoCuadradoRelleno(5);
        metodoCuadradoSinRelleno(5);

    }

    static void metodoCuadradoRelleno(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void metodoCuadradoSinRelleno(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

