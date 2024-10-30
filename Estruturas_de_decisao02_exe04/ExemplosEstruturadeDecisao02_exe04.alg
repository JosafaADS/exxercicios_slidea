Algoritmo Estruturas_de_decisao02_exe04
inicio

	Real coef_a, coef_b, coef_c, x1, x2, delta
    String ver_delta
    escrever CaixaDeMensagem ("Digite os 3 coeficientes para calcular as raizes!!!")
    String txt_coef_a = escrever CaixaDeEntrada ("Digite o Coeficiente a: ")
    String txt_coef_b = escrever CaixaDeEntrada ("Digite o Coeficiente b: ")
    String txt_coef_c = escrever CaixaDeEntrada ("Digite o Coeficiente c: ")
    coef_a = converter para tipo real (txt_coef_a)
    coef_b = converter para tipo real (txt_coef_b)
    coef_c = converter para tipo real (txt_coef_c)
        
    delta = coef_b elevado ao quadrado) - (4 * coef_a * coef_c)
        
    se (delta > 0) entao
        {
            ver_delta = "v"
        }
    caso contrario
        {
            ver_delta = "f"
        }
    escolha (ver_delta)
        {
            caso "v":
                x1 = - (coef_b + raiz quadrada de (delta)) / (2 * coef_a)
                x2 = - (coef_b - raiz quadrada de (delta)) / (2 * coef_a)
                escrever CaixaDeMensagem ("Coeficientes: \n" +
                        "Coeficiente a: " + coef_a +
                        "\nCoeficiente b: " + coef_b +
                        "\nCoeficiente c: " + coef_c)
                escrever CaixaDeMensagem ("As raizes são: \n" +
										"x: " + x1 +
										"\nx: " + x2)
                parar
            caso "f":
                escrever CaixaDeMensagem ("Esta equacao nao possui duas raizes, portanto nao sera calculada!")
            padrao:
                parar
        }
	

fim
	