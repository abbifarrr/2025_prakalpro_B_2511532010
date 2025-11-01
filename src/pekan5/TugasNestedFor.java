package pekan5;

public class TugasNestedFor {
 
	public static void main(String[] args) {
		for (int i = 1; i<= 1; i++) {
			for (int j = 1; j<=1; j++) {System.out.print("#");}
			for (int j =2; j<=17;j++) {System.out.print("=");}
			System.out.println ("#");}
		
		for (int i = 1; i <= 4; i++) {System.out.print("|");
			for (int j = 0; j < (8 - 2 * i); j++) {System.out.print(" ");}
            System.out.print("<>");
            for (int k = 0; k < (2 * i - 2); k++) {System.out.print("..");}
            System.out.print("<>");
            for (int j = 0; j < (8 - 2 * i); j++) {System.out.print(" ");}
            System.out.println("|");}
		
		for (int i = 4; i >= 1; i--) {System.out.print("|");
            for (int j = 0; j < (8 - 2 * i); j++) {System.out.print(" ");}
            System.out.print("<>");
            for (int k = 0; k < (2 * i - 2); k++) {System.out.print("..");}
            System.out.print("<>");
            for (int j = 0; j < (8 - 2 * i); j++) {System.out.print(" ");}
            System.out.println("|");}
		
		for (int i = 1; i<= 1; i++) {
			for (int j = 1; j<=1; j++) {System.out.print("#");}
			for (int j =2; j<=17;j++) {System.out.print("=");}
			System.out.println ("#");}}}
