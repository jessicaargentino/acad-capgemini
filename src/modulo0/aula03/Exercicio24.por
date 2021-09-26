programa
{
	
	funcao inicio()
	{
		inteiro numero, menor = 0, maior = 0
				
		para(inteiro n = 0; n < 10; n++){
			escreva("Digite o ", n + 1, "º número: ")
			leia(numero)
			
			se(n == 1){
				maior = numero
				menor = numero
			}
			se(numero > maior){
				maior = numero
			}senao se(numero < menor){
				menor = numero
			}
		}
		
		escreva("\nO menor numero é: ", menor, "\n")
		escreva("O maior numero é: ", maior, "\n")
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