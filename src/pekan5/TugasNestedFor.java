package pekan5;

public class TugasNestedFor {

	public static void main(String[] args) {
		
		int a = 5;
				
		for (int i = 1; i <= a; i++) {
			
			for (int j = a - i; j > 0; j--) { 
				System.out.print(".");
			}
			
			System.out.print(i);
			
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		} 
	}
}


