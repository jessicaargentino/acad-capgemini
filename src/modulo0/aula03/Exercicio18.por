programa
{
	
	inclua biblioteca Matematica --> mat

	funcao inicio()
	{
		inteiro quantidade, contador = 1, peso
		real nota, somaNotas = 0.0, media = 0.0

		escreva("Registre a quantidade de notas que serão digitadas: ")
		leia(quantidade)

		enquanto(contador <= quantidade){
			escreva("Digite sua " , contador, "ª nota: ")
			leia(nota)
			escreva("Informe o peso da nota: ")
			leia(peso)

			nota = nota * peso
			somaNotas += nota
			contador++
		}

		media = mat.arredondar((somaNotas/10), 2)

		escreva("A média final do aluno é: ", media) 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */