algoritmo Exercicios_operadores07
inicio
	Inteiro a, b, soma, subtrai, mult, divisao, modulo
    escrever ("Digite dois numero inteiros para saber o resultado das 5 operacoes: ")
    Texto num_a = JOptionPane.showInputDialog(null, "Digite primeiro numero: ")
    Texto num_b = JOptionPane.showInputDialog(null, "Digite segundo numero: ")
    a = converter para inteiro(num_a)
    b = converter para inteiro(num_b)
    soma = a + b
    subtrai = a - b
    mult = a * b
    divisao = a / b
    modulo = a % b
    Escrever ("O resultado da soma: " + soma +
               "\nO resultado da subtracao: " + subtrai +
               "\nO resultado da multiplicacao: " + mult +
               "\nO resultado da divisao: " + divisao +
               "\nO resultado do resto da divisao: " + modulo);
fim