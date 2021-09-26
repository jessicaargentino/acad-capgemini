programa
{
	
	funcao inicio()
	{
		inteiro numeros[10], numerosMultiplicados[10]
		
		para(inteiro n = 0; n < 10; n++){
			escreva("Informe o ", n + 1, "º número: ")
			leia(numeros[n])
			numerosMultiplicados[n] = numeros[n] * 5
		}

		escreva("\nNúmeros digitados: ")
		para(inteiro n = 0; n < 10; n++){
			escreva(numeros[n], ", ")
		}

		escreva("\nNúmeros digitados multiplicados por 5: ")
		para(inteiro n = 0; n < 10; n++){
			escreva(numerosMultiplicados[n], ", ")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 352; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {numeros, 6, 10, 7}-{numerosMultiplicados, 6, 23, 20};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */