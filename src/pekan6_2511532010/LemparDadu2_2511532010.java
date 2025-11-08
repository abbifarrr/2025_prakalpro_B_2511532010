package pekan6_2511532010;
import java.util.Scanner;
import java.util.Random;

public class LemparDadu2_2511532010 {

	public static void main(String[] args) {
		//DEKLARASI FUNGSI
        Random rand = new Random();
        Scanner keyboard = new Scanner (System.in);

        //DEKLARASI VARIABEL
        int tries = 0;
        int sum = 0;
        String jawab = "ya";
        boolean running = true;
            
            while (sum != 7 && jawab.equalsIgnoreCase("ya")) {
            int dadu1 = rand.nextInt(6) +1;
			int dadu2 = rand.nextInt(6) + 1;
			sum= dadu1+dadu2;
			tries++;
			System.out.println (dadu1 + " + " + dadu2 + " = " +sum);

            if (sum != 7) {
                System.out.println ("Tebakan Anda Salah");
                System.out.print ("Apakah Mau Lempar Dadu (ya / tidak) : ");
                jawab = keyboard.nextLine();
                if (jawab.equalsIgnoreCase("tidak")) {
				running=false;
		        keyboard.close();
                System.out.println("Anda Gagal Menang");}
                
            }else {
            	System.out.println ("Tebakan Anda Benar");
                System.out.println ("Anda Menang Setelah " + tries + " percobaan");}}} }
