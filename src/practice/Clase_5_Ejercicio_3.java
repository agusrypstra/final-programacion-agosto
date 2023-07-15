package practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Clase_5_Ejercicio_3 {

	public static void main(String[] args) {
		try {
			int n=0;
			do {
				BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Ingrese un entero.");
				n = Integer.valueOf(entrada.readLine());
				System.out.println(n);
			}while(n!=0);
			System.out.println("Fin del programa.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
