/*
 Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, solicite al usuario una posición fila, columna y realice un corrimiento a
izquierda.
 */
package practice;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Clase_8_Ejercicio_5 {
	public static void main(String[] args) {
		int matriz[][] = {{1,2,3,5,4,6,4,6,5,7},
						{4,8,6,3,1,2,3,1,2,4},
						{4,8,6,3,1,2,3,1,2,4},
						{4,8,6,3,1,2,3,1,2,4},
						{4,8,6,3,1,2,3,1,2,4}};
		int n = ingresarN();
		buscarCoincidendia(matriz, n);
	}
	static void buscarCoincidendia(int matriz[][],int n) {
		try {
			for(int i=0;i<5;i++) {
				for(int j=0;j<10;j++) {
					if(matriz[i][j]==n) {
						int[][] nuevaMatriz = new int [5][10];
						nuevaMatriz = corrimientoIzquierda(matriz, i, j);
						imprimirMatriz(nuevaMatriz);
						return;
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	static int[][] corrimientoIzquierda(int matriz[][],int fil,int col) {
			int aux = matriz[fil][0];
			try {
				for(int i = 0;i<col;i++) {
					matriz[fil][i] = matriz[fil][i+1];
				}
				matriz[fil][col] = aux;
				imprimirMatriz(matriz);
			} catch (Exception e) {
				System.out.println(e);
			}
			return matriz;
		}
	static void imprimirMatriz(int matriz[][]) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}
	static int ingresarN() {
		int n=0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero.");
			n = Integer.valueOf(entrada.readLine());
		} catch (Exception e) {
			System.out.println(e);
		}
		return n-1;
	}
}