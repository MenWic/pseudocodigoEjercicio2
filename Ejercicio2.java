import java.util.*;

public class Ejercicio2 {

	public static void main(String args[]) {
		//Variables globales del algoritmo
		int contador;
		int n;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el Primer número: ");
		n = scanner.nextInt();
		contador = 0;
		
		for (contador=1;contador<=n-1;contador++) {
			System.out.println("Los números comprendidos entre "+n+" y 1 "+"son: "+contador);
		}
		System.out.println("Números totales comprendidos: "+(n-1)+".");
	}
}
