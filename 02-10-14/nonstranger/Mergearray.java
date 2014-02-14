package arraey;

public class Mergearray {

	public static void main(String[] args) {
				// TODO Auto-generated method stub

				int[] array1 = {1,3,5,7,9};
				int[] array2 = {2,4,6,8,10};
				int [] array3 = merge(array1,array2);
				for (int e=0; e<array1.length+array2.length; e++)
					System.out.print(array3[e]+ " ");
				
			}
				
				public static int[] merge(int[] array1, int[]array2) {

					int[] array3 = new int[array1.length + array2.length];
				    int i = 0, j = 0, k = 0;
				    while (i < array1.length && j < array2.length)
				    {
				        if (array1[i] < array2[j])
				        {
				            array3[k] = array1[i];
				            i++;
				        }
				        else
				        {
				        	array3[k] = array2[j];
				            j++;
				        }
				        k++;
				    }

				    while (i < array1.length)
				    {
				    	array3[k] = array1[i];
				        i++;
				        k++;
				    }

				    while (j < array2.length)
				    {
				    	array3[k] =  array2[j];
				        j++;
				        k++;
				    }

				    return array3;
				}

	}


