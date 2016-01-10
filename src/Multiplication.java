import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		int result = 0;

		while(b != 0){
			if( (b & 01) == 1){
				result = result + a;
			}
			a = a << 1;
			b = b >> 1;
		}
		System.out.println(result);
	}

}
