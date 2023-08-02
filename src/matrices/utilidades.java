package matrices;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class utilidades {
    public static final int MAX = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 5;
    public static final double probabilidad_numero = 0.4;
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

