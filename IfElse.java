package newpackage;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner cek =new Scanner(System.in);
		int a , b  ;
	    System.out.println("Bir sayi giriniz");
	    a = cek.nextInt();
	    System.out.println("Bir sayi daha giriniz");
	    b = cek.nextInt();
	   int c= a+b ;
	    if(c>100) {
	    	System.out.println("toplam 100den buyuktur");
	 }
	    else {
	    	System.out.println("Sonuc 100den buyuk degildir");
	    }
	}

}
