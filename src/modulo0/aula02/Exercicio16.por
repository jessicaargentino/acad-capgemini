programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real valorConta, valorCaixa, valorSaque

		escreva("Digite o valor que possui na conta: R$")
		leia(valorConta)
		escreva("Digite o valor que o caixa possui: R$")
		leia(valorCaixa)
		escreva("Digite o valor que será sacado: R$")
		leia(valorSaque)

		se(valorConta >= valorSaque e valorCaixa >= valorSaque){
			valorConta -= valorSaque
			valorCaixa -= valorSaque
			escreva("\nSaque realizado com sucesso!\n")
			escreva("\nValor sacado: R$", valorSaque, "\nValor atual na conta: R$", valorConta, "\nValor atual no caixa: R$", valorCaixa)
		}senao{
			escreva("\nSaque não realizado!\n")
			escreva("\nValor da tentativa de saque: R$", valorSaque, "\nValor atual na conta: R$", valorConta, "\nValor atual no caixa: R$", valorCaixa)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 628; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */