package newpackage;

public class Recursive {

	static int f(int x) {
		int toplam =0 ;
		for (int i =1 ; i<=x ;i++) {
			
		}return toplam;
	}
	static int r(int x) {
		if(x==1) {
			return 1;
			
		}return x+r(x-1);
	}
	public static void main(String[] args) {
		System.out.println(r(5));

	}

}
