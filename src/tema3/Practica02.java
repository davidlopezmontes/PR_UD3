package tema3;
import java.util.Scanner;

public class Practica02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.print("Lado: ");
        int altura = sc.nextInt();
        sc.close();

        System.out.println("Menú");
        System.out.println("1.Cuadrado con relleno");
        System.out.println("2.Cuadrado sin relleno");
        //metodoCuadradoRelleno(5);
        //metodoCuadradoSinRelleno(5);

        //switch (opcion){
            //case 1:
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

    static int scannerPedirNumero(Scanner sc, String mensaje){
        System.out.print(mensaje);
        return sc.nextInt();
    }
}

