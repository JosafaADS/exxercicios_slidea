/*
Uma loja especializada em pisos cerâmicos necessita de um programa quecalcule a quantidade de caixas e o custo total de uma venda, a partir dasmedidas fornecidas pelo cliente. Desenvolva um algoritmo e um programa emJava para resolver este problema. As especificações são:
 A entrada deverá conter a largura e o comprimento da área a ser
revestida e o valor unitário da caixa de piso escolhido pelo cliente.
 Calcular a área total revestida e o número de caixas de piso necessárias,
considerando que cada caixa cobre 2,5 metros quadrados.
 Exibir a quantidade de caixas necessárias e o custo total.

O número de caixas de piso necessárias temque ser um valor inteiro!

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qtdpisos;

import java.util.Scanner;//importando objeto que monta entrada de dados via teclado
/**
 *
 * @author autologon
 */
public class QtdPisos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);//monta na variavel entrada o objeto que armazena entrada de dados
        float largura, altura, caixa, qtd_caixa, area;//declarando as variaveis para calcula de area e quantidade de caixas, e valor da caixa(2.5)
        int piso_necessario;//varivel que armezenará o valor arredondado de quantidade de cada de pisos
        caixa = 2.5F;//definindo o tamanho do piso em 2.5
        
        System.out.println("##Calcula qtd pisos por area em m2##");//saudacao inicial do programa
        System.out.println("------------------------------------");
        System.out.println("Digite a largura da area metros: ");//solicitado valor da largura em metros
        largura = entrada.nextFloat();//armazenando a valor digitado para largura na variavel largura
        System.out.println("Digite a altura em metros: ");//solicita o valor de altura em metros
        altura = entrada.nextFloat();//armazena o valor digitado para altura na variavel altura
        
        area = largura * altura;//calculando a area e guardando o seu valor na variavel Area
        
        System.out.println("------------------------------------");
        qtd_caixa = area / caixa; //calculando quantidade de caixas
        piso_necessario = (int)qtd_caixa; //convertendo para tipo inteiro, arrendondando quantidade de caixas necessarias
        
        System.out.println("Quantidade de piso para a area de " + 
                area + " m2 são: " + piso_necessario + " pisos necessarios");//exibindo o tamanho da area em metros quadrados e quantidade de caixas

        
        
    }
    
}
