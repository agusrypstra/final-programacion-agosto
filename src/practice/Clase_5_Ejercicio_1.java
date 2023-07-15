/*
Escribir un programa que mientras el usuario ingrese un número entero
menor que 10 y mayor a 1, muestre por pantalla si el número es múltiplo de
2 y múltiplo de 3 simultáneamente. (¿Los valores mencionados en el
enunciado deberían ser constantes?. De a poco habría que definirlos
como constantes).
*/

package practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase_5_Ejercicio_1 {

	public static void main(String[] args) {
	try {
		final int max = 10;
		final int min = 1;
		int n;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		do{
			System.out.println("Ingrese un numero entero");
			n = Integer.valueOf(entrada.readLine());
			if (n%2==0 && n%3==0) {
				System.out.println(n+" es multiplo de 2 y de 3.");
			}
		 }	while(n>min && n<max);
		 System.out.println("Se finalizo el programa ya que el valor ingresado no esta entre los parametros.");
	} catch (Exception e) {
		System.out.println(e);
	}
	}

}
