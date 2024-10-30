Algoritmo ExemplosEstruturadeDecisao02_exe02
inicio

	String txt_turno = escreva CaixaDeEntrada ("Digite a letra do codigo do seu turno de trabalho" +
                "\n 'N' (noite) ou 'D' (dia): ")
    txt_turno = converter para caixa baixa (txt_turno)
	String txt_hr_trabalhada = escreva CaixaDeEntrada ("Digite a quantidade de horas trabalhadas")
    Real valor = converter para tipo real (txt_hr_trabalhada)
    Real valor_n = 45.00
    Real valor_d = 37.50
    escolha (txt_turno)
        {
            caso "n":
                valor *= valor_n;
                escrever CaixaDeMensagem ("O seu salario é: R$" + valor")
                parar;
            caso "d":
                valor *= valor_d;
                escrever CaixaDeMensagem ("O seu salario é: R$" + valor)
                parar;
            padrao:
                escrever CaixaDeMensagem ("digite umas das opcoes")
        }
	

fim
	