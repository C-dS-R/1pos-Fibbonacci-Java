import java.util.Arrays; //Used to fill our memo array with a value (-1) used to indicate to-be-calculated spaces

//Single Fibbonacci Position via Dynamic Programming (Top-Down Approach) 
//This code returns only the number in a specific position in the Fibbonacci sequence, rather then the whole sequence up to that point.
//However, it does print each found position during recursion

//IMPORTANT: Code treatment makes it so the input and output consider the initial position as '1' rather then '0'


public class FibbonacciTopDown {
	//Main method
	public static void main(String[] args)
		{System.out.print(getFibbonacci(8));} //Replace '8' with your desired position

	//Method responsible for treating the input and preparing the memo array
	public static int getFibbonacci(int num) {
		//First, treats input
		if(num>=2) { //The usual case
			int[] fbnMemo = new int[num]; //Array for memoizing fibbonacci
			Arrays.fill(fbnMemo,-1); //Fills the array with '-1'. This value will be used to quickly tell if said position's fibbonacci has been calculated or not (Since the Fibbonacci sequence does not have any negative values)
			fbnMemo[0]=0; fbnMemo[1]=1; fbnMemo[2]=1; //Leaves the first 3 positions of the Fibbonacci sequence (0,1,1) already set

			return calcFbn(fbnMemo,num-1); //The actual calculations happen in calcFbn()
		}
		//In case input is '1' or '2' (A.K.A. one of our first two positions):
		else if(num>0) {return num-1;} //Returns the same number minus 1 (Since Fibbonacci positions 1 and 2 are, respectively, '0' and '1')
		
		//Invalid input case
		else{return -1;} //If the given input is '0' or less, it is considered invalid, as we treat the first position as '1' (making all such cases equal to looking into negative positions)
	}

	//This method does the calculations
	public static int calcFbn(int[] arr, int pos) {
		//First, it verifies if the necessary Fibbonaccis for the current position have already been calculated and stored in our memo array
		//It uses '-1', the value we previously filled our array with, for distinguishing calculated/non-calculated positions
		//Recursive calls are done wenever a not-yet-calculated position's value is necessary
		if(arr[pos-1]<0){arr[pos-1] = calcFbn(arr,pos-1);}
		if(arr[pos-2]<0){arr[pos-2] = calcFbn(arr,pos-2);}
		
		//Now that we have both values, we can calculate the current Fibbonacci position 
		int val = arr[pos-1]+arr[pos-2];
		
		//Prints current position and its value
		System.out.println("Current position: " + (pos+1) + ", Value: " + val);
		

		return val; //Once done, returns the calculated value
	}
}
