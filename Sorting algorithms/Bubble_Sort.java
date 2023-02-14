 public class Bubble_Sort {

	public static void sortieren_Bubble ( int [] array_sort, int len) { //create Method 
		
		for(int i = 0; i < len-1; i++) {
			
			for( int j = 0; j < len-1-i; j++) {
				
				if(array_sort[j] > array_sort[j+1]) { // prüfen, welche größer ist
					
					int temp = array_sort[j]; // erstellen eine temporale Variable
					array_sort[j] = array_sort[j+1];
					array_sort[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {

		int [] array1 = {12, 43, 34, 67, 8, 3, 22}; // erstellen irgendeiner Array
		int len = array1.length;
		sortieren_Bubble(array1, len);
	
		for(int w = 0; w<len; ++w){
            System.out.print(array1[w] + " ,");
        }
	}
}

