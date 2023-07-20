import java.io.BufferedReader;
import java.io.InputStreamReader;

public class arrays_6 {
        static int[] arr = { 0,1,2,3,5,5,8,8,8,9 };
        static final int MAX = arr.length;
    public static void main(String[] args){
        int n = ingresarN();
        procesarArray(n);
        imprimirArray();
    }
    public static void procesarArray(int n){
        int contador = 0;
        int posicion = comprobar_coincidencia(n);
        if (posicion==-1){
            System.out.println("El numero no existe en el array");
        }else{
            while(contador<MAX && posicion>-1){
                corrimiento_izquierda(posicion);
                posicion = comprobar_coincidencia(n);
                contador++;
            }
        }
    }
    public static void corrimiento_izquierda(int posicion){
        while(posicion<MAX-1){
            arr[posicion]=arr[posicion+1];
            posicion++;
        }
    }
    public static void eliminar_coincidencia(int n){
        int contador=0;
        while(contador<MAX){
            if (arr[contador] == n){
                for (int i = contador; i < MAX; i++) {
                    arr[contador] = arr[contador+1];
                }
            }
            contador++;
        }
    }
    public static int comprobar_coincidencia(int n){
        int contador = 0;
        while(contador<MAX){
            if (arr[contador]==n){
                return contador;
            }
            contador++;
        }
        return -1;
    }
    public static void imprimirArray(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
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
}
