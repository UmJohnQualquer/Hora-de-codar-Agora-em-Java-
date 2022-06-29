import java.util.Scanner;
        
public class atividade3 {
 // 3
        //Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]"
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;
        
        System.out.print("Digite seu nome: ");
        nome = input.next();

        System.out.print("Digite sua idade: ");
        idade = input.nextInt();
        
        System.out.printf("Olá, " + nome + ". Você tem " + idade + " anos." + "\n");
        
    }
}