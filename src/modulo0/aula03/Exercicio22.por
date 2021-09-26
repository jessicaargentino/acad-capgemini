programa
{
	
	funcao inicio()
	{
		inteiro numero, somaNumeros = 0
			
		faca{
			escreva("Digite um número ou digite 0 para sair: ")
			leia(numero)
			somaNumeros += numero
		}enquanto(numero != 0)

		escreva("\nTotal obtido: ", somaNumeros)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 218; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */