/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcula_desconto;

import java.util.Scanner;

public class Calcula_desconto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        float valor; //declarando as variveis que receberá o valor do produto e calcula o valor final apos acrescimo de desconto de 10%
        Scanner entrada = new Scanner(System.in);//monta entrada de dados via terminal teclado
        System.out.println("Digite o valor do produto: ");//pede pra digitar valor
        valor = entrada.nextFloat();//recebe valor do produto e guarda na variavel valor
        
        valor -= ((10 / valor) * 100);//calcula o valor - valor de desconto em cima do valor: Valor = Valor - ((10/valor)*100))
        
        System.out.println("Valor final com 10% de desconto: " + valor);//exibe valor final com desconto de 10%
        
    }
    
}
