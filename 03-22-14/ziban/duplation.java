import java.util.Scanner;


public class duplation {

	/*
	 * Method to check if a number is even or not 
	 * returns 1 if the number is even 
	 * returns 0 if the number is not even
	 * returns -1 if there is an error
	 */

	public int checkEven(int x){

		int ifeven=-1;

		if(x %2 ==0){
			ifeven=1;
		}
		else if(x%2!=0){
			ifeven=0;
		}

		return ifeven;

	}

	/*
	 * Method to do the multiplication of two integers using duplation(Ethiopian Multiplication)
	 * Algorithm described at http://rosettacode.org/wiki/Ethiopian_multiplication
	 */
	public void duplicationMultiplication(int a, int b){

		int leftRow=a;
		int rightRow=b;
		int Total=0;

		while(leftRow>=1){			
			System.out.print("Right Column\t|\tLeft Column\n");
			System.out.println(leftRow+"\t\t|\t"+rightRow+"\n");
			
			//Adds up if the number on the left is not even
			if(checkEven(leftRow)!=1){
				Total=Total+rightRow;
			}
			
			//Divides numbers on the left by two and multiplies number on the right by two
			leftRow= (int)leftRow/2;
			rightRow=rightRow*2;
		}
		
		System.out.println("---------The total is "+ Total +"--------------");

	}
	
	
	public static void main(String[]args){
		duplation myDuplation = new duplation();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first number");
		int first=input.nextInt();
		System.out.println("Please enter the second number");
		int second= input.nextInt();
		
		myDuplation.duplicationMultiplication(first, second);
		
	}

}
