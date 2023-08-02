package matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*7.Hacer un programa que dado una matriz ordenada creciente por filas de
 enteros de tamaño 4*5 que se encuentra precargada, solicite al usuario un
 numero entero y una fila, y luego inserte el numero en la matriz en la fila
 indicada manteniendo su orden.*/
public class matrices_7 {
    public static final int MAX = 20;
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 5;
    public static void main(String[] args) {
        int fil,n;
        int[][] mat = new int[][]{{1,2,3,4,5},
                                   {6,7,8,9,10},
                                   {1,2,3,4,5},
                                   {6,7,8,9,10}};
        imprimir_matriz(mat);
        fil = ingresarN("Ingresar un numero de fila entre 1 y 4",MAXFILA)-1;
        n = ingresarN("Ingresar un numero entero entre 0 y 100",100);
        procesar_matriz(mat,fil,n);
        imprimir_matriz(mat);
    }
    public static void procesar_matriz(int[][] mat,int fil,int n){
        int contador = MAXCOLUMNA-1;
        while(contador>=0){
            if (mat[fil][contador] > n){
                mat[fil][contador] = mat[fil][contador-1];
            }else {
                mat[fil][contador] = n;
                break;
            }
            contador--;
        }
    }
    public static void imprimir_matriz(int[][] mat){
        for (int i = 0; i < MAXFILA; i++) {
            for (int j = 0; j < MAXCOLUMNA; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
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
}
