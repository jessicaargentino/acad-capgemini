programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real valorCompra, desconto = 0.0, valorComDescontos = 0.0
		cadeia cartaoFidelidade, quintaCompra

		escreva("Digite o valor da compra: ")
		leia(valorCompra)
		escreva("Possui cartão fidelidade?\nDigite SIM ou NÃO\n")
		escreva("Sua resposta: ")
		leia(cartaoFidelidade)
		escreva("É a sua quinta compra?\nDigite SIM ou NÃO\n")
		escreva("Sua resposta: ")
		leia(quintaCompra)

		se(valorCompra >= 0.01 e valorCompra <= 200.00){
			desconto = (valorCompra * 0.0)
		}senao se(valorCompra >= 200.01 e valorCompra < 400.00){
			desconto = (valorCompra * 0.1)
		}senao{
			desconto = (valorCompra * 0.2)
		}

		valorComDescontos = (valorCompra - desconto)

		se(cartaoFidelidade == "sim" ou cartaoFidelidade == "Sim"){
			se(quintaCompra == "sim" ou quintaCompra == "Sim"){
				mat.arredondar(valorComDescontos = (valorComDescontos - (valorComDescontos * 0.25)),2)
			}senao{
				mat.arredondar(valorComDescontos = (valorComDescontos - (valorComDescontos * 0.15)),2)
			}
		}

		escreva("Valor total da compra com descontos: R$ ", valorComDescontos)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1046; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */