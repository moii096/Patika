package newpackage;

import java.util.Scanner;

public class Tahmin {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a;
		System.out.print("Hava sicakligini giriniz :");
		a=scan.nextInt();
		if(a>=25) {
			System.out.print("Yuzme ");
		}
		else if ( a>15 && a<25){
			System.out.print("piknik");
			
		} else if (a<=15 && a>= 5) {
			System.out.print("sinema");
			
		}
		else  	{
			System.out.print("kayak");
		}
	}
}

