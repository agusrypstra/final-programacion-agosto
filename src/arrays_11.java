import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class arrays_11 {
    public static final int MAX = 20;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_numero = 0.4;
    public static void main(String[] args) {
        int[] arr;
        arr = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_int(arr); //REUTILIZAMOS
        imprimir_arreglo_secuencias_int(arr); //REUTILIZAMOS
        buscarSecuencia(arr);
    }
    public static void buscarSecuencia(int[] arr){
        int inicio=-1;
        int suma=0;
        for (int i = 0; i < arr.length; i++) {
        int sumaAux=0;
            if (arr[i]!=0){
                for (int j = i; j < arr.length; j++) {
                    if (arr[j]!=0){
                        sumaAux+=arr[j];
                    }else{
                        break;
                    }
                }
                if (sumaAux>suma){
                    suma = sumaAux;
                    inicio=i;
                }
            }
        }
        System.out.println("Suma: "+suma+". Inicio: "+inicio);
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
