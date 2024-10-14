/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.equacao2grau_procedural;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
/**
 *
 * @author jos
 */
public class Equacao2Grau_procedural 
{

    public static void main(String[] args) 
    {                                               //declaracao das variaveis que irão conter os valores dos coeficientes
        double x1, x2, delta1, delta2, a, b, c, raiz; //o valor do calculo da quantidades de raizes armazenado em deltal
        Scanner entrada = new Scanner(System.in); // e de posse do delta calcular as duas raizes quadraticas, a raiz recebe o calculo do "raize delta"
        
        System.out.println("###SISTEMA CALCULA RAIZES DA EQUACAO DE 2º###"); //saudacao do programa
	System.out.println("### ax elevado ao 2 + bx +c ###"); //descricao da operacao a realizar: calcular equacao usando formula de Bhaskara
	System.out.println("Digite os valores dos coeficientes: \n a).: ");
	a = entrada.nextDouble(); //variavel "a" recebe o valor digitado no teclado referente coeficiente "a"
	System.out.println("b).: "); 
	b = entrada.nextDouble();//variavel "b" recebe o valor digitado no teclado referente coeficiente "b"
	System.out.println("c).: ");
	c = entrada.nextDouble();//variavel "c" recebe o valor digitado no teclado referente coeficiente "c"
					
	//agora ja temos armazenados os valores(atributos) do tipo reais nas variaveis a, b, c
	//referente aos coeficientes a, b, c e podemos exibilos todos eles antes de calcular o Delta e determinar
        //quantas raizes possui a equacao.
	
        //exibindo passo a passo as operacoes
			//delta = (b elevado ao quadrado) - (4 * a * c);
		
	//este metodo apos receber os valores do coeficientes dados na entrada de dados no inicio do sistema,
	//os valores recebidos no parametros do metodo a, b, c
	//exibe cada coeficiente
	//#######################################################################################################
	//exibindo os valores dos coeficientes, apos isso calcular o delta para saber as raizes.
	System.out.println("---------------------------------------");
	System.out.println("### ax elevado ao quadrado + bx +c ###");
	System.out.println("Os coeficientes sao: \n");
	System.out.println("a).: " + a);
	System.out.println("b).: " + b);
	System.out.println("c).: " + c);
	System.out.println("---------------------------------------");
	System.out.println("calculando o Delta");
	System.out.println("delta = " + b + " elevado ao quadrado  - (4 * " + a + " * " + c +")");
        
        //#######################################################################################################
        //apos receber e exibir os valores dos coeficientes iremos calcular o valor do delta
	//sempre exibindo passo a passo de cada operacao, e para isso separei o que seria um delta em duas variaveis deltas
        //separando as partes das expressoes numericas
	delta1 = (Math.pow(b, 2));
	System.out.println("delta = " + delta1 + " -(4" + " * " + a + " * " + c +")");
	delta2 = 4 * a * c;
	System.out.println("delta = " + delta1 + " - " + delta2);
	delta1 = delta1 - delta2;
	System.out.println("Delta = " + delta1);
        
        //#######################################################################################################
        //verificando quantas raízes há na equacao, se houver 2 raizes o programa calcula
        //as duas raizes, caso ou houver 1 ou nenhuma o programa se encerra.
	if (delta1 > 0) 
	{
	System.out.println("-----------------------------------------");
	System.out.println("a equação tem 2 raizes");//verificado que o delta é maior que zero, informe que a equacao tem 
                                                     //duas raizes prosseguindo para o ultimo passo, que é o calculo das duas raizes
	//##############################################################################################################
        //agora que recebemos o valor do delta e do coeficientes a, b, c
	//vamos fazer a etapa final calculando e exibindo passo a passo o calcula e valor final das raizes x1 e x2
	//calculando e exibindo raiz de x1, mostrando passo a passo as operacoes
        //e assim como a variavel delta desmembrei em 2 partes a expressao para poder exibir passo a passo o calculo da expressao
        //na variavel "x" foi feito do mesmo modo.
	System.out.println("-------------------------------------------");
	System.out.println("calculando a raíz de x1: \n");
	System.out.println("calculando a raíz de x1: (-b + raiz quadrada de delta) / (2 * a)");
	System.out.println("x1 = - ("+ b + " + " + "raiz quadrada de " + delta1 +") / (2 * " + a + ")");
	raiz = Math.sqrt(delta1);
	x1 = (-b + raiz);
	System.out.println("x1 = "+ x1 + " / (2 * " + a + ")");
	x2 = 2 * a;
	System.out.println("x1 = "+ x1 + " / " + x2);
	x1 = x1 / x2;
	System.out.println("x1 = " + x1);

				
	//calculando e exibindo raiz de x2, como apenas iremos inverter uma operacao: de adicao para
        // para subtracao utilizamos os mesmos valores nas duas variaveis "x"
	System.out.println("-------------------------------------------");
	System.out.println("calculando a raíz de x2: \n");
	System.out.println("calculando a raíz de x2: (-b + raiz quadrada de delta) / (2 * a)");
	System.out.println("x2 = - ("+ b + " - " + "raiz quadrada de " + delta1 +") / (2 * " + a + ")");
	x1 = (-b - raiz);
	System.out.println("x2 = "+ x1 + " / (2 * " + a + ")");
	x2 = 2 * a;
	System.out.println("x2 = "+ x1 + " / " + x2);
	x1 = x1 / x2;
	System.out.println("x2 = " + x1);
	 //terminado o calculo e exibicao dos resultados das 2 raizes, o programa se encerra,
        
	}
	else if (delta1 == 0 || delta1 < 0) //caso valor do delta for 0, tem apenas 1 raiz entao encerra,
	{                                   // OU delta menor que zero (negativo), nao ha raiz e tambem encerra o programa
	System.out.println("-----------------------------------------");
	System.out.println("a equação nao tem 2 raizes, o sistema so calcula se houver 2 raizes! \n ENCERRANDO!!");
	
	}
	
    }
}
