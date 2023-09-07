
public class ExchangeVariableEx {

	public static void main(String[] args) {
		// Exchange Variable
		int a=1, b=2, c=3;
		System.out.println(a + "," + b + "," + c );
		System.out.print(a);System.out.print(b);System.out.print(c+"\n");

		int temp = a;
		a = c;
		c = temp;
		System.out.println(a + "," + b + "," + c );
		System.out.print(a);System.out.print(b);System.out.print(c+"\n");

		int A = 1, B = 2, C = 3, d = 4;
		System.out.println(A + "," + B + "," + C + "," + d);
		System.out.print(A);System.out.print(B);System.out.print(C);System.out.print(d+"\n");

		int temp_1 = A, temp_2 = B;
		A = d;
		B = C;
		C = temp_2;
		d = temp_1;
		System.out.println(A+","+B+","+C+","+d);
		System.out.print(A);System.out.print(B);System.out.print(C);System.out.print(d);


	}

}