//Escribir un programa que permita el ingreso de dos números enteros por
//teclado e imprima los resultados de comparar:
//_ el primero mayor al segundo.
//_ ambos son múltiplos de 2.
package practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Clase3_Ejercicio3 {
	
	public static void main(String[] args) {
		try {
			int a,b;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese el valor de a.");
			a=Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el valor de b.");
			b=Integer.valueOf(entrada.readLine());
			if (a>b) {
				System.out.println("A ("+a+") es mayor que B ("+b+").");
			}else if(a<b) {
				System.out.println("B ("+b+") es mayor que A ("+a+").");
			}else {
				System.out.println("A y B son iguales");
			}
			if (a%2==0 && b%2==0) {
				System.out.println("Ambos son multiplos de 2");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
