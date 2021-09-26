programa
{
		
	funcao inicio()
	{
		cadeia nome, guardaNomes = ""
		inteiro contador = 1, qtdPessoas = 0, sair

		faca{
			escreva("Digite seu nome: ")
			leia(nome)
			
			qtdPessoas++
			guardaNomes += nome + ", "
			
			escreva("\nDeseja sair?\n0 - SIM\n1 - NÃO\n")
			escreva("Sua resposta: ")
			leia(sair)
			escreva("\n")
		}enquanto(sair != 0)

		escreva("Nomes: ", guardaNomes, "\n")
		escreva("Quantidade de pessoas: ", qtdPessoas)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 14; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */