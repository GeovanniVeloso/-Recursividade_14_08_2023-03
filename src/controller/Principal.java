package controller;

public class Principal {

	public static void main(String[] args) {
		RecursivaPositivo rp = new RecursivaPositivo();
		
		int VT = 5;
		int soma = 0;
		int[] vetor = {-7,4,-1,6,-9};
		
		int res = rp.positivo(soma, vetor, VT);
		
		System.out.println(res);

	}

}
