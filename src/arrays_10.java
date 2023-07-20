import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
/*Hay que ingresar una posicion
* a parir de esa posicion buscar una secuencia
* encontrar el inicio y el fin de la secuencia
* mostrarlos*/
public class arrays_10 {
    public static final int MAX = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;
    public static void main(String[] args) {
        int[] arr;
        arr = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arr); //REUTILIZAMOS
        imprimir_arreglo_secuencias_int(arr); //REUTILIZAMOS
        int n = ingresarN();
        buscarSecuencia(n,arr);
    }
    public static void buscarSecuencia(int n,int[] arr){
        int ini=-1;
        int fin = -1;
        if (arr[n]!=0){
            ini = buscarInicio(n,arr);
            fin = buscarFin(n,arr);
        }else {
            System.out.println("No acertaste a ninguna secuencia");
        }
        System.out.println("Inicio: " + ini);
        System.out.println("Final: " + fin);

    }
    public static int buscarInicio(int n,int[] arr){
        int ini=n;
        while(ini>=0){
            if (arr[ini]==0){
                return ini+1;
            }
            ini--;
        }
        return -1;
    }
    public static int buscarFin(int n,int[] arr){
        int fin=n;
        while(fin<MAX){
            if (arr[fin]==0){
                return fin-1;
            }
            fin++;
        }
        return -1;
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
    public static void imprimir_arreglo_secuencias_int(int [] arr){
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++){
            System.out.print(arr[pos]+"|");
        }
        System.out.print("\n");
    }
    public static void cargar_arreglo_aleatorio_secuencias_int(int []
                                                                       arr){
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
}
