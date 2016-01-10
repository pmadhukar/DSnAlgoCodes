import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiSol {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int counter=0; counter<t; counter++){
			long a = in.nextLong();
			long b = in.nextLong();
			long c = b;
			List<Long> powers = new ArrayList<Long>();

			int val = 0;
			String result = "";
			String temp = "";
			int pos=1;
			int index=0;
			while(c != 0){
				val = (int)(c&1);
				//powers.add((val));
				if(val == 0){
					continue;
				}
				if(val == 1){

					temp = ("(" + a + "<<" + index + ")");
					result += temp;

					if(pos > 1){
						result += " + ";
					}

					pos++;

				}
				c = c >> 1;
				index++;
				pos++;


			}


			/*
			System.out.println("size: " + powers.size());
			System.out.println("powers array: ");
			for(int i=0; i<powers.size(); i++){
				System.out.print(powers.get(i) + " ");
			}
			System.out.println();
			*/
			/*
			String result = "";
			String temp = "";
			int pos=1;
			for(int i=powers.size()-1; i>=0; i-- ){
				if(powers.get(i) == 0){
					continue;
				}

				if(powers.get(i) == 1){
					if(pos > 1){
						result += " + ";
					}
					temp = ("(" + a + "<<" + i + ")");
					result += temp;
					pos++;
				}
			}
			*/
			System.out.println(result);
		}

	}

}