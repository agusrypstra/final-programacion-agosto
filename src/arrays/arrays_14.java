package arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/*Hacer un programa que dado el arreglo definido y precargado, y un número entero
ingresado por el usuario, copie de forma continua las secuencias de tamaño igual al
número ingresado en otro arreglo de iguales características e inicializado con 0.
La copia en este último arreglo deben comenzar desde el principio del mismo.*/
public class arrays_14 {
    public static final int MAX = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;

    public static void main(String[] args) {
        int[] arr;
        arr = new int[MAX];
        int[] newArr;
        newArr = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arr); //REUTILIZAMOS
        cargar_arreglo_ceros(newArr);
        imprimir_arreglo_secuencias_int(arr);
        imprimir_arreglo_secuencias_int(newArr);
        int n = ingresarN();
        procesarArr(arr,newArr,n);
        imprimir_arreglo_secuencias_int(newArr); //REUTILIZAMOS
    }
    public static void procesarArr(int[]arr,int[]newArr,int n){
        int contadorI=0;
        int contadorJ=0;
        int inicio=-1;
        int fin = -1;

        while (contadorI<MAX){
            if (arr[contadorI]!=0 && arr[contadorI-1]==0){
                inicio=contadorI;
                fin=buscarFin(arr,inicio);
                if (fin-(inicio-1)==n || ((fin==inicio) && n==1)){
                    copiarSecuencia(arr,newArr,inicio,fin);
                }
            }
            contadorI++;
        }
    }
    public static void copiarSecuencia(int[]arr,int[] newArr,int inicio,int fin){

        int contador=0;
        while (contador<MAX){
            if (contador>=inicio && contador<=fin){
                newArr[contador]=arr[contador];
            }
            contador++;
        }
    }
    public static int buscarFin(int[] arr,int inicio){
        int contador = inicio;
        while (arr[contador+1]!=0){
            contador++;
        }
        return contador;
    }
    public static void cargar_arreglo_ceros(int[] arr){
        for (int i = 0; i < MAX; i++) {
            arr[i]=0;
        }
    }
    public static void imprimir_arreglo_secuencias_int(int [] arr){
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++){
            System.out.print(arr[pos]+"|");
        }
        System.out.print("\n");
    }
    public static void cargar_arreglo_aleatorio_secuencias_int(int []arr){
        Random r = new Random();
        arr[0] = 0;
        arr[MAX-1] = 0;
        for (int pos = 1; pos < MAX-1; pos++){
            if (r.nextDouble()>probabilidad_numero){
                arr[pos]=(r.nextInt(MAXVALOR-MINVALOR+1) + MINVALOR);
            }
            else{
                arr[pos]=0;
            }
        }
    }
    public static int ingresarN(){
        int n=-1;
        try {
            do{
                BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Ingrese un numero entero entre 0 y " + (MAX-1));
                n = Integer.parseInt(entrada.readLine());
            }while (0 > n &&n>MAX);
        }catch (Exception e){
            System.out.print(e);
        }
        return n;
    }
}
