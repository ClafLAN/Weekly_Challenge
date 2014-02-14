package weeklyChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class lenge1 {
	public static void main(String args[]){
		Scanner inputa[] = new Scanner(System.in);
		int[] a = inputa[].nexta();
		int[] b = {2,4,6,8,10};

		int answer[] = new int [a.length + b.length];

		System.arraycopy(a,0, answer, 0, a.length);
		System.arraycopy(b, 0, answer, a.length, b.length);

		Arrays.sort(answer);

		for(int i=0;i<answer.length;i++){
			System.out.print(answer[i]+ " ");
		}

	}

}
