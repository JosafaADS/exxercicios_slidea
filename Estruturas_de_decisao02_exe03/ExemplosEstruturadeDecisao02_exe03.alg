Algoritmo Estruturas_de_decisao02_exe03
inicio

	String txt_valor_bolsa = escrever CaixaDeEntrada ("Digite o valor da Bolsa em R$: ")
    String txt_tempo_estagio = escrever CaixaDeEntrada ("Digite o tempo do estagio (anos): ")
    Real valor_bolsa = converter para tipo real (txt_valor_bolsa)
    Inteiro tempo_estagio = converter para tipo inteiro (txt_valor_bolsa)
    String confirma;
    Se (valor_bolsa >= 750 && valor_bolsa <= 950 && tempo_estagio >= 2) entao
    {
		confirma = "s";
    }
    Caso contrario
    {
        confirma = "n";
    }
    escolha (confirma)
    {
        caso "s":
            escrever CaixaDeMensagem ("Participará do treinamento")
            parar;
        caso "n":
            escrever CaixaDeMensagem ("Nao Participará do treinamento")
            parar;
        padrao:
            parar;
                
    }
	

fim
	