package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;

public class Clase_7_Ejercicio_7 {

	public static void main(String[] args) {
		int[] arreglo = {5,12,13,5,23,3,1,9,6};
		int n = ingresarN();
		ingresar_n_al_arreglo(arreglo,n);
	}
	static void ordenar_array_burbuja(int[] arreglo) {
		int temp;
		for(int i=1;i<arreglo.length-1;i++) {
			for(int j=0;j<arreglo.length-1;j++) {
				if(arreglo[j]>arreglo[j+1]) {
					temp=arreglo[j];
					arreglo[j]=arreglo[j+1];
					arreglo[j+1]= temp;
				}
			}
		}
	}
	static void ingresar_n_al_arreglo(int arreglo[],int n) {
		for (int i = arreglo.length-2; i >= 0; i--) {
			arreglo[i+1] = arreglo[i];
		}
		arreglo[0]=n;
		ordenar_array_burbuja(arreglo);
		imprimir_arreglo(arreglo);
	}
	static void imprimir_arreglo(int[] arreglo) {
		for (int i = 0; i < arreglo.length; i++) {
			System.out.print(arreglo[i]+ " - ");
		}
	}
	static int ingresarN() {
		int n=0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero");
			n = Integer.valueOf(entrada.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		return n-1;
	}
	}