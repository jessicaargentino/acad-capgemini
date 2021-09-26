programa
{
	
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro itensNota, qtdItem
		cadeia descricao
		real valorUnitario, valorTotal = 0.0, totalNota = 0.0

		escreva("***** SUPERMERCADO *****\n")
		escreva("Digite a quantidade de itens da nota: ")
		leia(itensNota)

		para(inteiro i = 0; i < itensNota; i++){
			escreva("Descrição do ", i + 1, "º item: ")
			leia(descricao)
			escreva("Valor unitário do ", i + 1, "º item: ")
			leia(valorUnitario)
			escreva("Quantidade do ", i + 1, "ºi tem: ")
			leia(qtdItem)

			valorTotal = (valorUnitario * qtdItem)
			totalNota += mat.arredondar(valorTotal,2)

			escreva("\n***** FICHA DO ITEM Nº ", i + 1, " *****\n")
			escreva("Descrição: ", descricao, "\n")
			escreva("Valor unitário: R$", valorUnitario, "\n")
			escreva("Quantidade: ", qtdItem, "\n")
			escreva("Valor total: R$", valorTotal, "\n\n")
		}

		escreva("\nValor total da nota: R$", totalNota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 818; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */