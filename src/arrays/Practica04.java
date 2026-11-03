package arrays;

public class Practica04 {
    static void main(String[] args) {
        int[] numeros = {0,2,2,3,4};
        String[] aves = {"paloma", "pollo", "avestruz", "kiwi"};
        System.out.println("El número introducido aparece: " + ContarApariciones(numeros, 2));
        System.out.println("La palabra más grande es: " + StringMasLarga(aves));
        System.out.println("Las palabras que empiezan por la letra introducida son:");
        EmpiezanPor(aves,'p');

    }

    //1.
    static int ContarApariciones(int[] enteros, int valor){
        int contador = 0;
        for (int i = 0; i < enteros.length; i++){
            if (enteros[i] == valor){
                contador ++;
            }
        }
        return contador;
    }

    //2.
    static String StringMasLarga(String[] arrayStrings){
        String palabra = "";
        for (String n : arrayStrings){
            if(n.length() > palabra.length()){
                palabra = n;
            }
        }
        return palabra;
    }

    //3.
    static void EmpiezanPor(String[] arrayStrings, char caracter){
        for (String n : arrayStrings){
            if (!n.isEmpty() && n.charAt(0) == caracter){
                System.out.println(n);
            }
        }
    }

    //4.


}
