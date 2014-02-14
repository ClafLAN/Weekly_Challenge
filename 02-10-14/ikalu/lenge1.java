package weeklyChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class lenge1 {
	public static void main(String args[]){
		Scanner inputa = new Scanner(System.in);
		Scanner inputb = new Scanner(System.in);
		
		System.out.println("Input 5 elements for Array a: ");
		int[] a = new int [5];
		for (int i = 0; i < a.length; i++){
			a[i]= inputa.nextInt();
		}
		
		System.out.println("Input 5 elements for Array b: ");
		int[] b = new int [5];
		for (int i = 0; i < b.length; i++){
			b[i]= inputb.nextInt();
		}

		int answer[] = new int [a.length + b.length];

		System.arraycopy(a,0, answer, 0, a.length);
		System.arraycopy(b, 0, answer, a.length, b.length);

		Arrays.sort(answer);
		
		System.out.println("Array sorted and merged: ");
		for(int z = 0; z < answer.length; z++){
			System.out.print(answer[z]+ " ");
		}

	}

}
