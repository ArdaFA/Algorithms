public class Merge_Sort {

	// create an Array
	public static int[] array = {12, 34, 45, 56, 53, 42, 2, 87, 67 };
	
	// create the method for sort
	public static int[] sort(int a, int b) {
		if (a < b) {
            int q = (a + b) / 2;
            sort(a, q);
            sort(q + 1, b);
            merge(a, q, b);
		}
		return array;
	}
	
	// create the method for the merge
	private static void merge(int a, int q, int b) {
		int[] arr = new int[array.length];
        int i, j;
        
        for (i = a; i <= q; i++) {
            arr[i] = array[i];
        }
        
        for (j = q+1; j <= b; j++) {
        	arr[b + q + 1 - j] = array[j];     
        	}
        
        i = a;
        j = b;
        for (int k = a; k <= b; k++) {
            if (arr[i] <= arr[j]) {
                array[k] = arr[i];
                i++;
            } else {
                array[k] = arr[j];
                j--;
            }
        }
    }
	
	public static void main(String[] args) {
        int[] arr = sort(0, array.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ": " + arr[i]);
        }
    }
}
