programa
{
	
	funcao inicio()
	{
		inteiro numerosPares[10], numerosImpares[10], numero
		
		para(inteiro n = 0; n < 10; n++){
			escreva("Informe o ", n + 1, "º número: ")
			leia(numero)

			se(numero == 0){
				escreva("Número inválido! Digite outro valor: ")
				leia(numero)
			}
			se(numero % 2 == 0){
				numerosPares[n] = numero
			}senao{
				numerosImpares[n] = numero
			}
		}

		escreva("\nVetor pares: ")
		para(inteiro n = 0; n < 10; n++){
			se(numerosPares[n] > 0){
				escreva(numerosPares[n], ", ")
			}
		}

		escreva("\nVetor ímpares: ")
		para(inteiro n = 0; n < 10; n++){
			se(numerosImpares[n] > 0){
				escreva(numerosImpares[n], ", ")
			}
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 629; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numerosPares, 6, 10, 12}-{numerosImpares, 6, 28, 14};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */