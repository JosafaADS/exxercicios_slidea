algoritmo Equacao2Grau_procedural
	real x1, x2, delta1, delta2, a, b, c raiz
	
	escreva ("###SISTEMA CALCULA RAIZES DA EQUACAO DE 2º###")
	escreva ("### ax elevado ao 2 + bx +c ###")
	escreva ("Digite os valores dos coeficientes: \n a).: ")
	
	leia (a)
	leia (b)
	leia (c)
	
	escreva ("### ax elevado ao quadrado + bx +c ###");
	escreva ("Os coeficientes sao: \n");
	escreva ("a).: " + a);
	escreva ("b).: " + b);
	escreva ("c).: " + c);
	escreva ("---------------------------------------");
	escreva ("calculando o Delta");
	escreva ("delta = " + b + " elevado ao quadrado  - (4 * " + a + " * " + c +")");
	
	delta1 = calcular potencia de (b elevado ao quadrado)
	escreva ("delta = " + delta1 + " -(4" + " * " + a + " * " + c +")")
	delta2 = 4 * a * c
	escreva ("delta = " + delta1 + " - " + delta2)
	delta1 = delta1 - delta2
	
	Se delta1 > 0 entao
	{
		escreva ("-----------------------------------------")
		escreva ("a equação tem 2 raizes")
		escreva ("-------------------------------------------")
		escreva ("calculando a raíz de x1: \n")
		escreva ("calculando a raíz de x1: (-b + raiz quadrada de delta) / (2 * a)")
		escreva ("x1 = - ("+ b + " + " + "raiz quadrada de " + delta1 +") / (2 * " + a + ")")
		
		raiz = calcula raiz quadrada(delta1)
		
		x1 = (-b + raiz)
		escreva ("x1 = "+ x1 + " / (2 * " + a + ")")		
		x2 = 2 * a
		escreva ("x1 = "+ x1 + " / " + x2)		
		x1 = x1 / x2;
		escreva ("x1 = " + x1)
		
		escreva ("-----------------------------------------")
		escreva ("-------------------------------------------")
		escreva ("calculando a raíz de x2: \n")
		escreva ("calculando a raíz de x2: (-b - raiz quadrada de delta) / (2 * a)")
		escreva ("x2 = - ("+ b + " + " - "raiz quadrada de " + delta1 +") / (2 * " + a + ")")
		
		x2 = (-b - raiz)
		escreva ("x2 = "+ x1 - " / (2 * " + a + ")")		
		x2 = 2 * a
		escreva ("x1 = "+ x1 + " / " + x2)		
		x1 = x1 / x2;
		escreva ("x2 = " + x1)
		
	}
	se nao (delta1 == 0 || delta1 < 0)
	{
		escreva ("-----------------------------------------")
		escreva ("a equação nao tem 2 raizes, o sistema so calcula se houver 2 raizes! \n ENCERRANDO!!");
	}