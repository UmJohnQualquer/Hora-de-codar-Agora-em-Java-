import java.util.Scanner;
        
public class atividade2 {
        // Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        
        System.out.print("Digite seu nome: ");
        nome = input.next();
        
        System.out.printf("Olá, " + nome + "\n");
        
    }
}