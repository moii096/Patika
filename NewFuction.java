package newpackage;

public class NewFuction {
	public static void main(String[] args) {
		f(5);
		f(30);
		power(5,6);
	}
	static void f(int x) {
		 int result=(x+2)*6;
		 System.out.println(result);
	}
	static void power(int n1 , int n2) {
		int result=1 ;
		for (int i =1 ; i<=n2 ; i++) {
			result*=n1 ;
		}System.out.println("Result is :"  +result );
	}
}
