import java.util.Random;

public class arrays_12 {

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
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i]!=0){
                for (int j = i-1; j > 0; j--){
                    if (arr[j]!=0 && arr[j+1]==0){
                        for (int k = j; k>0; k--) {
                            if (arr[k]!=0 && arr[k-1]==0){
                                inicio = k;
                                break;
                            }
                        }
                        if (inicio>=0){
                            break;
                        }
                    }
                }
                if (inicio>=0){
                    break;
                }
            }
        }
        if (inicio>=0) {
            System.out.println("El inicio de la anteultima secuencia es: " + inicio);
        }else {
            System.out.println("No hay anteultima serie");
        }
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
