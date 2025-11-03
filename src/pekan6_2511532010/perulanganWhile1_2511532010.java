package pekan6_2511532010;
import java.util.Scanner;

public class perulanganWhile1_2511532010 {

	public static void main(String[] args) {
		int counter = 0;
		String jawab;
		boolean running = true;
		//deklaeasi scanner
		Scanner scan = new Scanner (System.in);
		while (running) {
			counter ++;
			System.out.println ("Jumlah = " + counter);
			System.out.print("Apakah lanjut (ya/tidak) : ");
			jawab = scan.nextLine();
			//cek jawaban, tidak= perulangan berhenti
			if (jawab.equalsIgnoreCase("tidak")) {
				running=false;
		scan.close();
			}
		}
System.out.println ("Anda sudah melakukan perulangan sebnayak "+counter+" kali");
	}

}
