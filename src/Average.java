import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();

		int[] b = new int[n];

		for(int i=0; i<n; i++){
			b[i] = in.nextInt();
		}


		int[] a = new int[n];
		int[] sum = new int[n];
		a[0] = b[0];
		sum[0] = b[0];

		int pos=2;
		for(int i=1; i<n; i++){
			a[i] = (pos * b[i]) - sum[i-1];
			sum[i] = sum[i-1] + a[i];
			pos++;
		}


		for(int i=0; i<n; i++){
			System.out.print(a[i] + " ");
		}

		in.close();
	}

}
