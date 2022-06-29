import java.util.Scanner;

public class atividade4_7 {



   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        int raio;
        
        System.out.print("Digite o tamanho do raio do círculo: ");
        raio = input.nextInt();

        double area = pi * raio;
        
        System.out.println("A área do círculo é: " + area);
        
    }
}