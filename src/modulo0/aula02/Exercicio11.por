programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro codCargo
		cadeia cargo = ""
		real salario, novoSalario = 0.0, aumento = 0.0
		
		escreva("Digite seu salário: R$")
		leia(salario)
		
		escreva("\n** TABELA DE CARGOS **\n")
		escreva("1 - Serviços Gerais \n2 - Vigia \n3 - Recepcionista \n4 - Vendedor\n")

		escreva("\nDigite o código do seu cargo: ")
		leia(codCargo)
		
		escolha(codCargo){
			caso 1:
				cargo = "Serviços Gerais"
				aumento = 0.5
				pare
			caso 2:
				cargo = "Vigia"
				aumento = 0.3
				pare
			caso 3:
				cargo = "Recepcionista"
				aumento = 0.25
				pare
			caso 4:
				cargo = "Vendedor"
				aumento = 0.15
				pare
			caso contrario:
				escreva("Código de cargo não encontrado\n")
				pare
		}
				
		novoSalario = mat.arredondar(salario + (salario * aumento),3)
		escreva("\nCargo: ", cargo, "\nValor do aumento: ", aumento, "\nNovo salário: R$", novoSalario)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 746; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */