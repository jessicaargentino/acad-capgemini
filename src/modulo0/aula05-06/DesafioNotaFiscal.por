programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro numNotaFiscal, tipoPagamento, qtdItensNota, qtdItens, codItem[12]
		cadeia nomeCliente, nomeItem[12], pagamento = ""
		real precoUnitario = 0.0, desconto = 0.0, acrescimo = 0.0, precoTotal = 0.0, valorItem[12]

		//Coleta informações sobre a nota fiscal
		escreva("Digite o número da nota fiscal: ")
		leia(numNotaFiscal)
		escreva("Digite o nome do cliente: ")
		leia(nomeCliente)
		escreva("Digite a quantidade de itens da nota: ")
		leia(qtdItensNota)
		escreva("\n1 - Pagamento á vista\n2 - Pagamento á prazo\n")
		escreva("\nDigite o tipo de pagamento: ")
		leia(tipoPagamento)
		
		escreva("\n")

		se(tipoPagamento == 1 ou tipoPagamento == 2){
			//Entrada de itens de acordo com a quantidade de itens da nota
			para(inteiro i = 0; i < qtdItensNota; i++){
				escreva("Código do ", i + 1, "º item: ")
				leia(codItem[i])
				escreva("Quantidade do item: ")
				leia(qtdItens)
				
				escolha(codItem[i]){
					//Preenchimento dos nomes, valores unitários e descontos/acréscimos
					caso 35877: nomeItem[i] = "Microondas 30l"
						  	precoUnitario = 458.00
					  	  	desconto = (precoUnitario * 0.05)
				       	  	acrescimo = (precoUnitario * 0.03)
				       	  	pare
					caso 35878: nomeItem[i] = "Forno Elétrico"
						  	precoUnitario = 680.00
					  	  	desconto = (precoUnitario * 0.03)
				       	  	acrescimo = (precoUnitario * 0.06)
				       	  	pare
					caso 35879: nomeItem[i] = "Ferro Passar Roupa"
						  	precoUnitario = 120.00
					  	  	desconto = (precoUnitario * 0.05)
				       	  	acrescimo = (precoUnitario * 0.04)
				       	  	pare
					caso 35888: nomeItem[i] = "Secador de cabelos"
						  	precoUnitario = 80.00
					  	  	desconto = (precoUnitario * 0.05)
				       	  	acrescimo = (precoUnitario * 0.03)
				       	  	pare
					caso 48885: nomeItem[i] = "Geladeira Biplex"
						  	precoUnitario = 1200.00
					  	  	desconto = (precoUnitario * 0.025)
				       	  	acrescimo = (precoUnitario * 0.1)
				       	  	pare
					caso 48886: nomeItem[i] = "Freezer Vertical"
						  	precoUnitario = 980.00
					  	  	desconto = (precoUnitario * 0.025)
				       	  	acrescimo = (precoUnitario * 0.1)
				       	  	pare
					caso 48887: nomeItem[i] = "Fogão 6 bocas"
						  	precoUnitario = 850.00
					  	  	desconto = (precoUnitario * 0.025)
				       	  	acrescimo = (precoUnitario * 0.1)
				       	  	pare
					caso 48888: nomeItem[i] = "Freezer Horizontal"
						  	precoUnitario = 1540.00
					  	  	desconto = (precoUnitario * 0.025)
				       	  	acrescimo = (precoUnitario * 0.1)
				       	  	pare
					caso 52475: nomeItem[i] = "Bicicleta masculina"
						  	precoUnitario = 800.00
					  	  	desconto = (precoUnitario * 0.03)
				       	  	acrescimo = (precoUnitario * 0.06)
				       	  	pare
					caso 52476: nomeItem[i] = "Bicicleta feminina"
						  	precoUnitario = 800.00
					  	  	desconto = (precoUnitario * 0.03)
				       	  	acrescimo = (precoUnitario * 0.06)
				        	  	pare
					caso 52477: nomeItem[i] = "Bicicleta infantil"
						  	precoUnitario = 650.00
					  	  	desconto = (precoUnitario * 0.05)
				       	  	acrescimo = (precoUnitario * 0.08)
				       	  	pare
					caso 52478: nomeItem[i] = "Triciclo infantil"
						  	precoUnitario = 420.00
					  	  	desconto = (precoUnitario * 0.05)
				       	  	acrescimo = (precoUnitario * 0.08)
				       	  	pare
					caso contrario: escreva("Item não encontrado!")
							 	pare
				     
					}

					//Confere o tipo de pagamento e gera o valor do item já com desconto ou acréscimo
					se(tipoPagamento == 1){
						valorItem[i] = mat.arredondar((qtdItens * (precoUnitario - desconto)),3)
						pagamento = "Á vista"
					}senao se(tipoPagamento == 2){
						valorItem[i] = mat.arredondar((qtdItens * (precoUnitario + acrescimo)),3)
						pagamento = "Á prazo"
					}senao{
						escreva("Tipo de pagamento inválido!")
					}

					//Soma o valor de todos os itens
					mat.arredondar(precoTotal += valorItem[i],3)
				
				}
		}senao{
			escreva("Tipo de pagamento inválido!\n")
		}
		
		//Imprime todas as informações da nota fiscal
		escreva("\n** NOTA FISCAL **\n")
		escreva("\nNúmero nota: ", numNotaFiscal)
		escreva("\nNome cliente: ", nomeCliente)
		escreva("\nForma de pagamento: ", pagamento, "\n")
		
		para(inteiro i = 0; i <= codItem[i]; i++){
			escreva("\nItem ", i + 1, ": ", nomeItem[i], "\nPreço total: R$", valorItem[i])
		}
		
		escreva("\n\nValor total da nota: R$", precoTotal, "\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3894; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {codItem, 7, 64, 7}-{nomeItem, 8, 22, 8}-{valorItem, 9, 79, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */