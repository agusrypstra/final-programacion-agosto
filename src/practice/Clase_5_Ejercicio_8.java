/*Escribir un programa que mientras que el usuario ingrese un caracter letra
minúscula, pida ingresar un numero entero. Si el número ingresado está
entre 1 y 5 inclusive deberá imprimir la tabla de multiplicar de dicho
numero.*/
package practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase_5_Ejercicio_8 {
	public static void main(String[] args) {
		try {
			final int MIN_LOWERCASE = 97;
			final int MAX_LOWERCASE = 122;
			final int MIN_N = 1;
			final int MAX_N = 5;
			int n;
			char a = ' ';
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			do {
				System.out.println("Ingrese un caracter");
				a = entrada.readLine().charAt(0);
				if(a>=MIN_LOWERCASE && a<=MAX_LOWERCASE){
					System.out.println("Ingrese un numero.");
					n = Integer.valueOf(entrada.readLine());
					if (n>=MIN_N && n<=MAX_N) {
						for(int i=1;i<10;i++) {
							System.out.println(n+" * " + i + " = " + n*i);
						}
					}
				}
			}while(a>=MIN_LOWERCASE && a<=MAX_LOWERCASE);
			System.out.println("Fin del programa");
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
