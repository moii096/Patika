package newpackage;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
	  double a,  b ,c , pi;
	  pi=3.14;
	  System.out.println("Daierenin yaricapini giriniz ;");
	  a=input.nextDouble();
	  b= 2*a*pi;
      c=pi*a*a ;
      System.out.println("Daierenin cevresi  ;" + b );
      System.out.println("Daierenin alani  ;" + c );
	}

}
