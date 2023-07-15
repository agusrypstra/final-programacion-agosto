package practice;

public class Clase_7_Ejercicio_2 {

	public static void main(String[] args) {
		int array[] = {2,2,2,4,2,6,7,8,9};
		int contador=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				contador++;
			}
		}
		System.out.println("El array contiene " + contador + " numeros pares.");
	}
}