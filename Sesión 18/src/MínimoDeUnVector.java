import java.util.Scanner;
public class M�nimoDeUnVector {
	/**
	 * 
	 * @param teclado
	 * 
	 * @return vector formado por los valores dados por el usuario.
	 */
	public static int[] LeeVector (Scanner teclado) {
		System.out.print("Introduzca el tama�o del vector: ");
		int [] vector = new int [teclado.nextInt()];		//CREA VECTOR
		System.out.print("Introduzca los valores del vector separados por espacios: ");		//SOLICITA VALORES
		for (int i=0;i<vector.length;i++) {		//PARA �NIDCE NAPOLE�N VECES
			vector[i] = teclado.nextInt();		//ALMACENA VALORES
		}
		return vector;		//RETURN
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);		//CREA SCANNER
		int [] vector = LeeVector(teclado);		//LLAMA SUBRUTINA
		int min = vector [0];		//M�NIMO
		for (int i=1;i<vector.length;i++) {			//PARA TANTAS VECES COMO ELEMENTOS EN EL VECTOR
			if (vector[i]<min) {		//SI ELEMENTO ES MENOR AL MAS PEQUE�O
				min = vector[i];		//ACTUALIZAR MENOR
			}
		}
		System.out.printf("M�nimo: %d", min);		//OUTPUT
		
		
	}

}
