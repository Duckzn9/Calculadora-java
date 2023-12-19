//Calculadora by duck
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma, subtrair, multiplicar, dividir;

        System.out.println("Bem vindo a Calculadora de Duck");
        System.out.println("Digite o primeiro Numero");
        int number_1 = scanner.nextInt();
        System.out.println("Digite o segundo Numero: ");
        int number_2 = scanner.nextInt();
        
        System.out.println("Escolha uma operaçao: \n 1. Somar \n 2. Subtrair \n 3. Multiplicar \n 4. Dividir");
        int operacao = scanner.nextInt();
        
        if (operacao == 1) {
            soma = number_1 + number_2;
            System.out.printf("%d + %d = %d", number_1, number_2, soma);
        } else if (operacao == 2) {
            subtrair = number_1 - number_2;
            System.out.printf("%d - %d = %d", number_1, number_2, subtrair);
        } else if (operacao == 3) {
            multiplicar = number_1 * number_2;
            System.out.printf("%d * %d = %d", number_1, number_2, multiplicar);
        } else if (operacao == 4) {
            dividir = number_1 / number_2;
            System.out.printf("%d / %d = %d", number_1, number_2, dividir);
        } else {
            System.out.println("Numero Ivalido");
            System.out.println("Tente usar um Numero da Tabela");
        }
    }
}
