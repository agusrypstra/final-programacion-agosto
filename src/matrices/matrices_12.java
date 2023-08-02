package matrices;

import java.util.Random;

public class matrices_12 {
    /*Hacer un programa que dada la matriz de secuencias de caracteres definida y precargada,
    permita encontrar por cada fila la posición de inicio y fin de la anteúltima secuencia
    (considerar comenzar a buscarla a partir de la ultima posición de la fila).*/
    public static final int MAXFILA = 4;
    public static final int MAXCOLUMNA = 15;
    public static final double probabilidad_letra= 0.4;
    public static void main(String[] args) {
        char[][] matchar;
        matchar= new char[MAXFILA][MAXCOLUMNA];
        cargar_matriz_aleatorio_secuencias_char(matchar);
        imprimir_matriz(matchar);
        procesar_matriz(matchar);
    }

    public static void procesar_matriz(char[][] mat) {
        int fila = 0;
        while (fila<MAXFILA){
            buscar_anteultima_secuencia(mat,fila);
            fila++;
        }
    }

    public static void buscar_anteultima_secuencia(char[][] mat,int fil) {
        int inicio=-1;
        int fin=-1;
        for (int i = MAXCOLUMNA-1; i>0; i--) {
            if (mat[fil][i]!=' ' && mat[fil][i-1]==' '){
                for (int j = i-1; j >=0; j--) {
                    if (mat[fil][j-1]==' ' && mat[fil][j]!= ' '){
                        inicio=j;
                        for (int k = j; k < MAXCOLUMNA; k++) {
                            if (mat[fil][k]!=' ' && mat[fil][k+1] == ' '){
                                fin=k;
                                break;
                            }

                        }
                        break;
                    }

                }
                break;
            }

        }
        System.out.println("Inicio:"+inicio);
        System.out.println("Fin:"+fin);

    }
    public static void cargar_arreglo_aleatorio_char(char[] arr){
        Random r = new Random();
        arr[0] = ' ';
        arr[MAXCOLUMNA-1] = ' ';
        for(int pos = 1; pos < MAXCOLUMNA-1; pos++){
            if(r.nextDouble()>probabilidad_letra){
                arr[pos]=(char)(r.nextInt(26) + 'a');
            }
            else{
                arr[pos]=' ';
            }
        }
    }
    public static void imprimir_matriz(char[][] mat){
        for (int i = 0; i < MAXFILA; i++) {
            for (int j = 0; j < MAXCOLUMNA; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void cargar_matriz_aleatorio_secuencias_char(char[][] mat){
        for(int fila = 0; fila < MAXFILA; fila++){
            cargar_arreglo_aleatorio_char(mat[fila]);
        }
        System.out.println("");
    }
}
