package controller;

public class RecursivaPositivo {
	public RecursivaPositivo() {
		super();
	}
	/*Explica��o: Utiliza a mesma l�gica do exerc�cio 4 apresentado na primeira lista (Como a ultima posi��o do vetor sempre ser� 0, a condi��o de parada � definida com o tamanho do vetor VT, quando ele se torna igual a 0.
	Soma recebe a chamada da fun��o, como uma vari�vel tempor�ria)
	Quando a fun��o chega a 0, diferente do exerc�cio 2, ela volta fazendo a compara��o entre os valores e soma 1 para cada n�mero positivo*/
	
	public int positivo ( int soma, int vetor[], int VT) {
		 if (VT == 0) {
		        return soma;
		    } else {
		        soma = positivo(soma, vetor, VT - 1); 
		        if (0 < vetor[VT - 1]) {
		            soma = soma + 1;
		        }
		        return soma;
		    }
	}
}
