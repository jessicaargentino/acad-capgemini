programa
{
	
	inclua biblioteca Matematica --> mat

	funcao inicio()
	{
		inteiro quantidade, contador = 1, peso
		real nota, somaNotas = 0.0, media = 0.0, frequencia = 0.0

		escreva("Registre a quantidade de notas que serão digitadas: ")
		leia(quantidade)
		
		escreva("Registre a frequência do aluno: ")
		leia(frequencia)

		se(frequencia < 80){
			escreva("\nAluno reprovado por frequência")
		}senao{
			enquanto(contador <= quantidade){
				escreva("Digite sua " , contador, "ª nota: ")
				leia(nota)
				escreva("Informe o peso da nota: ")
				leia(peso)

				nota = nota * peso
				somaNotas += nota
				contador++
			}
		}
		
		media = mat.arredondar((somaNotas/10), 2)
		
		escreva("\nA média final do aluno é: ", media) 
		se(media > 0 e media < 7.5){
			escreva("\nAluno reprovado por nota")
		}se(media > 7.5){
			escreva("\nAluno aprovado, parabéns!")
 		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 830; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */