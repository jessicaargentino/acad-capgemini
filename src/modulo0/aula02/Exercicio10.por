programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real peso, altura, imc = 0.0

		escreva("Digite seu peso: ")
		leia(peso)
		escreva("Digite sua altura: ")
		leia(altura)

		imc = mat.arredondar((peso/(altura * altura)), 1)

		escreva("\nO seu imc é: " , imc, "\n")
		
		se(imc < 18.5){
			escreva("Abaixo do peso")
		}senao se(imc >= 18.6 e imc <= 24.9){
			escreva("Peso ideal")
		}senao se(imc >= 25.0 e imc <= 29.9){
			escreva("Levemente acima do peso")
		}senao se(imc >= 30.0 e imc <= 34.9){
			escreva("Obesidade grau I")
		}senao se(imc >= 35.0 e imc <= 39.9){
			escreva("Obesidade grau II")
		}senao{
			escreva("Obesidade III mórbida")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 515; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */