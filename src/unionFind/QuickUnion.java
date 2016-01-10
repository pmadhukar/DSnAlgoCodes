/*
 * Union-Find
 * Quick Union (Lazy approach)
 */
package unionFind;

public class QuickUnion {
	private int[] id;
	private final int SIZE_ID = 10;

	public QuickUnion(){
		id = new int[SIZE_ID];

		for(int i=0; i<SIZE_ID; i++){
			id[i] = i;
		}
	}

	/*
	 * My implementation of root() : recursive

	public int root(int p){
		if( p == id[p] ) return p;
		return root( id[p] );
	}
	*/

	//Sedgewick's implementation : iterative
	public int root(int p){
		int i = id[p];
		while( i != id[i] ) i=id[i];
		return i;
	}
	public boolean find(int p, int q){
		return root(p) == root(q);
	}

	public void union(int p, int q){
		int rootP = root(p);
		int rootQ = root(q);
		id[rootP] = rootQ;

		System.out.println("\n\nAfter union("+p+", "+q+")\n");
		displayId();
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
		QuickUnion qu = new QuickUnion();

		qu.displayId();

		qu.union(4, 3);
		qu.union(3, 8);
		qu.union(6, 5);
		qu.union(9, 4);

		qu.union(2, 1);

		System.out.print("\n\n8 and 9 are connected? : ");
		System.out.println(qu.find(8, 9));

		System.out.print("\n5 and 4 are connected? :");
		System.out.println(qu.find(5, 4));

		qu.union(5, 0);
		qu.union(7, 2);
		qu.union(6, 1);
		qu.union(7, 3);
	}

}
