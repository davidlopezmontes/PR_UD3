package arrays;

import java.lang.classfile.attribute.SourceDebugExtensionAttribute;
import java.util.Arrays;

public class Practica09 {

    static void main(String[] args) {
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] m = {{1,2},{3,4}};

        System.out.println(Arrays.toString(invertirCopia(numeros)));
        System.out.println(Arrays.toString(insertarElemento(numeros, 5, 99)));
        System.out.println(Arrays.toString(eliminarElemento(numeros, 5, 99)));
        System.out.println();
        copiaMatriz();
        System.out.println();
        System.out.println(Arrays.deepToString(copiaProfunda(m)));
    }


    static int[] invertirCopia(int[] n){
        int[] copia = new int[n.length];
        //int[] copia;
        //copia = n.clone();
        System.arraycopy(n, 0, copia, 0,9);
        for (int i = 0; i < n.length; i++){
            copia[i] = n[n.length - 1 - i];
        }
        return copia;
    }


    static int[] insertarElemento(int[] n, int pos, int valor){
        int[] b = new int[n.length + 1];
        System.arraycopy(n, 0, b, 0, pos);
        b[pos] = valor;
        System.arraycopy(n, pos, b, pos + 1,n.length - pos);

        return b;
    }

    static int[] eliminarElemento(int[] n, int pos, int valor){
        int[] b = new int[n.length - 1];
        System.arraycopy(n, 0, b, 0, pos);
        System.arraycopy(n, pos + 1, b, pos,n.length - pos - 1);
        return b;
    }

    static void copiaMatriz () {
        int[][] matriz = {{1,2},{3,4}};
        int[][] c = matriz.clone();
        c[1][0] = 99;
        System.out.println(Arrays.deepToString(matriz));
        System.out.println(Arrays.deepToString(c));
    }

    static int[][] copiaProfunda (int[][] m) {
        int[][] copia = new int[m.length][0];

        for (int i = 0; i < m.length; i++){
            copia[i] = m[i].clone();
        }
        return m;
    }


}
