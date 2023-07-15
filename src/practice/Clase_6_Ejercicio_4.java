package practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase_6_Ejercicio_4 {

	
	public static void main(String[] args) {
		int n;
		do {
			n = ingresarN();
			if (n!=0) {
				imprimirSuma();
			}
		}while(n!=0);
	}
	public static void imprimirSuma() {
		try {
			int suma=0;
			for(int i=1;i<=200;i++) {
				suma += i;
			}
			System.out.println(suma);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public static int ingresarN() {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		try {
			do {
				System.out.println("Ingrese un numero distinto de 0");
				n = Integer.valueOf(entrada.readLine());
			}while(n==0);
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}

}
