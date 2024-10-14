algoritmo Exercicios_operadores05
inicio
	Real base, altura, area
	escreva ("Digita a altura e a base do triangulo para saber sua area: ")
    Texto valor_base = ler ("Digite lado A: ")
	Texto valor_altura = ler ("Digite lado B: ")
     
    base = converter para Real(valor_base)
	altura = converter para Real(valor_altura)
        
    area = (base * altura) / 2;
        
    escrever ("A area do triangulo é: " + area)
fim