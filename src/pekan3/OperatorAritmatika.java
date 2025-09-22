package pekan3;

import java.util.Scanner;

public class OperatorAritmatika {

	public static void main(String[] args) {
		int A1;
		int A2;
		int hasil;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Input Angka-1 : ");
		A1 = keyboard.nextInt();
		System.out.print("\nInput Angka-2 : ");
		A2 = keyboard.nextInt();
		keyboard.close();
		System.out.println ("\nOperator Penjumlahan");
		hasil = A1 + A2;
		System.out.println ("Hasil :  " + hasil);
		System.out.println ("\nOperator pengurangan");
		hasil = A1 - A2;
		System.out.println ("Hasil :  " + hasil);
		System.out.println ("\nOperator Perkalian");
		hasil = A1 * A2;
		System.out.println ("Hasil :  " + hasil);
		System.out.println ("\nOperator hasil bagi");
		hasil = A1 / A2;
		System.out.println ("Hasil :  " + hasil);
		System.out.println ("\nOperator Sisa Bagi");
		hasil = A1 % A2;
		System.out.println ("Hasil :  " + hasil);	}

}
