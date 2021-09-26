programa
{
	
	funcao inicio()
	{
		inteiro numAlunos
		real mediaAluno, mediaBaixa = 0.0, mediaAlta = 0.0

		escreva("Digite a quantidade de alunos: ")
		leia(numAlunos)

		para(inteiro n = 0; n < numAlunos; n++){
			escreva("Digite a média do ", n + 1, "º aluno: ")
			leia(mediaAluno)
			enquanto(mediaAluno == 0 ou mediaAluno > 10){
				escreva("Média inválida! Tente novamente\n")
				escreva("Digite a média do ", n + 1, "º aluno: ")
				leia(mediaAluno)
			}
			
			se(n == 1){
				mediaBaixa = mediaAluno
				mediaAlta = mediaAluno
			}
				
			se(mediaAluno < mediaBaixa){
				mediaBaixa = mediaAluno
			}senao se(mediaAluno > mediaAlta){
				mediaAlta = mediaAluno
			}
		}

		escreva("\nA média mais baixa foi: ", mediaBaixa)
		escreva("\nA média mais alta foi: ", mediaAlta)
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