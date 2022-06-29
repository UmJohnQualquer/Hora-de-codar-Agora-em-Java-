import java.util.Scanner;

public class atividade4_1 {



   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base;
        int altura;
        
        System.out.print("Digite a base do retângulo: ");
        base = input.nextInt();

        System.out.print("Digite a altura do retângulo: ");
        altura = input.nextInt();

        int area = base * altura;
        
        System.out.println("A área do retângulo é: " + area);
        
    }
}