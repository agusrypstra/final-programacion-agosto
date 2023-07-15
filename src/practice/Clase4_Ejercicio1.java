//Hacer un programa que solicite la carga desde consola de un numero entero y realice:
//_si el numero es positivo, imprima “grande” si es mayor a 100 o “chico “ si
//es menor. Además deberá imprimir que el valor es positivo.
//_si no lo es, imprima si el numero es par, o si el numero es múltiplo de 3, o
//ninguna de las opciones anteriores.

package practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase4_Ejercicio1 {
	public static void main(String[] args) {
		try {
			int n;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero");
			n=Integer.valueOf(entrada.readLine());
			if (n>0) {
				if (n>=100) {
					System.out.println("Grande");
				}else {
					System.out.println("Chico");
				}
				System.out.println("positivo");
			}else{
				if (n%3==0 || n%2==0) {
					if(n%2==0) {
						System.out.println("Es par");
					}
					if (n%3==0) {
						System.out.println("Es multiplo de 3");
					}					
				}else {
					System.out.println("No es ni par ni multiplo de 3");
				}
			}	
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
