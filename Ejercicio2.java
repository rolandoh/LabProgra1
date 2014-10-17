import java.util.Scanner;
public class Ejercicio2{
	public static void main(String[] args) {
		Scanner amor = new Scanner(System.in);

		String nombre;
		double notaP1, notaP2, notaP3, notaFinal;
		double pagosFijos;

		System.out.print("Ingrese su nombre sin espacios en blanco: ");
		nombre = amor.next();

		System.out.print("Ingrese las tres notas separadas por espacio: ");
		notaP1 = amor.nextDouble();
		notaP2 = amor.nextDouble();
		notaP3 = amor.nextDouble();

		notaFinal = (notaP1+notaP2+notaP3)/3;
		System.out.println("Nota Final: "+notaFinal);
	}
}