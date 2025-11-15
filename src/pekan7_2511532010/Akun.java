package pekan7_2511532010;

public class Akun {
	private String username, password, email;
	private int pinAngka;
	
	public void setusername (String username) {this.username = username;}
	public void setpassword (String password) {this.password = password;}
	public void setemail (String email) {this.email = email;}
	public void setpinAngka (int pinAngka) {this.pinAngka = pinAngka;}
	public String getusername () {return username;}
	public String getpassword () {return password;}
	public String getemail () {return email;}
	public int getpinAngka () {return pinAngka;}
	public static boolean isPasswordValid (String password) 
	{return password.length() >= 8;}
	public static boolean isEmailValid (String email) 
	{return email.contains("@") && email.contains(".");}}
