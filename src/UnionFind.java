public class UnionFind {
	private int[] array;
	private int[] sizes;
	
	public UnionFind(int size) {
		array = new int[size];
		sizes = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = -1;
			sizes[i] = 1;
		}
	}
	
	public int FIND(int curr) {
		int root = curr;
		while(array[root] != -1) {
			root = array[root];
		}
		/* if using path compression:  */
		int prevParent = curr;
		while(array[curr] != -1) {
			prevParent = array[curr];
			array[curr] = root;
			curr = prevParent;
		}
		
		return root;
	}
	
	public void UNION(int a, int b) {
		int root1 = FIND(a);
		int root2 = FIND(b);
		if(root1 != root2) {
			/* if using weighted union */
			if(sizes[root1] > sizes[root2]) {
				array[root2] = root1;
				sizes[root1] += sizes[root2];
			} else if(sizes[root2] > sizes[root1]){
				array[root1] = root2;
				sizes[root2] += sizes[root1];
			} else {
				if(root1 < root2) {
					array[root2] = root1;
					sizes[root1] += sizes[root2];
				} else if(root2 < root1){
					array[root1] = root2;
					sizes[root2] += sizes[root1];
				}
			}
		}
	}
	
	public String toString() {
		int [] covered = new int[array.length];
		String result = "";
		for(int i = 0; i < array.length; i++) {
			if(covered[i] == 0) {
				covered[i] = 1;
				int curr = i;
				while (array[curr] != -1) {
					result += curr + "->";
					curr = array[curr];
				}
				result += curr + "\n";
			}
		}
		
		return result;
	}
	
	public static void main(String args[]) {
		UnionFind test = new UnionFind(10);
		test.UNION(1, 5);
		System.out.println(test);
		test.UNION(3, 5);
		System.out.println(test);
		test.UNION(6, 5);
		System.out.println(test);
		test.UNION(9, 8);
		System.out.println(test);
		test.UNION(9, 1);
		System.out.println(test);
		test.UNION(5, 9);
		System.out.println(test);
	}
}
