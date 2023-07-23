package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Hacer un programa que dado un arreglo de enteros de tamaño 10 que se
encuentra precargado, solicite al usuario el ingreso de dos números
enteros (posiciones del arreglo) y ordene de forma creciente el arreglo
entre dos posiciones correspondientes a los números ingresados.
*/
public class arrays_9 {

    public static void main(String[] args){
        int[] array = { 15,23,5,45,2,84,65,6,32,21,12,44,1,22,2,3};
        int pos1 = ingresarN(array.length);
        int pos2 = ingresarN(array.length);
        ordenarArray(pos1,pos2,array);
    }
    public static void ordenarArray(int pos1,int pos2,int[] array){
        for (int i = pos1; i <= pos2; i++) {
            for (int j = pos1; j <= pos2-1; j++) {
                if (array[j]>array[j+1]){
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1]=aux;
                }
            }
        }
        imprimirArray(array);
    }
    public static int ingresarN(int MAX){
        int n=-1;
        try {
            do{
                BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Ingrese un numero entero entre 0 y " + (MAX-1));
                n = Integer.valueOf(entrada.readLine());
            }while (n<0&&n>MAX);
        }catch (Exception e){
            System.out.println(e);
        }
        return n;
    }
    public static void imprimirArray(int[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
