//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package tema3;

public class Practica01 {
    public static void main(String args[]) {
        IO.println("Hola me llamo " + saludo("David"));
        IO.println("El número elevado al cubo es " + elevadoCubo(2));
        IO.println("El producto de los dos número es " + productoEnteros(3, 3));
        IO.println("La tabla del int introducido es " + tablaEntero(1));
    }


    public static String saludo(String nombre) {
        return nombre;
    }


    public static int elevadoCubo(int numero) {
        return (int) Math.pow(numero, 3);
    }


    public static int productoEnteros(int numero1, int numero2) {
        return numero1 * numero2;
    }


    public static int tablaEntero(int numero) {
        int contador = 1;
        while (contador < 10) {
            contador = contador + 1;
            IO.println(numero * contador);
        }
        return numero * contador;
        //for (int i = 1; i)
    }

    public static boolean esPar(int n) {
        return n % 2 == 0;
    }
}