package newpackage;

import java.util.Scanner;

public class Scannn {

	public static void main(String[] args) {
		
		int a,b,c;
		double d ;
		Scanner input=new Scanner(System.in);
		System.out.print("vize notunu giriniz :");
		a=input.nextInt();
		System.out.print("Quiz notunu giriniz :");
		b=input.nextInt();
		System.out.print("final notunu giriniz :");
		c = input.nextInt(); 
		 d = (a*0.3)+(b*0.2)+(c*0.5) ;
		System.out.println("Ortalama :" + d  );
		if(d>=50) {
			System.out.println("Gectiniz");
		}
		else {
			System.out.print("kaldiniz");
		}
	}

}
