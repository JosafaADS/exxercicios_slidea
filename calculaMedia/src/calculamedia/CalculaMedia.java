/*##########PROGRAMA ESCRITO NA IDE NETBEANS########################
Crie um algoritmo que calcule a média aritmética de 4 números reais digitados pelo
usuário e exiba o resultado.
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculamedia;
import java.util.Scanner;
/**
 *
 * @author autologon
 */
public class CalculaMedia 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double n1, n2, n3, n4, media; //declara as variaveis do tipo Real n1, n2, n3, n4 e media 
        Scanner entrada = new Scanner(System.in);//monta o objecto que recebe entrada de dados via teclado
        System.out.println("###Calcula Media###"); //exibe saudacao inicial do programa
        System.out.println("------------------------------------");
        System.out.println("Digite nota 1");//solicita o valor para nota 01
        n1 = entrada.nextDouble(); //recebe o valor digitado da nota 01 no teclado e guarda na variavel n1
        System.out.println("Digite nota 2");//solicita o valor para nota 02
        n2 = entrada.nextDouble();//recebe o valor digitado da nota 02 no teclado e guarda na variavel n2
        System.out.println("Digite nota 3");//solicita o valor para nota 03
        n3 = entrada.nextDouble();//recebe o valor digitado da nota 03 no teclado e guarda na variavel n3
        System.out.println("Digite nota 4");//solicita o valor para nota 04
        n4 = entrada.nextDouble();//recebe o valor digitado da nota 04 no teclado e guarda na variavel n4
          
        media = (n1 + n2 + n3 + n4) / 4; //aqui é feito o calcula da media das 4 notas (n1 + n2 + n3 + n4 / 4) e guardado na variavel media
        System.out.println("Sua media final e: " + media); //exibe a media final.
        if (media <= 60 * media / 100) //verifica se a media é maior que 60% e se for
        {
            System.out.println("Voce esta aprovado");//se aprovado, exibe msg aprovado
            System.out.println("------------------------------------");
        }
        else // senao for maior que 60%
        {
            System.out.println("Voce esta reprovado");//exibe reprovado
            System.out.println("------------------------------------");
        }
    }
        // TODO code application logic here
}
    
