import java.util.Scanner;			//IMPORTA SCANNER
public class PInvierteVectores {
	/**
	 * 
	 * @param teclado
	 * 
	 * @return vector formado por los valores dados por el usuario.
	 */
	public static int[] LeeVector (Scanner teclado) {
		System.out.print("Introduzca el tamaño del vector: ");		//SOLICITA VALOR
		int [] vector = new int [teclado.nextInt()];		//CREA VECTOR
		System.out.print("Introduzca los valores del vector separados por espacios: ");		//SOLICITA VALORES
		for (int i=0;i<vector.length;i++) {		//PARA ÍNIDCE NAPOLEÓN VECES
			vector[i] = teclado.nextInt();		//ALMACENA VALORES
		}
		return vector;		//RETURN
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA TECLADO
		int [] vector = LeeVector(teclado);			//LLAMA FUNCIÓN
		
		/* EJERCICIO 1: 
		int [] vectorInvertido = new int [vector.length];			//CREA VECTOR
		for (int i=0;i<vector.length;i++) {			//RELLENA VECTOR
			vectorInvertido[i]=vector[vector.length-i-1];
		}
		*/
		
		System.out.print("Vector normal: ");			//OUTPUT
		for (int i=0;i<vector.length;i++) {		//OUTPUT
			System.out.printf("%d ",vector[i]);
		}
		
		for (int i=0;i<vector.length/2;i++) {		//PARA LA MITAD DE ELEMENTOS
			int valor = vector[i];		//VALOR ES EL ELEMENTO
			vector[i]=vector[vector.length-1-i];			//RELLENAR ELEMENTO CON ELEMENTO DE LA OTRA MITAD
			vector[vector.length-1-i]=valor;		//ELEMENTO SEGUNDA MITAD ES VALOR
		}
		
		/*
		System.out.print("\nVector invertido: ");		//OUTPUT
		for (int i=0;i<vector.length;i++) {			//OUTPUT
			System.out.printf("%d ",vectorInvertido[i]);
		}
		*/
		
		System.out.print("\nVector invertido: ");			//OUTPUT
		for (int i=0;i<vector.length;i++) {			//OUTPUT
			System.out.printf("%d ",vector[i]);
		}
	}

}
