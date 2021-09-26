programa
{
	funcao inicio()
	{
		inteiro vetNumeros[5], somaNumeros = 0
		
		para(inteiro n = 0; n < 5; n++){
			escreva("Informe o ", n + 1, "º número: ")
			leia(vetNumeros[n])

			somaNumeros += vetNumeros[n]
			escreva("\nNúmero digitado: ", vetNumeros[n], "\n\n")
		}

		escreva("Somatório dos números: ", somaNumeros)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */