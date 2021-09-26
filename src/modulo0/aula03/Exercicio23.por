programa
{
	
	funcao inicio()
	{
		inteiro numero
		
		escreva("A tabuada será do número: ")
		leia(numero)

		escreva("\n** TABUADA ", numero, " **\n\n")
		para(inteiro n = 0; n <= 10; n++){
			escreva(numero, " X ", n, " = ", (numero * n), "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */