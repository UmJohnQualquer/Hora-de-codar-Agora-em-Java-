import java.util.Scanner;

public class atividade4_6 {



   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base;
        int altura;
        
        System.out.print("Digite a base do triângulo: ");
        base = input.nextInt();

        System.out.print("Digite a altura do triângulo: ");
        altura = input.nextInt();

        int area = (base * altura) / 2;
        
        System.out.println("A área do triângulo é: " + area);
        
    }
}