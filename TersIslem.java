  
import java.util.Scanner;

public class TersIslem {

	static void kelime () {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kelime Giriniz: ");
		String kelime = scanner.nextLine();
		
		char[] a = kelime.toCharArray(); 
		  
        for (int i = a.length-1; i>=0; i--) 
                 
		System.out.print(a[i]);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					
		kelime();

              
	}

}