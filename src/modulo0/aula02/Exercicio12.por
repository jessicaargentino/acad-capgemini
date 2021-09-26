programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real precoProduto, lucro, valorVenda

		escreva("Digite o preço pago pelo produto: R$")
		leia(precoProduto)

		se(precoProduto < 20.0){
			lucro = 0.5
		}senao{
			lucro = 0.35
		}

		valorVenda = mat.arredondar(precoProduto + (precoProduto * lucro),2)

		escreva("Valor de venda: R$" , valorVenda)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 372; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */