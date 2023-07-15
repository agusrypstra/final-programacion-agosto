package practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Clase6_Ejercicio_10 {

	static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
	final static int MIN=1,MAX=10;
	final static int MIN_LOWER=97,MAX_LOWER=122,MIN_UPPER=65,MAX_UPPER=90,MIN_DIGIT=48,MAX_DIGIT=57;
	public static void main(String[] args) {
	int n;
	char c;
	do {
		n = ingresarN();
		if(n>=MIN && n<=MAX) {
			c = ingresarCaracter();
			imprimirPropiedadesDelCaracter(c);
		}else {
			break;
		}
	}while(n>=MIN && n<=MAX);
	System.out.println("Fin del programa");
	}
	public static int ingresarN() {
		int n=0;
		try {
			System.out.println("Ingrese un numero entre 1 y 10.");
			n = Integer.valueOf(entrada.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		return n;
	}
	public static char ingresarCaracter() {
		char c=' ';
		try {
			do {
				System.out.println("Ingresar un caracter.");
				c = entrada.readLine().charAt(0);
			}while(c==' ');
		} catch (Exception e) {
			System.out.println(e);
		}
		return c;
	}
	public static void imprimirPropiedadesDelCaracter(char c) {
		if((c>=MIN_LOWER && c<=MAX_LOWER) || (c>=MIN_UPPER && c<=MAX_UPPER) || (c>=MIN_DIGIT && c<=MAX_DIGIT)) {
			if((c>=MIN_LOWER && c<=MAX_LOWER)) {
				System.out.println("Es una letra minuscula.");
			}
			if(c>=MIN_UPPER && c<=MAX_UPPER) {
				System.out.println("Es una letra mayuscula.");
			}
			if(c>=MIN_DIGIT && c<=MAX_DIGIT) {
				System.out.println("Es un digito");
			}
		}
		else {
			System.out.println("Es otro tipo de caracter.");
		}
	}
}