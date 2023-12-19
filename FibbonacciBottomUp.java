
//Single Fibbonacci Position via Dynamic Programming (Bottom-Up Approach) 
//This code returns only the value in a specific position of the Fibbonacci sequence, rather then the whole sequence up to that point.
//However, it does print each found position during iteration

//IMPORTANT: Code treatment makes it so the input and output consider the initial position as '1' rather then '0'


public class FibbonacciBottomUp { 
	//Main method
	public static void main(String[] args)
		{System.out.print(getFibbonacci(8));} //Replace '8' with your desired position
	
	//Method responsible for treating the input and preparing the memo array
	public static int getFibbonacci(int num) {		
		//First, treats input
		if(num>=3) {return calcFbn(num-1);} //Usual case. The actual calculations happen in calcFbn()

		//In case input is '1' or '2' (A.K.A. one of our first two positions):
		else if(num>0) {return num-1;} //Returns the same number minus 1 (Since Fibbonacci positions 1 and 2 are, respectively, '0' and '1')
		
		//Invalid input case
		else{return -1;} //If the given input is '0' or less, it is considered invalid, as we treat the first position as '1' (making all such cases equal to looking into negative positions)
	}

	//This method does the calculations
	public static int calcFbn(int stop) {		
		//Array made for keeping the previously calculated values
		int[] arr = new int[stop+1];
		arr[0]=0; arr[1]=1; //Leaves the first 2 positions of the Fibbonacci sequence (0,1) already set
				
		//Iteratively calculates each value from the 3rd to the 'stop' position
		for(int i=2;i<=stop;i++) {
			arr[i] = arr[i-1]+arr[i-2];

			//Prints current position and its value
			System.out.println("Current position: " + (i+1) + ", Value: " + arr[i]);
		}
		
		return arr[stop]; //Once done, returns the calculated value
	}
}