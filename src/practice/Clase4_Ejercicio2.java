//Hacer un programa que solicite la carga desde consola de
//un carácter y realice: imprima si es dígito, o letra minúscula, o
//es cualquier otro carácter. Si es letra minúscula indicar si es
//vocal o consonante.


package practice;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase4_Ejercicio2 {

	public static void main(String[] args) {
		try {
			char a;
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un caracter");
			a = entrada.readLine().charAt(0);
			if (a<=57 && a>=48 || a>=97 && a<=122) {
				if (a<=57 && a>=48) {
					System.out.println("Es un digito.");
				}
				if(a>=97 && a<=122) {
					System.out.println("El caracter es una letra minuscula.");
					if (a=='a' || a=='e' || a=='i' || a=='o' || a=='u') {
						System.out.println("Es una vocal.");
					}else{
						System.out.println("Es una consonante.");
					}
				}
			}else {
				System.out.println("No es un digito ni una letra minuscula.");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
