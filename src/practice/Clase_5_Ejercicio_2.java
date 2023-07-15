/*Escribir un programa que mientras el usuario ingresa un caracter distinto
del caracter ‘*’, muestre por pantalla si es caracter digito, o si es caracter
vocal minúscula.*/
package practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase_5_Ejercicio_2 {

	public static void main(String[] args) {
		try {
			char a=' ';
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			do {
				System.out.println("Ingrese un caracter.");
				a = entrada.readLine().charAt(0);
				if(a>=48 && a<=57) {
					System.out.println("El caracter ingresado es un entero.");
				}
				if(a=='a' ||a=='e' ||a=='i' ||a=='o' ||a=='u' ) {
					System.out.println("El caracter ingresado es una vocal minuscula");
				}
			}while(a!='*');
			System.out.println("Fin del programa.");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
