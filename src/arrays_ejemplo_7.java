import java.util.Random;
public class arrays_ejemplo_7 {
    public static final int MAX = 40;
    public static final int MAXVALOR = 9;
    public static final int MINVALOR = 1;
    public static final double probabilidad_letra = 0.4;
    public static final double probabilidad_numero = 0.4;
    public static void main(String[] args) {
        char [] arrchar;
        int [] arrint;
        arrchar = new char[MAX];
        arrint = new int[MAX];
        cargar_arreglo_aleatorio_secuencias_char(arrchar);
        imprimir_arreglo_secuencias_char(arrchar);
        cargar_arreglo_aleatorio_secuencias_int(arrint);
        imprimir_arreglo_secuencias_int(arrint);
    }
    public static void cargar_arreglo_aleatorio_secuencias_char(char
                                                                        [] arr){
        Random r = new Random();
        arr[0] = ' ';
        arr[MAX-1] = ' ';
        for (int pos = 1; pos < MAX-1; pos++){
            if (r.nextDouble()>probabilidad_letra){
                arr[pos]=(char)(r.nextInt(26) + 'a');
            }
            else{
                arr[pos]=' ';
            }
        }
    }

    public static void imprimir_arreglo_secuencias_char(char [] arr){
        System.out.print("Arreglo de secuencias char\n|");
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
    public static void imprimir_arreglo_secuencias_int(int [] arr){
        System.out.print("Arreglo de secuencias int\n|");
        for (int pos = 0; pos < MAX; pos++){
            System.out.print(arr[pos]+"|");
        }
        System.out.print("\n");
    }
}