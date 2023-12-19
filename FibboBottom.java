public class FibboBottom { 
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