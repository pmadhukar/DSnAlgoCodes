/*
 * For algorithms course by Robert Sedgewick (on Coursera)
 * Code for quick-find
 * First Version
 */

package unionFind;

public class QuickFind {
	private int[] id;
	private final int DEFAULT_SIZE = 10;

	public QuickFind(){
		id = new int[DEFAULT_SIZE];
		for(int i=0; i<DEFAULT_SIZE; i++){
			id[i] = i;
		}
	}

	public boolean find(int p, int q){
		return id[p] == id[q];
	}

	public void union(int p, int q){
		if( !find(p,q) ){
			int pid = id[p];
			int qid = id[q];
			int sizeId = id.length;

			for(int i=0; i<sizeId; i++){

				/*
				 * possibility of error here:
				 * instead of checking id[i] == pid, if we check id[i] == id[p] it will give wrong answers.
				 * coz id[p] will also change to qid at some point of time and then the condition will stop
				 * changing ids which are equal to pid, to qid
				 * essentially the condition will then become if(id[i]==qid) id[i]=qid;
				 */
				if( id[i] == pid ) id[i] = qid;
			}


			System.out.println("\n\nAfter union("+p+", "+q+")\n");
			displayId();
		}
		else{
			System.out.println("\n\nAlready connected");
		}

	}

	public void displayId(){
		int sizeId = id.length;

		System.out.println("0 || 1 || 2 || 3 || 4 || 5 || 6 || 7 || 8 || 9 ||");
		System.out.println("======================================================");

		for(int i=0; i<sizeId; i++){
			System.out.print(id[i] + " || ");
		}
	}

	public static void main(String[] args) {
		QuickFind qf = new QuickFind();
		qf.displayId();

		qf.union(4, 3);
		qf.union(3, 8);
		qf.union(6, 5);
		qf.union(9, 4);
		qf.union(2, 1);
		qf.union(8, 9);
		qf.union(5, 0);
		qf.union(7, 2);
		qf.union(6, 1);
	}

}
