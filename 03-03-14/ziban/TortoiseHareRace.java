
import java.util.*;


public class TortoiseHareRace implements Runnable {

	/*
	 * Enum to store the movement type of tortoise
	 * Method getValue to return the value of a specific value of the enum
	 */
	public enum TortoiseMovement{
		FASTPLOD(3), SLIP(-6), SLOWPOD(1);
		private int value;

		private TortoiseMovement(int value){
			this.value=value;
		}

		public int getValue(){
			return value;
		}

	}

	/*
	 * Enum to store the movement type of hare
	 * Has method get value to return the value of a specific enum type
	 */
	public enum HareMovement{
		SLEEP(0), BIGHOP(9), BIGSLIP(-12),SMALLHOP(1),SMALLSLIP(-2);
		private int value;

		private HareMovement(int value){
			this.value=value;
		}	

		public int getValue(){
			return value;
		}
	}


	/*
	 * Method to calculate the movement of the tortoise
	 * Returns a value showing the position that the tortoise has moved
	 */
	public int tortoiseSteps(){

		int number=randomPosition();
		int movt=0;

		if(number>0 && number <=5){
			movt=TortoiseMovement.FASTPLOD.getValue();
		}
		else if(number>5 && number <=7){
			movt=TortoiseMovement.SLIP.getValue();
		}
		else if(number >7 && number <=10){
			movt=TortoiseMovement.SLOWPOD.getValue();
		}

		return movt;
	}

	/*
	 * Method to calculate the hareMovements
	 * Returns the number of steps moved
	 */
	public int hareSteps(){
		int number =randomPosition();
		int movt =0;

		if(number>0 && number <=2){
			movt=HareMovement.SLEEP.getValue();
		}
		else if(number>2 && number <=4){
			movt=HareMovement.BIGHOP.getValue();
		}
		else if(number >4 && number <=5){
			movt=HareMovement.BIGSLIP.getValue();

		}
		else if(number >5 && number <=8){
			movt=HareMovement.SMALLHOP.getValue();

		}
		else if(number>8 && number <=10){
			movt=HareMovement.SMALLSLIP.getValue();
		}

		return movt;
	}


	/*
	 * Method to generate the random number
	 * Returns the random number
	 */
	public int randomPosition(){

		Random myGen=new Random();

		int i=myGen.nextInt(10)+1;

		return i;
	}

	/*
	 * Run method
	 * Simulates the race between Hare and tortoise 
	 * prints out the position in the race, and the final winner 
	 * Thread to sleep for a second
	 */
	public void run(){

		//Initial positions 
		int TortPos=1;
		int HarePos=1;
		int counter=1;
		int i=1;

		while(counter<=70){
			try{
				if(HarePos>TortPos){
					counter=HarePos;
				}
				else if(TortPos>=HarePos){
					counter=TortPos;
				}
				int a=hareSteps();
				int b=tortoiseSteps();

				TortPos=TortPos+b;
				HarePos=HarePos+a;

				if(TortPos<1){
					TortPos=1;
				}
				if(HarePos<1){
					HarePos=1;
				}
				System.out.println("Time: "+ i);
				System.out.println("Position of Tortoise: "+TortPos);
				System.out.println("Position of Hare "+HarePos +"\n"+ "-----------------------------------");
				++i;
				if(HarePos>=70 && TortPos <70){
					System.out.println("Hare Wins the Race");
					break;
				}
				else if(TortPos>=70 && HarePos<70){
					System.out.println("Tortoise Wins the Race");
					break;
				}
				else if(TortPos>=70 && HarePos>=70){
					System.out.println("Its a tie");
					break;
				}
				Thread.sleep(1000);
			}

			catch(InterruptedException exception){
				System.out.println("Program interrupted");
			}
		}
	}

	public static void main(String[] args) {

		TortoiseHareRace myTest = new TortoiseHareRace();

		myTest.run();
	}



}
