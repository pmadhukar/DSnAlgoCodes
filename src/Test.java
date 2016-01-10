import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] sum = new int[n];

		for(int i=0; i<n; i++){
			a[i] = in.nextInt();
		}

		int pos=2;
		b[0] = a[0];
		sum[0] = a[0];

		for(int i=1; i<n; i++){
			sum[i] = sum[i-1] + a[i];
			b[i] = sum[i]/pos;
			pos++;
		}

		for(int i=0; i<n; i++){
			System.out.print(b[i] + " ");
		}
	}

}
