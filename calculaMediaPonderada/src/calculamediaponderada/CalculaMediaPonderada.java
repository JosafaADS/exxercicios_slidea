/*#########PROGRAMA ESCCRITO EM IDEE  NETBEANS############
- Faça um algoritmo e um programa em Java que receba três notas,
calcule e mostrea média ponderada. Sabe-se que a primeira tem peso 1,
a segunda peso 2 e aterceira peso 4
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculamediaponderada;
import java.util.Scanner;
/**
 *
 * @author autologon
 */
public class CalculaMediaPonderada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double n1, n2, n3, mediaPonderada;//declarando as variaveis que receberam os valores das 3 notas e o resultado
        
        Scanner entrada = new Scanner(System.in);//montagem do objeto de entrada de dados via teclado.
        System.out.println("###Calcula Media###");//exibe saudacao inicial
        System.out.println("------------------------------------");
        System.out.println("Digite nota 1");//pedindo pra digitar valor da nota ponderada 01
        n1 = entrada.nextDouble();//recebe tudo que é digitado da nota na variavel n1
        System.out.println("Digite nota 2");//pedindo pra digitar valor da nota ponderada 02
        n2 = entrada.nextDouble();//recebe tudo que é digitado da nota na variavel n2
        System.out.println("Digite nota 3");//pedindo pra digitar valor da nota ponderada 03
        n3 = entrada.nextDouble();//recebe tudo que é digitado da nota na variavel n3
        
                  
        mediaPonderada = ((n1 * 1) + (n2 * 2) + (n3 * 4)) / (1 + 2 + 4);//calcula a media ponderada(peso 1 pra nota01, peso 2 para nota 02 e peso 4 para nota 03
        System.out.println("Sua media final e: " + mediaPonderada);//exibe media ponderada final
        if (mediaPonderada <= 60 * mediaPonderada / 100)//verifica se media ponderada é maior que 60%
        {
            System.out.println("Voce esta aprovado");//se for maior que 60¨entao mensagem aprovado
            System.out.println("------------------------------------");
        }
        else 
        {
            System.out.println("Voce esta reprovado");//caso contrario mensagem reprovado
            System.out.println("------------------------------------");
        }
        // TODO code application logic here
    }
    
}
