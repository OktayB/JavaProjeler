import java.util.Scanner;

public class ZinsBerechnung {

	public static double daily(double amount, int day) {

		return amount = ((amount * day * 0.2) / 36000);
	}

	public static double annual(double amount, int year) {

		return amount = ((amount * year * 6) / 100);

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String Options = "1.Calculation : Daily Interest\n" + "2.Calculation : Annual\n" + "Exit = q";

		System.out.println("*************************");
		System.out.println(Options);
		System.out.println("*************************");

		while (true) {

			System.out.print("Choose Interest Calculation: ");
			String Option = scanner.nextLine();

			if (Option.equals("q")) {

				System.out.println("Exit...");
				break;
			}

			else if (Option.equals("1")) {
				System.out.println("Our daily interest is 0,20% ");

				System.out.println("How much do you want to save? ");
				int amount = scanner.nextInt();

				System.out.println("How many days do you want to save your money? ");
				int day = scanner.nextInt();

				System.out.println("Your total Interest income is: " + (int) daily(amount, day) + " Euro");
				break;
			}

			else if (Option.equals("2")) {
				System.out.println("Our annual interest is 6%.. ");

				System.out.println("How much do you want to save? ");
				int amount = scanner.nextInt();

				System.out.println("How long do you want to save your money? ");
				int year = scanner.nextInt();

				System.out.println("Your total Interest income is: " + (int) annual(amount, year) + " Euro");
				break;
			}

			else {
				System.out.println("Please choose the right transaction");
			}
		}
	}
}
