import java.util.Scanner;

public class atividade4_5 {



   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base;
        int altura;
        
        System.out.print("Digite a base do paralelograma: ");
        base = input.nextInt();

        System.out.print("Digite a altura do paralelograma: ");
        altura = input.nextInt();

        int area = base * altura;
        
        System.out.println("A área do paralelograma é: " + area);
        
    }
}