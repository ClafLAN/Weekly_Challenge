package huhu.lab;

public class Array_merge_sort {

	public Array_merge_sort() {
	
	}
	
	public static int[] arrayMergeSort(int[] array_1, int[] array_2){
		int array1_len = array_1.length;
		int array2_len = array_2.length;
		int total_len = array1_len + array2_len;
		int[] sorted_list = new int[total_len];
		for(int i = 0, j = 0, k = 0; i<total_len;i++){
			if(k < array1_len && (j == array2_len || array_1[k] <= array_2[j] )){
				
				sorted_list[i] = array_1[k];
				k++;
				
			}
			else{
				sorted_list[i] = array_2[j];
				if(j<=array2_len-1)
					j++;
				
			}
		}
		
		
		return sorted_list;
	}
	
	public static void main(String[] args){
		
		int[] b = {1,2,3,4,5,6,87};
		int[] a = {1,3,5,14,16,17};
		
		int[] c = arrayMergeSort(a,b);
		
		for(int num: c)
			System.out.printf("%d\t", num);
		
		
	
	}

}
