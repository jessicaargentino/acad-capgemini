programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real A, B

		faca{
			escreva("Digite o valor de A: ")
			leia(A)
			escreva("Digite o valor de B: ")
			leia(B)
		}enquanto(verificaValores(A, B) == falso)

		escreva("\nO resultado de A elevado a B é: ", executaExpressao(A, B))
		
	}

	funcao logico verificaValores(real A, real B){
		
		logico resposta = verdadeiro
		
		se(A > B){
			escreva("O valor de A não pode ser maior que o valor de B! Tente novamente\n")
			resposta = falso
			
		}senao se(A <= B){
			resposta = verdadeiro
		}

		retorne resposta
	}

	funcao real executaExpressao(real A, real B){
		real expressao = mat.potencia(A, B)
		retorne expressao
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 8; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {A, 7, 7, 1}-{B, 7, 10, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */