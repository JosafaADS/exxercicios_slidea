algoritmo Exercicios_operadores06
inicio
	Real valor_final
    escrever ("Digita gasto do cliente no restaurando pra calcular os 10% do garcon: ")
    Texto valor = leia ("Digite valor gasto: ")
    valor_final = converter para Real(valor)
    valor_final += ((10 * valor_final) / 100)
    escrever ("Valor a ser pago com os 10% do garcon: " + valor_final)
fim