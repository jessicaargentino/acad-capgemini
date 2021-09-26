programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro quantJogadores
		real altura, somaAltura = 0.0, media = 0.0

		escreva("Quantidade de jogadores do time: ")
		leia(quantJogadores)
				
		para(inteiro n = 0; n < quantJogadores; n++){
			escreva("Digite a altura do ", n + 1, "º jogador: ")
			leia(altura)

			somaAltura += altura
		}

		media = mat.arredondar((somaAltura/quantJogadores), 2)
		escreva("\nA altura média dos jogadores é: ", media, " cm")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 486; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */