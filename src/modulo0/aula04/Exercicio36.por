programa
{
	
	funcao inicio()
	{
		cadeia nomeProduto[4]
		real preco[4][1]

		escreva("***** ENTRADA DE PRODUTOS *****\n")
		para(inteiro i = 0; i < 4; i++){
			escreva("\nDigite o nome do ", i + 1, "º produto: ")
			leia(nomeProduto[i])
			
			para(inteiro j = 0; j < 1; j++){
				escreva("Digite o valor do produto ", nomeProduto[i], ": ")
				leia(preco[i][j])
			}
		}
		
		escreva("\n***** TABELA DE ESTOQUE *****\n")
		para(inteiro i = 0; i < 4; i++){
			para(inteiro j = 0; j < 1; j++){
				escreva("Produto: ", nomeProduto[i], " | Preço: R$", preco[i][j], "\n")
			}
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 369; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {nomeProduto, 6, 9, 11}-{preco, 7, 7, 5};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */