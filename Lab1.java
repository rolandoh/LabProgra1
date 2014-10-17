import java.util.Scanner;
public class Lab1{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double horas, pago, subtotal, rap, total;
		System.out.print("Ingrese las horas trabajadas en el mes: ");
		horas = scan.nextDouble();
		System.out.print("Ingrese el pago por hora trabajada: ");
		pago = scan.nextDouble();
		subtotal = horas*pago;
		rap = subtotal*0.035;
		total = subtotal - rap;
		System.out.println("Subtotal: "+subtotal);
		System.out.println("Rap: "+rap);
		System.out.print("Total de pago: "+total);

	}
}