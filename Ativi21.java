import java.util.Scanner;

public class Ativi21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}
