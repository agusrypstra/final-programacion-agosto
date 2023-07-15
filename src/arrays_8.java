/*Hacer un programa que dado un arreglo ordenado
creciente de enteros
de tamaño 10 que se encuentra precargado,
solicite al usuario un numero
entero y elimine la primer ocurrencia de numero
(un número igual) en el
arreglo (si existe).*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class arrays_8 {
    public static void main(String[] args){
        int[] array = { 0,1,2,3,5,5,6,7,8,9 };
        int[] newArray = new int[array.length-1];;
        int n = ingresarN();
        newArray = eliminarElemento(array,newArray,n);
        imprimirArray(newArray);
    }
    public static int[] eliminarElemento(int[]arr,int[]newArr,int n){
        int posicion = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==n){
                posicion = arr[i];
                break;
           }
        }
        if (posicion==-1){
            return arr;
        }
        int newIndex=0;
        for (int i = 0; i < arr.length; i++) {
            if (i!=posicion){
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }
        return newArr;
    }
    public static void imprimirArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int ingresarN(){
        int n=0;
        try {
        }catch (Exception e){
            System.out.println(e);
        }
        return n;
    }
}
