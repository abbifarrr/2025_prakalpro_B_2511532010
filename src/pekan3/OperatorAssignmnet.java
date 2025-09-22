package pekan3;

import java.util.Scanner;

public class OperatorAssignmnet {

	public static void main(String[] args) {
		int A1;
		int A2;
		Scanner keyboard = new Scanner (System.in);
		System.out.print ("Input Angka-1 :   ");
		A1 = keyboard.nextInt();
		System.out.print ("\ninput Angka-2 : ");
		A2 = keyboard.nextInt();
		keyboard.close();
		System.out.println ("\nAssignment Penambahan");
		A1 += A2;
		System.out.println ("Penambahan :  " + A1);
		System.out.println ("\nAssignment Pengurangan");
		A1 -= A2;
		System.out.println ("Pengurangan : " + A1);
		System.out.println ("\nAssignment Perkalian");
		A1 *= A2;
		System.out.println ("perkalian :   " + A1);
		System.out.println ("\nAssignment Hasil Bagi");
		A1 /= A2;
		System.out.println ("pembagian :   " + A1);
		System.out.println ("\nAssignment Sisa Bagi");
		A1 %= A2;
		System.out.println ("Sisa Bagi :   " + A1);
		

	}

}
