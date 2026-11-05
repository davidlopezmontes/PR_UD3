package arrays;
import java.util.Random;

public class Practica05 {
    static int[] temperaturasMeses = new int[12];
    static Random random = new Random();

    static void llenarArray(){
        for (int i = 0; i < temperaturasMeses.length; i++){
            temperaturasMeses[i] = random.nextInt(41);
        }
    }
    static void mostrarOrdenNormal(){
        for (int t : temperaturasMeses){
            System.out.println(t);
        }
        System.out.println();
    }
    static void mostrarOrdenInverso(){
        for (int i = temperaturasMeses.length - 1; i >= 0; i--){
            System.out.println(temperaturasMeses[i]);
        }
        System.out.println();
    }

    static void mostrarMesesCalurosos(){
        System.out.println("Meses calurosos");
        for (int t : temperaturasMeses){
            if (t>30){
                System.out.println(t);
            }
        }
    }

    static double media() {
        int total = 0;
        for (int t : temperaturasMeses) {
            total = total + t;
        }
        return  (double) total/12;
    }

    private static boolean temperaturaRepetida(){
        System.out.println("¿Hay temperaturas repetidas?");
        for (int i = 0; i < temperaturasMeses.length; i++){
            for (int j = i + 1; j < temperaturasMeses.length; j++){
                if (temperaturasMeses[i] == temperaturasMeses[j]){
                    return true;
                }
            }
        }
        return false;
    }

    static boolean estaEnLosPrimeros(int valor, int n){;
        for (int i = 0; i < n; i++){
            if (temperaturasMeses[i] == valor){
                return true;
            }
        }
        return false;
        }

    static void llenarSinRepetidos(){
        int i = 0;
        while(i < temperaturasMeses.length){
            int t = random.nextInt(41);
            if (!estaEnLosPrimeros(t, i)){
                temperaturasMeses[i++] = t;
            }
        }
    }




    static void main(String[] args) {
        llenarArray();
        mostrarOrdenNormal();
        mostrarOrdenInverso();
        System.out.println("Media anual: " + media());
        mostrarMesesCalurosos();
        System.out.println(temperaturaRepetida());
    }

}