import java.util.Scanner;
public class Ejercicio3{
	public static void main(String[] args) {
		Scanner amor = new Scanner(System.in);

		double pagoFijo, cantMin;
		int cantMsj;
		double pagoMin, pagoMjs, descuento, total, totalLPS;

		System.out.println("Ingrese los datos en el orden [pagoFijo cantMinutos cantMsj]: ");
		pagoFijo = amor.nextDouble();
		cantMin = amor.nextDouble();
		cantMsj = amor.nextInt();

		pagoMin = cantMin*1.2;
		pagoMjs = cantMsj*0.4;
		total = pagoMin+pagoMjs+pagoFijo;
		totalLPS = total*20.4;

		System.out.println("Pago por Minuto Consumido: "+pagoMin);
		System.out.println("Pago por Mensaje Consumido: "+pagoMjs);
		System.out.println("Total a Pagar: "+total);
		System.out.println("Total en Lempiras: "+totalLPS);
	}
}