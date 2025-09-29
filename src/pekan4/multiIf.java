package pekan4;
import java.util.Scanner;

public class multiIf {

	public static void main(String[] args) {
		int umur;
		char sim;
		Scanner a = new Scanner (System.in);
		System.out.print( "Input nilai anda");
		umur = a.nextInt ();
		System.out.print ("Apakah anda sudah punya Sim C :");
		sim=a.next (). charAt (0);
		a.close ();
		if ((umur >= 17)&&(sim=='y')) {
			System.out.print("Anda Sudah dewasa dan boleh bawa motor");
		}
		if ((umur >= 17) && (sim!='y')) {
			System.out.print ("Anda Sudah Dewasa tetapi belum boleh bawa motor");
		} 
		if ((umur < 17)&& (sim != 'y')) {
			System.out.print("Anda Belum Cukup Umur bawa motor");
		}
		if ((umur < 17)&& (sim == 'y')) {
			System.out.print("Anda Belum Cukup Umur punya SIM");
		}
	}

}
