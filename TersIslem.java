 public class TersIslem {

	static void word(String s) {
				
		System.out.println(s);
				
		char[] a = s.toCharArray(); 
		for (int i = a.length-1; i>=0; i--) 
        System.out.print(a[i]);
		
		}
	
	public static void main(String[] args) {
							
		word("HelloWorld");
    
		}

}