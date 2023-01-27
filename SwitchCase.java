package newpackage;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
	Scanner scan=new Scanner (System.in);
	
	double a,b ;
	int c;
	System.out.println("ilk sayiyi giriniz:");
	a=scan.nextDouble();
	
	System.out.println("ikinci sayiyi giriniz:");
    b=scan.nextDouble();
    
	System.out.println("Yapmak istediginiz islemi seciniz:");
	
	System.out.println("1:Toplama\n 2:Cikarma\n 3:Carpma\n 4:Bolme");
	
	c=scan.nextInt();
	
	switch (c) {
	case 1:
		System.out.println("Sayilarin toplami :" + ( a+b) );
		break;
	case 2:
		System.out.println("Sayilarin farki :" + (a - b ));
		
	break;
	case 3:
		System.out.println("Sayilarin carpimi : "  + ( a*b ));
	break;
	case 4 : 
		System.out.println("Sayilarin bolumu : " + ( a / b ));
		break;
	default :
		System.out.println("Bilinmeyen bir islem girdiniz");
	}
	
	}

}
