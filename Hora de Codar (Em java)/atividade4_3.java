import java.util.Scanner;

public class atividade4_3 {



   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int diagonalmaior;
        int diagonalmenor;
        
        System.out.print("Digite o tamanho do diagonal maior: ");
        diagonalmaior = input.nextInt();

        System.out.print("Digite o tamanho do diagonal menor: ");
        diagonalmenor = input.nextInt();

        int area = (diagonalmaior * diagonalmenor) / 2;
        
        System.out.println("A área do losango é: " + area);
        
    }
}