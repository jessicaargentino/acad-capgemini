programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro percentual
		real valor
		
		escreva("Informe o valor do produto: ")
		leia(valor)
		escreva("Informe o percentual de aumento: ")
		leia(percentual)

		escreva("\nO novo valor do produto é de R$ ", calculaPercentual(valor, percentual), " reais")
	}

	funcao real calculaPercentual(real valor, inteiro aumento){
		real novoValor = valor + (valor * (aumento / 100))

		retorne novoValor
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 362; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */