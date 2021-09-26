programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real alturaChico = 1.50, alturaZe = 1.10
		inteiro tempo = 0

		enquanto(alturaChico >= alturaZe){
			mat.arredondar(alturaChico += 0.2, 2)
			mat.arredondar(alturaZe += 0.3, 2)
			tempo++
		}
		
		escreva("Altura Chico: ", alturaChico, "\nAltura Zé: ", alturaZe)
		escreva("\nLevou ", tempo, " anos para Zé se tornar maior que Chico")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 420; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */