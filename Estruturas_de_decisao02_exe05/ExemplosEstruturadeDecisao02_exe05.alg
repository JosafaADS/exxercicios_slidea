Algoritmo Estruturas_de_decisao02_exe05
inicio

	Inteiro idade
    String confere = ""
    escrever CaixaDeMensagem ("Digite sua idade para saber sua classe eleitoral!!!")
    String txt_idade = CaixaDeEntrada ("Qual sua idade: ")
    idade = converter para tipo inteiro (txt_idade)
        
        se (idade < 16) entao
        {
            confere = "ne"
        }
        Senao (idade > 18 && idade < 65)
        {
            confere = "eo"
        }
        Senao (idade >= 16 && idade < 18 || idade > 65)
        {
            confere = "ef"
        }
        escolha (confere)
        {
            caso "ne":
                escrever CaixaDeEntrada ("não-eleitor (abaixo de 16 anos)")
                parar;
            caso "eo":
                escrever CaixaDeEntrada ("eleitor obrigatório (entre 18 e 65 anos)")
                parar;
            caso "ef":
                escrever CaixaDeEntrada ("eleitor facultativo (entre 16 e 18 anos e maior de 65 anos)")
                parar;
            padrao:
                escrever CaixaDeMensagem ("digite numero")
        }
	

fim
	