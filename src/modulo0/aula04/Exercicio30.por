programa
{
	
	funcao inicio()
	{
		cadeia nomes[5]
		
		para(inteiro n = 0; n < 5; n++){
			escreva("Informe o ", n + 1, "º nome: ")
			leia(nomes[n])
		}

		escreva("\nNomes digitados em ordem:\n")
		para(inteiro n = 0; n < 5; n++){
			escreva(nomes[n], "\n")
		}

		escreva("\nNomes digitados ordem inversa:\n")
		para(inteiro n = 4; n >= 0; n--){
			escreva(nomes[n], "\n")
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 10; 
 * @DOBRAMENTO-CODIGO = [7];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */