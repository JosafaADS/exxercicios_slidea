/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumo_medio;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author autologon
 */
public class Consumo_medio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        float distancia, qtd_combustivel, consumo_medio;//declarando as variaveis que recebera 
        //valores da distancia, combustivel em L, e retorna consumo medio
        
        
        Scanner entrada = new Scanner(System.in);//monta entrada de dados via teclado no terminal
        System.out.println("Digite a distancia percorrida: ");//solicita valor para distancia percorrida
        distancia = entrada.nextFloat();//valor digitado é armazenado na variavel distancia
        System.out.println("Digite a quantidade de combustivel (em litros): ");//solicita valor para qtd de combustivel
        qtd_combustivel = entrada.nextFloat();//valor digitado da quantidade de combustivel é armazenado na variavel qtd_combustivel
        
        consumo_medio = distancia / qtd_combustivel;//consumo medio recebe valor do calculo da distancia dividido pela qquantidade de combustivel
        
        System.out.println("Consumo medio do veiculo: " + consumo_medio + " km/L");//exibe resultado, consumo medio!!!
    }
    
}
