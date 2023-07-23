package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class arrays_7 {

    public static void main(String[] args){
        int[] array = { 1, 2, 5, 9, 11, 13, 15 };
        int n;
        n = ingresarN();
        agregarNalArray(array,n);

    }
    public static int ingresarN(){
        int n=0;
        try {
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(("Ingrese un numero entero"));
            n = Integer.valueOf(entrada.readLine());

        }catch (Exception e){
            System.out.println(e);
        }
        return n;
    }
    public static void agregarNalArray(int[] arr,int n){
        for (int i = arr.length-1; i > 0; i--) {
            int aux = arr[i-1];
            if (n<aux){
                arr[i-1]=n;
                arr[i]=aux;
            }else{
                arr[arr.length-1]=n;
            }
        }
        imprimirArray(arr);
    }
    public static void imprimirArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
