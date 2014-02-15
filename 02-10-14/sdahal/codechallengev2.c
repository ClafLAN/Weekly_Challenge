/************************************************************
| SAKSHYAM DAHAL
|************************************************************
| CLAFLAN WEEKLY CHALLENGE - WEEK 1
|************************************************************
| QUESTION BY JESSICA 
|************************************************************
| QUESTION: Given 2 pre-sorted lists, write a function that 
|      merges both lists and keeps this new lis sorted.
|*************************************************************/


// including header files
#include<stdio.h>
#include<cs50.h>

// functions declared
void print_array(int a[], int len);
void add(int* array1, int array1_len, int* array2, int array2_len, int* final_array, int final_array_len);


int main(void)
{
	/* arrays to be added */
	int a[] = {1,2,3,4,5};
	int b[] = {0,6,7,8,9,10};

	/* lenght of two arrays */
	int len_a = sizeof(a) / sizeof(int);
	int len_b = sizeof(b) / sizeof(int);

	/* length of array after merging and declaration of merged array */
	int merged_len = len_a + len_b;
	int merged_array[merged_len];

	/* adding two arrays and printing the result */
	add(a, len_a, b, len_b, merged_array, merged_len);
	printf("Final array: ");
	print_array(merged_array, merged_len);
} // end of main

// print an array
void print_array(int* a, int len)
{
	printf("[");
	for (int i = 0; i < len; i++)
	{
		printf("%d ",a[i]);
	}
	printf("]");
	printf("\n");
} // end of print_array
// add two sorted arrays and form a final sorted array
void add(int* array1, int array1_len, int* array2, int array2_len, int* final_array, int final_array_len)
{
     // indices of array
	int array1_start = 0;
	int array2_start = 0;
	int i = 0;
    // while there are elements in any one of the array compare and add
	for(i = 0; array1_start < array1_len && array2_start < array2_len; i++)
	{
		if(array1[array1_start] < array2[array2_start])
        { 
            final_array[i] = array1[array1_start++];
        }
		else 
        { 
             final_array[i] = array2[array2_start++]; 
        }
	} // end of for loop

	// remaining elements
	for (;array1_start < array1_len;i++,array1_start++) 
    { 
        final_array[i] = array1[array1_start]; 
    }
	for (; array2_start < array2_len; i++, array2_start++)
    { 
        final_array[i] = array2[array2_start];
    }

} // end of add
