package practice;
import java.io.InputStreamReader;
import java.io.BufferedReader;
// 		Escribir un programa que permita el ingreso de un número entero por
//	teclado e imprima el cociente de la división de dicho número con el
//	número 2, luego con el número 3, y finalmente con el número 4.
public class Clase3_Ejercicio1 {

	public static void main(String[] args) {

		try {
			double n;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero.");
			n=Integer.valueOf(entrada.readLine());
			System.out.println("N / 2 ="+n/2);
			System.out.println("N / 3 ="+n/3);
			System.out.println("N / 4 ="+n/4);
		} catch (Exception e) {
			System.out.println(e);
		}
		}

}


