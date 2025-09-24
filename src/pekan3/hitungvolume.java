package pekan3;
import java.util.Scanner;
public class hitungvolume {

	public static void main(String[] args) {
		final double PI = 3.14;
		double r;
		double t;
		double hasil;
		
		System.out.println ("PROGRAM MENGHITUNG VOLUME TABUNG");
		
		Scanner keyboard = new Scanner (System.in);
		System.out.print ("\nInput jari-jari tabung : ");
		r = keyboard.nextDouble();
		System.out.print ("Input tinggi tabung    : ");
		t = keyboard.nextDouble();
		keyboard.close();
		hasil = PI * r * r * t;
		System.out.println ("Volume tabung          : " + hasil);
		System.out.println ("\n         TERIMA KASIH           ");
		}

}
