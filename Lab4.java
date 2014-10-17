import java.util.Scanner;
public class Lab4{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double cantidad, llevar, subtotal, recargo, impuesto, total;
		System.out.print("Ingrese la cantidad de baleadas: ");
		cantidad = scan.nextDouble();
		System.out.print("Ingrese si la quiere para llevar(0 comer alli, 1 para llevar): ");
		llevar = scan.nextDouble();
		subtotal = cantidad*20;
		recargo = cantidad*llevar*0.5;
		impuesto = subtotal*0.15;
		total = subtotal+recargo+impuesto;
		System.out.println("Subtotal: "+subtotal);
		System.out.println("Recargo: "+recargo);
		System.out.println("Impuesto: "+impuesto);
		System.out.print("Total: "+total);
	}
}