package matrices;

import java.util.Random;


public class matrices_11 {
    public static final int MAX = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 15;
    public static final double probabilidad_numero = 0.4;
    public static void main(String[]args){
        int[][] mat = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz_aleatorio_secuencias_int(mat);
        imprimir_matriz(mat);
        procesar_matriz(mat);
    }
    /*Hacer un programa que dada la matriz de secuencias de
enteros definida y precargada permita encontrar por cada fila la
posición de inicio y fin de la secuencia cuya suma de valores sea mayor.*/
    public static void procesar_matriz(int[][]mat){
        for (int i = 0; i < MAXFILA; i++) {
            buscar_secuencia(mat,i);
        }
    }

    public static void buscar_secuencia(int[][]mat,int fil) {
        int inicio=-1;
        int fin=-1;
        int contador=0;
        int contadorJ;

        int suma=0;
        while (contador<MAXCOLUMNA){
            int sumaTemp=0;
            if (mat[fil][contador]!=0 || contador==0 ){
                contadorJ=contador;
                while (contadorJ<MAXCOLUMNA && mat[fil][contadorJ]!=0){
                    sumaTemp+=mat[fil][contadorJ];
                    contadorJ++;
                }
                if (sumaTemp>suma){
                    suma = sumaTemp;
                    inicio = contador;
                    fin = contadorJ-1;
                }
            }
            contador++;
        }
        System.out.println("Inicio: "+inicio+" Fin: "+fin);
    }
    public static void imprimir_matriz(int[][] mat){
        for (int i = 0; i < MAXFILA; i++) {
            for (int j = 0; j < MAXCOLUMNA; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void cargar_matriz_aleatorio_secuencias_int(int [][]mat){
        Random r = new Random();
        mat[0][0] = 0;
        mat[MAXFILA-1][MAXCOLUMNA-1] = 0;
        for (int i = 0; i < MAXFILA; i++) {
            for (int j = 0; j < MAXCOLUMNA; j++) {
                if (r.nextDouble()>probabilidad_numero){
                    mat[i][j]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
                }
                else{
                    mat[i][j]=0;
                }
            }
        }
    }
}
