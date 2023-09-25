package forwhileeducation;

public class ForStars {

	public static void main(String[] args) {
		String star = "*";
		int m, n;
		int i,j;
		
		for(m = 1; m <= 5; m++) {
			for(n = 0; n<m; n++) {
				System.out.print(star);
			}
			System.out.println("");
		}
		
		for(i = 2; i <= 9; i++) {
			System.out.print(i+ "단");
			for(j = 1; j <= 9; j++) {
				System.out.println(i + "X" + j + "=" + (i*j));
			}
		}
		for(int num = 1; num <=10; num++) {
			for(int mun = 0; mun < num; mun++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	

}
