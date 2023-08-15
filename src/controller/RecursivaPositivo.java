package controller;

public class RecursivaPositivo {
	public RecursivaPositivo() {
		super();
	}
	/*Explicação: Utiliza a mesma lógica do exercício 4 apresentado na primeira lista (Como a ultima posição do vetor sempre será 0, a condição de parada é definida com o tamanho do vetor VT, quando ele se torna igual a 0.
	Soma recebe a chamada da função, como uma variável temporária)
	Quando a função chega a 0, diferente do exercício 2, ela volta fazendo a comparação entre os valores e soma 1 para cada número positivo*/
	
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
