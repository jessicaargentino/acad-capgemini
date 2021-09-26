programa
{
	funcao inicio()
	{
		real valorReais = 0.0, quantidade = 0.0, cotacao
		
		escreva("Informe a cotação atual do dólar: ")
		leia(cotacao)
		escreva("Informe a quantidade de dólares que serão trocados: ")
		leia(quantidade)

		valorReais = (quantidade * cotacao)

		escreva("O valor em reais é de: R$", valorReais)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 12; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */