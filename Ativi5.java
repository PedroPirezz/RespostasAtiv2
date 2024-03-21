import java.util.Scanner;

public class Ativi5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double populacaoA, populacaoB, anos = 0;
        double taxaCrescimentoA, taxaCrescimentoB;

        System.out.println("Informe a população do Pais A");
        populacaoA = teclado.nextDouble();
        System.out.println("Informe a taxa de crescimento do Pais A");
        taxaCrescimentoA = teclado.nextDouble();

        System.out.println("Informe a população do Pais B");
        populacaoB = teclado.nextDouble();
        System.out.println("Informe a taxa de crescimento do Pais B");
        taxaCrescimentoB = teclado.nextDouble();

        // Convertendo as taxas de crescimento para a forma decimal
        taxaCrescimentoA = taxaCrescimentoA / 100.0;
        taxaCrescimentoB = taxaCrescimentoB / 100.0;

      

        if (taxaCrescimentoA < taxaCrescimentoB) {
            System.out.println("A população do país A nunca será maior, pois a sua taxa de crescimento é menor que a do país B");
        } else {
            while (populacaoA <= populacaoB) {
                populacaoA += populacaoA * taxaCrescimentoA;
                populacaoB += populacaoB * taxaCrescimentoB;
                anos++;
            }

            System.out.println("A população do país A ultrapassará a população do país B em " + (int)anos + " anos.");
        }
    }
}
