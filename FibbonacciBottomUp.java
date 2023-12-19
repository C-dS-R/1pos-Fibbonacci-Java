
//Single Fibbonacci Position via Dynamic Programming (Bottom-Up Approach) 
//This code returns only the value in a specific position of the Fibbonacci sequence, rather then the whole sequence up to that point.
//However, it does print each found position during iteration

//IMPORTANT: Code treatment makes it so the input and output consider the initial position as '1' rather then '0'



public class FibbonacciBottomUp { 
	public static void main(String[] args)
		{System.out.print(getFibbonacci(8));}
	
	public static int getFibbonacci(int num) {		
		//trata entrada, para em seguida retornar valor do fibbonacci
		if(num>=3) {return calcFbn(num-1);} //caso normal
		//caso input seja um dos 2 primeiros:
		else if(num==1) {return 0;} //caso seja o 2o
		else{return 1;} //caso seja o 1o
	}

	public static int calcFbn(int stop) {		
		//array pra guardar fibbonacci
		int[] arr = new int[stop+1];
		arr[0]=0; arr[1]=1; //inicia com os primeiros 2 valores
				
		//calcula os valores da sequencia
		for(int i=2;i<=stop;i++) {
			arr[i] = arr[i-1]+arr[i-2];
			System.out.println("posicao: " + (i+1) + ", valor: " + arr[i]); //printa
		}
		
		//retorna o valor pedido
		return arr[stop];
	}
}