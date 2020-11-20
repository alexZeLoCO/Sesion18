import java.util.Scanner;
public class PComponentesMayor {
	/**
	 * 
	 * @param teclado
	 * 
	 * @return vector formado por los valores dados por el usuario.
	 */
	public static double[] LeeVector (Scanner teclado) {
		System.out.print("Introduzca el tamaño del vector: ");
		double [] vector = new double [teclado.nextInt()];		//CREA VECTOR
		System.out.print("Introduzca los valores del vector separados por espacios: ");		//SOLICITA VALORES
		for (int i=0;i<vector.length;i++) {		//PARA ÍNIDCE NAPOLEÓN VECES
			vector[i] = teclado.nextDouble();		//ALMACENA VALORES
		}
		return vector;		//RETURN
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		double [] vector = LeeVector(teclado);
		int suma = 0;
		System.out.print("Introduzca el valor a comparar: ");
		double valor = teclado.nextInt();
		for (int i=0;i<vector.length;i++) {		//PARA ÍNIDCE NAPOLEÓN VECES
			if (vector[i] > valor) {		//ALMACENA VALORES
				suma++;
			}
		}
		
		System.out.printf("Componentes mayores: %d.",suma);

	}

}
