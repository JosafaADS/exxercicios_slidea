/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imc_;
import java.util.Scanner;//importando objeto que cria entrada de dados via teclado

/**
 *
 * @author autologon
 */
public class Imc_ {
        public static void main(String[] args) 
        {
            Scanner entrada = new Scanner(System.in);//montando objeto para entrada de dados via teclado
            float peso, altura, imc;//declarando variaveis onde ficara armazenado os valores do peso, altura e resultado IMC
            System.out.println("##Calcula IMC##");//imprimi uma saudacao inicial do programa
            System.out.println("Digite seu peso: ");//pedindo para digitar o peso
            peso = entrada.nextFloat();//armazenando o valor de peso na variavel peso.
            System.out.println("Digite sua altura utilizando ',': ");//pedindo para digitar altura e usando  virgulas
            altura = entrada.nextFloat();//armazenando o valor da altura na variavel altura.
            
            imc = peso / (altura * altura);//calcula o IMC e armazena o resultado na variavel imc
            System.out.println("----------------");
            System.out.println("Seu imc é: " + imc);//exibe o resultado do imc
            if (imc < 20)//verifica se imc é menor que 20, se sim entao
            {
                System.out.println("abaixo do peso");//exibe msg abaixo do peso
            }
            else if (imc < 25)//verifica se imc é menor que 25, se sim entao
            {
                System.out.println("peso normal");//exibe msg peso normal
            }
            else if (imc < 30)//verifica se imc é menor que 30, se sim entao
            {
                System.out.println("Sobrepeso");//exibe msg sobrepeso
            }
            else if (imc <= 40)//verifica se imc é menor ou igual que 40, se sim entao
            {
                System.out.println("Obeso");//exibe msg obeso
            }
            else //caso contrario, seja maior que 40 entao:
            {
                System.out.println("obeso morbido");//exibe msg obeso morbido
            }
           
        }
        
}
    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author autologon
 */
