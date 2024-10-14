algoritmo Exercicios_operadores03
inicio
	Real a, b, c, angulo_grau, angulo_Radiano, perimetro
	
	escreva ("Digita os lados A e B \npara saber quanto de cerca deve comprar para completar o terreno")
	
	texto lado_a = ler CaixaDeEntrada ("Digite lado A: ")
	texto lado_b = ler CaixaDeEntrada ("Digite lado B: ")
	
	a = converter para tipo Real(lado_a)
	b = converter para tipo Real(lado_b)
	
	angulo_grau = 90
	angulo_Radiano = (PI / 180) * angulo_grau;
	
	c =  Raiz quadrada de (a elevado ao quadrado + b elevado ao quadrado - 2 * a * b * Calcular o Cosseno de (angulo_Radiano))
        
    perimetro = a + b + c
        
    escrever ("A quantidade de cerca necessária: " + perimetro)
	
fim