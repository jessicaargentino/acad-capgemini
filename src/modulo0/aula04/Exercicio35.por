programa
{
	
	funcao inicio()
	{
		cadeia nome[4]
		real nota[4][4], media[4], somaNotas = 0.0

		escreva("***** CALCULADORA DE MÉDIA *****\n")
		para(inteiro i = 0; i < 4; i++){
			escreva("\nDigite o nome do(a) ", i + 1, "º aluno(a): ")
			leia(nome[i])
			escreva("\n")
			
			somaNotas = 0.0
			
			para(inteiro j = 0; j < 4; j++){
				escreva("Digite a ", j + 1, "ª nota do(a) aluno(a) ", nome[i], ": ")
				leia(nota[i][j])

				somaNotas += nota[i][j]
			}
			
			media[i] += (somaNotas / 4)
			
		}

		para(inteiro i = 0; i < 4; i++){
			se(media[i] < 5.5){
				escreva("\nO aluno ", nome[i], " foi reprovado com média ", media[i], "!\n")
			}senao se(media[i] >= 5.5 e media[i] < 7.5){
				escreva("O aluno ", nome[i], " está em recuperação com média ", media[i], "!\n")
			}senao se(media[i] >= 7.5){
				escreva("O aluno ", nome[i], " foi aprovado com média ", media[i], " parabéns!\n")
			}
		}
		
		escreva("\nMédia total da turma: ", somaNotas)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 861; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {nome, 6, 9, 4}-{nota, 7, 7, 4}-{media, 7, 19, 5}-{somaNotas, 7, 29, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */