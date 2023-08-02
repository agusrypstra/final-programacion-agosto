package matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
/*Hacer un programa que dada la matriz de secuencias de enteros definida
 y precargada, permita obtener a través de métodos la posición de inicio y la posición
 de fin de la secuencia ubicada a partir de una posición entera y una fila, ambas ingresadas
  por el usuario. Finalmente, si existen imprima por pantalla ambas posiciones obtenidas.*/

public class matrices_10 {
    public static final int MAX = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 20;
    public static final double probabilidad_numero = 0.4;
    public static void main(String[] args) {
        int[][] mat = new int[MAXFILA][MAXCOLUMNA];
        cargar_matriz_aleatorio_secuencias_int(mat);
        imprimir_matriz(mat);
        int fil = ingresarN("Ingrese una numero de fila entre 1 y 4",MAXFILA)-1;
        int col = ingresarN("Ingrese un numero de columna entre 1 y 20",MAXCOLUMNA)-1;
        procesar_matriz(mat,fil,col);
    }
    public static void procesar_matriz(int[][] mat,int fil,int inicio){
        int inicio_secuencia = obtener_inicio_secuencia(mat,fil,inicio)+1;
        int fin_secuencia =obtener_fin_secuencia(mat,fil,inicio)+1;
        System.out.println(inicio_secuencia);
        System.out.println(fin_secuencia);

        if (inicio_secuencia==-1){
            System.out.println("No se encontro el inicio de la secuencia.");
        }
        if (fin_secuencia==-1){
            System.out.println("No se encontro el fin de la secuencia.");
        }
    }
    public static int obtener_inicio_secuencia(int[][]mat,int fil,int inicio){
        int n = -1;
        int contador = inicio;
        while (contador<MAXCOLUMNA){
            if (mat[fil][contador]!=0 && mat[fil][contador-1]==0){
                n=contador;
                break;
            }
            contador++;
        }
        return n;
    }
    public static int obtener_fin_secuencia(int[][]mat,int fil,int inicio){
        int n = -1;
        int contador = inicio;
        while (contador<MAXCOLUMNA){
            if (mat[fil][contador]!=0 && mat[fil][contador+1]==0){
                n=contador;
                break;
            }
            contador++;
        }
        return n;
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
