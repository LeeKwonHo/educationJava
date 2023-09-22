package forwhileeducation;

public class NumEx {

	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		
		for(; a <= 100; a++ ) {
			if(( a % 2 ) == 0) {
				b += a;
			}
		}
		System.out.println("1~100까지의 합은: " + b);
	}

}
