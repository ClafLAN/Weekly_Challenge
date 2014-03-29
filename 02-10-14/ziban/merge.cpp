#include<iostream>

/*
*Collins Sirmah	
*Solution in C++
*/

using namespace std;

int *merge(int arrayA[], int arrayB[]){

	//Get the lengths of both arrays
	int lengthA=sizeof(arrayA)+1;
	int lengthB=sizeof(arrayB)+1;

	//Get the counter
	int counter=0;
	int counterA=0;
	int counterB=0;

	//Get the size of the final array 
	 int finalArraySize=lengthA+lengthB;
	
	//Initialize the final array 
	int *myFinalArray= new int [finalArraySize];
	cout << vector<myFinalArray>;

	//Set the counter of the for loop
	if(lengthA>lengthB || lengthA==lengthB){
		counter=lengthA;
	}
	else{
		counter=lengthB;
	}
	int i=0;

	//populate the new array
	for ( i = 0; i <=finalArraySize; ++i)
	{
		
		//Compare elements in the first array to the second one 
		if(arrayA[counterA]<=arrayB[counterB]){
			myFinalArray[i]=arrayA[counterA];
			//cout<< myFinalArray[i]<< endl << counterA;
			counterA++;
		}

		//comparison of the elements
		else if(arrayB[counterB]<arrayA[counterA] && counter ){
			myFinalArray[i]=arrayB[counterB];
			counterB++;
		}
	
			//If one of the arrays has been exhausted
		else if(counterA==lengthA){
			for(int j=i;j<=finalArraySize;j++){
				myFinalArray[j]=arrayB[counterB];
				counterB++;
				i++;
			}
		}

		else if(counterB==lengthB)
		{
			for(int j=i;j<=finalArraySize;j++){
				myFinalArray[j]=arrayA[counterA];
				counterA++;
				i++;

			}

		}

	}
		
		for(int j=0;j<=sizeof(myFinalArray);j++){
				cout<<myFinalArray[j]<< endl;
			}
			cout <<"gdf"<<sizeof(myFinalArray);

			
		return myFinalArray;
}

int main(){
	// a pointer to an int.
   int *p;

   int myA[] = {2,5,4,40,12071 };
   int myB[] = {1,6,7,8,8};
 
   p = merge(myA,myB);
   
  
 
   return 0;


}