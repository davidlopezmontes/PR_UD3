package arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;

public class Practica07 {
    static int[][] matriz = new int[12][30];
    static Random random = new Random();


    static void main(String[] args) {
        crearMartriz();
        tablaMatriz();
        System.out.println(temperaturaMediaAnual());
        System.out.println(Arrays.toString(temperaturaMediaMes()));

    }


    static void crearMartriz() {
        for (int mes = 0; mes < matriz.length; mes++) {
            for (int dia = 0; dia < matriz[mes].length; dia++) {
                boolean mesFrio = mes <= 2 || mes >= 10; //de 0 a 11 meses (12)
                if (mesFrio) {
                    matriz[mes][dia] = random.nextInt(-10, 20);
                } else {
                    matriz[mes][dia] = random.nextInt(10, 35);
                }
            }
        }
    }


    static void tablaMatriz() {
        for (int mes = 0; mes <= 11; mes++) {
            System.out.printf("Mes %2d: ", mes + 1);
            for (int t : matriz[mes]) {
                System.out.printf("Temperatura %+3d ", t);
            }
            System.out.println();
        }
    }


    static double temperaturaMediaAnual() {
        int sumaTemp = 0;
        int contador = 0;
        for (int mes = 0; mes <= 11; mes++) {
            for (int t : matriz[mes]) {
                contador++;
                sumaTemp += t;
            }
        }
        return (double) sumaTemp / contador;
    }


    static double[] temperaturaMediaMes() {
        double[] mediaMes = new double[12];
        for (int mes = 0; mes < matriz.length; mes++) { //de 0 a 11
            int suma = 0;
            for (int t : matriz[mes]) {
                suma += t;
            }
            mediaMes[mes] = (double) suma / matriz[mes].length;
        }
        return mediaMes;
    }
}