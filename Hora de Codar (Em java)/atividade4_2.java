import java.util.Scanner;

public class atividade4_2 {



   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lado;
        
        System.out.print("Digite o tamanho dos lados do quadrado: ");
        lado = input.nextInt();

        int area = lado * lado;
        
        System.out.println("A área do quadrado é: " + area);
        
    }
}