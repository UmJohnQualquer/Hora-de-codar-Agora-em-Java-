import java.util.Scanner;

public class atividade8 {
    //Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero nem negativo e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. 
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valor1;
        double valor2;
        
        System.out.print("Digite o primeiro número: ");
        valor1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        valor2 = input.nextInt();


        if (valor2 == 0) {
            int valor3;

            System.out.println("O segundo valor informado não pode ser igual a zero!");
            System.out.print("Digite novamente o segundo número: ");
            valor3 = input.nextInt();

            double resultado = valor1 / valor3;

            System.out.println("A divisão do primeiro valor pelo segundo valor é igual a: " + resultado);


        }

        else {

            double resultado = valor1 / valor2;

            System.out.println("A divisão do primeiro valor pelo segundo valor é igual a: " + resultado);

        }

               
    }
}