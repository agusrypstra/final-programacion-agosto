package practice;

public class Clase_8_Ejercicio_2 {

	public static void main(String[] args) {
		int matriz[][] = {{1,2,3,5,4,6,4,6,5,7},
		 				{4,8,6,3,1,2,3,1,2,4},
		 				{4,8,6,3,1,2,3,1,2,4},
		 				{4,8,6,3,1,2,3,1,2,4},
		 				{4,8,6,3,1,2,3,1,2,4}};
		int pares = calcularPares(matriz);
		imprimirPares(pares);
	}
	static int calcularPares(int matriz[][]) {
		int contadorPares=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				if(matriz[i][j]%2==0) {
					contadorPares++;
				}
			}
		}
		return contadorPares;
	}
	static void imprimirPares(int pares) {
		System.out.println("La matriz tiene un total de "+pares);
	}
}