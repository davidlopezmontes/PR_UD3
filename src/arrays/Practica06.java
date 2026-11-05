package arrays;

public class Practica06 {
    /* 1. static char[][] crearMatriz(int n): crea una matriz de n × n con una X en la diagonal
principal y un guion en el resto. static void imprimirMatriz(char[][] m): la muestra.
[Diagonal.java] */
    static char[][] crearMatriz (int n){
        char[][] matriz = new char[n][n];
        for (int fila = 0; fila< matriz.length; fila++){
            for (int columna = 0; columna < matriz[fila].length; columna++){
                matriz[fila][columna] = (fila == columna) ? 'X' : '-';
            }
        }
        return matriz;
    }

    static void imprimirMatriz(char[][] m){
        for(char[] fila : m){
            for (char c : fila){
                System.out.print(c + " ");
                System.out.println();
            }
        }
    }



static void main(String[] args) {
    imprimirMatriz(crearMatriz(4));
    }
}
