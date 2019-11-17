import java.util.Scanner;

public class TersIslem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Kelime Giriniz: ");
		
		String kelime = scanner.nextLine();
		
		//System.out.println(kelime.toUpperCase());
		
		char[] a = kelime.toCharArray(); 
		  
        for (int i = a.length-1; i>=0; i--) 
            System.out.print(a[i]);

	}

}
