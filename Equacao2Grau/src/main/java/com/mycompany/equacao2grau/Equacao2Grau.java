/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.equacao2grau;
import java.util.Scanner;
import java.io.*;
import java.lang.Math;
/**
 *
 * @author jos
 */
public class Equacao2Grau 
{

    public static void main(String[] args) 
    {
        double x1, x2, delta1, delta2, a, b, c, raiz;
	Scanner entrada = new Scanner(System.in);
	while(true) 
	{
            System.out.println("###SISTEMA CALCULA RAIZES DA EQUACAO DE 2º###");
            System.out.println("### ax elevado ao 2 + bx +c ###");
            System.out.println("Digite os valores dos coeficientes: \n a).: ");
            a = entrada.nextDouble();
            System.out.println("b).: ");
            b = entrada.nextDouble();
            System.out.println("c).: ");
            c = entrada.nextDouble();
						
	//envia os parametros para a classe calc_equacao
	//onde o metodo calcula_delta recebe valores(atributos) do tipo reais nos parametros a, b, c
	// o metodo calcula os valor do delta recibido via os parametros a,b,c e verifica quantas raizes tem a equacao
	//apos calcular o delta ela chama o metodo calcula_raizes e envia os valor calculado do delta e
	//o valor de cada coeficiente dado (a, b, c)
            calc_equacao.calcula_delta(a, b, c);
			
	}
				
    }
    public class calc_equacao
    {
	public static void calcula_delta(double a, double b, double c) 
	{
	//exibindo passo a passo as operacoes
	//delta = (b elevado ao quadrado) - (4 * a * c);

	//este metodo apos receber os valores do coeficientes dados na entrada de dados no inicio do sistema,
	//os valores recebidos no parametros do metodo a, b, c
	//exibe cada coeficiente
            double delta1;
            double delta2;
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
		
		
	//apos receber e exibir os valores dos coeficientes iremos calcular o valor do delta
	//sempre exibindo passo a passo de cada operacao
            delta1 = (Math.pow(b, 2));
            System.out.println("delta = " + delta1 + " -(4" + " * " + a + " * " + c +")");
            delta2 = 4 * a * c;
            System.out.println("delta = " + delta1 + " - " + delta2);
            delta1 = delta1 - delta2;
            System.out.println("Delta = " + delta1);
		
		
	//verificando quantas raízes há na equacao
            if (delta1 > 0) 
            {
		System.out.println("-----------------------------------------");
		System.out.println("a equação tem 2 raizes");
	//agora apos calcular o delta e termos os valores dos coeficientes declarados
	//chamamos daqui de dentro do metodo calcula_delta()
	//o metodo calcula raiz, onde ira calcular e exibir passo a passo seu calcula e resultado final.
		calcula_raiz(delta1, a, b, c);
            }
            else if (delta1 == 0) 
            {
		System.out.println("-----------------------------------------");
		System.out.println("a equação tem 1 raiz, o sistema so calcula se houve 2 raizes digite novamente \n os coeficientes: ");
		System.out.println("--------reinicio-----------");
            }
            else if (delta1 < 0) 
            {
		System.out.println("-----------------------------------------");
		System.out.println("a equação nao tem raizes,  o sistema so calcula se houve 2 raizes digite novamente \n os coeficientes: ");
		System.out.println("--------reinicio-----------");
            }
		
	}
	
	
	public static void calcula_raiz(double delta1, double a, double b, double c) 
	{
            double x1;
            double x2;
            double raiz;
	//agora que recebemos o valor do delta e do coeficientes a, b, c
	//vamos fazer a etapa final calculando e exibindo passo a passo o calcula e valor final das raizes x1 e x2
	//calculando e exibindo raiz de x1, mostrando passo a passo as operacoes
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
            
	//calculando e exibindo raiz de x2, mostrando passo a passo as operacoes
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
        //chamando metodo classificacao_equacao que ira verificar e responder o tipo da equacao de segundo grau
			//como completas ou incompletas
            calc_equacao.classificacao_equacao(a, b, c);
		
	//apos fim da exibicao das raizes  e a classificacao do tipo da equacao 
	//o sistema retorna ao estado inicial requerindo novamente os dados para realizar
	//novo valores de coeficientes para calcula novamente 
	}
	public static void classificacao_equacao(double a, double b, double c)
	{
            if (a != 0 && b != 0 && c != 0)
            {
		System.out.println("-----------------------");
		System.out.println("Esta é uma Equacao Completa");
		System.out.println("-----------------------");
		System.out.println("--------reinicio-----------");
            }
            else if (a != 0 || b == 0 || c == 0) 
            {
		System.out.println("-----------------------");
		System.out.println("Esta é uma Equacao Incompleta");
		System.out.println("-----------------------");
		System.out.println("--------reinicio-----------");
            }
            else
            {
		System.out.println("-----------------------");
		System.out.println("Esta é uma Equacao Incompleta");
		System.out.println("-----------------------");
		System.out.println("--------reinicio-----------");
            }
                
	}

    }

}

