package arrays;

import java.util.Random;

public class Practica07 {
    static int[][] matriz = new int[12][30];
    static Random random = new Random();

    static void main(String[] args) {



    }

    static void crearMartriz(){
        for (int fila = 0; fila < matriz.length; fila++){
            for(int columna = 0; columna < matriz[fila].length; columna++){
                matriz[fila][columna] = random.nextInt(-10,20);
                matriz[fila][columna] = random.nextInt(10,35);
            }
        }
    }
}
