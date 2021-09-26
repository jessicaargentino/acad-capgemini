programa
{
	funcao inicio()
	{
		cadeia nome
		real media, faltasMaxima = 0.0
		inteiro totalAulas, qtdFaltas

		escreva("Digite seu nome: ")
		leia(nome)
		escreva("Digite sua média: ")
		leia(media)
		escreva("Digite o total de aulas: ")
		leia(totalAulas)
		escreva("Digite a quantidade de faltas: ")
		leia(qtdFaltas)

		faltasMaxima = (totalAulas * 0.25)

		se(qtdFaltas > faltasMaxima e media < 6.0){
			escreva("Aluno reprovado!")
		}senao se(qtdFaltas < faltasMaxima e media >= 6.0){
			escreva("Aluno aprovado!")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 200; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {media, 6, 7, 5}-{totalAulas, 7, 10, 10}-{qtdFaltas, 7, 22, 9};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */