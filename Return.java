
public class Return {

	public static double dreifach(double a) {
		return a * 3;
	}

	public static double zwanzigprozentaddieren(double a) {
		return a + ((a * 20) / 100);

	}

	public static double dividieren(double a) {
		return a / 5;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Returnün amaci cikan sonucu bir sonraki fonksiyonun icinde kullilabilmesidir.
		System.out.println("Total: " + dividieren(zwanzigprozentaddieren(dreifach(10))));

	}

}
