algoritimo Exercicios_operadores_01
inicio

	real area, r_cilindro, a_cilindro, v_cilindro
	
	escreva CaixadeMensagem("Programa Calcula area base e volume de um Cilindro!!")
	escreva CaixadeMensagem("Para calcular digite \no Raio e Altura do Cilindro a seguir!!!")
	
	Texto raio = leia CaixaDeEntrada("Digite o Raio do Cilindro: ")
	Texto altura = leia CaixaDeEntrada("Digite a Altura do Cilindro: ")
	
	r_cilindro = (converter para real) Texto raio
	a_cilindro = (converter para real) Texto altura
	
	area = PI * r_cilindro elevado ao quadrado
	
	v_cilindro = a_cilindro * PI * r_cilindro elevado ao quadrado
	
	escreva CaixadeMensagem("O Area da Base do Cilindro é: " + area + " \n" + 
                "O Volume do Cilindro é: " + v_cilindro)
	Fim