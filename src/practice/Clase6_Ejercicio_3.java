package practice;
/*Escribir un programa que mientras el usuario cargue desde
teclado un caracter letra minúscula, llame a un método
que imprime por pantalla la tabla de multiplicar de 9.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Clase6_Ejercicio_3 {

	public static void main(String[] args) {
		final int MIN_LOWERCASE = 97;
		final int MAX_LOWERCASE = 122;
		boolean comprobar;
		do{
			char a = ingresarCaracter();
			comprobar = comprobarCaracter(a,MIN_LOWERCASE,MAX_LOWERCASE);
			if(comprobar) {
				imprimirTablaDel9();
			}else {
				finDelPrograma();
			}
		}while(comprobar);
	}
	public static char ingresarCaracter() {
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			char a;
			System.out.println("Ingresar caracter");
			a = entrada.readLine().charAt(0);
			return a;
		} catch (Exception e) {
			System.out.println(e);
			return ' ';
			}
	}
	public static boolean comprobarCaracter(char a,int min,int max) {
		return (a>=min && a<=max);
	}
	public static void imprimirTablaDel9() {
		for(int i=1;i<10;i++)
		{
			System.out.println("9 " + " * " + i + " = " + i*9);
		}
	}
	public static void finDelPrograma() {
		System.out.println("Fin del programa.");
	}
}