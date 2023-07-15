package practice;

import java.util.Iterator;

public class Clase_7_Ejercicio_1 {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6,7,8,9};
		int aux[]=new int[array.length];
		
		for(int i=array.length-1, j=0;i>=j;i--,j++) {
			aux[i]=array[j];
			aux[j]=array[i];
		}
		for(int i=0;i<aux.length;i++) {
			System.out.println(aux[i]);
		}
	}

}
