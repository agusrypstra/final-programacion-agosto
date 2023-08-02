package matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/*Hacer un programa que dado una matriz ordenada creciente por filas
de enteros de tamaño 4*5 que se encuentra precargada, solicite al usuario
 un numero entero y una fila, y elimine la primer ocurrencia de numero en
 la fila indicada (un número igual) si existe.*/
public class matrices_8 {
    public static final int MAX = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 5;
    public static final double probabilidad_numero = 0.4;
    public static void main(String[] args) {
        int fil,n;
        int[][] mat = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz_aleatorio_secuencias_int(mat);
        imprimir_matriz(mat);
        fil = ingresarN("Ingresar un numero de fila entre 1 y 4",MAXFILA)-1;
        n = ingresarN("Ingresar un numero entero entre 0 y 100",100);
        procesar_matriz(mat,fil,n);
        imprimir_matriz(mat);
    }
    public static void procesar_matriz(int[][] mat,int fil,int n){
        int contador = 0;
        boolean existe = false;
        while (contador<MAXCOLUMNA){
            if (mat[fil][contador]==n){
                mat[fil][contador] = -1;
                existe = true;
            }
            contador++;
        }
        if(!existe){
            System.out.println("El numero ingresado no se encuentra en la fila");
        }
    }
    static int ingresarN(String msg,int max) {
        int n=0;
        try {
            do {
                BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
                System.out.println(msg);
                n = Integer.valueOf(entrada.readLine());
            }while (n<1 && n>max);
        } catch (Exception e) {
            System.out.println(e);
        }
        return n;
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
