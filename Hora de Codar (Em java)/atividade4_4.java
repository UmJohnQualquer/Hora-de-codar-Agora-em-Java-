import java.util.Scanner;

public class atividade4_4 {



   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basemaior;
        int basemenor;
        int altura;

        System.out.print("Digite o tamanho da base maior do trapézio: ");
        basemaior = input.nextInt();

        System.out.print("Digite o tamanho da base menor do trapézio: ");
        basemenor = input.nextInt();

        System.out.print("Digite a altura do trapézio: ");
        altura = input.nextInt();

        int area = ((basemaior + basemenor)* altura) / 2;
        
        System.out.println("A área do trapézio é: " + area);
        
    }
}