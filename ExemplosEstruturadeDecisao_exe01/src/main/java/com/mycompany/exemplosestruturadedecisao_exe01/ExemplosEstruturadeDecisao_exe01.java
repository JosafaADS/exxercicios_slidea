/*Escreva um algoritmo que solicite um número inteiro ao usuário e mostre-o caso omesmo seja par

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplosestruturadedecisao_exe01;
import java.util.Scanner;
/**
 *
 * @author jos
 */
public class ExemplosEstruturadeDecisao_exe01 
{

    public static void main(String[] args) 
    {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero para saber se é par: ");
        num = entrada.nextInt();
        
        if (num % 2 == 0)
        {
            System.out.println("O numero é par!");
        }
        else
        {
            System.out.println("O numero é impar!!");
        }
    }
}
