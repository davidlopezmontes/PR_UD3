package tema3;
import java.util.Scanner;

/*Crea un métod que obtenga la suma de los números naturales desde 1 hasta N. Se debe leer por teclado
el número N que debe ser mayor que cero. Se debe imprimir toda la cadena por consola. Por ejemplo, para
N=4 → ( 1+2+3+4 = 10). */

public class Practica07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el número: ");
        int s = sc.nextInt();
        sc.close();
        int resultado = sumaNaturales(s);
        System.out.println(resultado);
    }

    static int sumaNaturales(int n){
        System.out.println(n);
        int r;
        if (n<=1)
            return 1;
        else
            r = n + sumaNaturales(n-1);
        return r;

    }
}


