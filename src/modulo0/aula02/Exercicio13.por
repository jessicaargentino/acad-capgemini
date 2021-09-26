programa
{
	funcao inicio()
	{
		inteiro num1, num2, operacao, equacao = 0
		
		escreva("Digite o primeiro valor: ")
		leia(num1)
		escreva("\n** TABELA DE OPERAÇÕES **")
		escreva("\n1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Exponenciação\n")
		escreva("\nDigite o número da operação: ")
		leia(operacao)
		escreva("Digite o segundo valor: ")
		leia(num2)

		escolha(operacao){
			caso 1: equacao = (num1 + num2)
				pare
			caso 2: equacao = (num1 - num2)
				pare
			caso 3: equacao = (num1 * num2)
				pare
			caso 4: equacao = (num1 / num2)
				pare
			caso 5: equacao = (num1 ^ num2)
				pare
			caso contrario: escreva("Operação inválida!")
		}

		escreva("O resultado da operação escolhido é: ", equacao)
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