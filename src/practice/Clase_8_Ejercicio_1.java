/*
Hacer un programa que dado una matriz de enteros de tamaño 5*10 que se encuentra
precargada, invierta el orden del contenido por fila. Este intercambio no se debe realizar
de manera explícita, hay que hacer un método que incluya una iteración de intercambio.
*/

package practice;

public class Clase_8_Ejercicio_1 {
	public static void main(String[] args) {
		int matriz[][] = {{1,2,3,5,4,6,4,6,5,7},
				 		{4,8,6,3,1,2,3,1,2,4},
				 		{4,8,6,3,1,2,3,1,2,4},
				 		{4,8,6,3,1,2,3,1,2,4},
				 		{4,8,6,3,1,2,3,1,2,4}};
		int matrizAux[][]= new int[5][10];
		invertirFilas(matriz,matrizAux);
		}
	static void invertirFilas(int matriz[][],int matrizAux[][]) {
		for(int i=0;i<5;i++) {
			for(int j=0,k=10-1;j<k;j++,k--) {
				matrizAux[i][j] = matriz[i][k];
				matrizAux[i][k] = matriz[i][j];
			}
		}
		imprimirMatriz(matrizAux);
	}
	public static void imprimirMatriz(int matriz[][]) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}
	}
