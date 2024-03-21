/*Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd'; */


import java.util.Scanner;


public class Ativi3 {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String Nome;
        int Idade;
        double Salario;
        char Sexo, EstadoCivil;

        System.out.println("Qual é o seu nome");
        Nome = teclado.nextLine();

        System.out.println("Qual é a sua idade");
        Idade = teclado.nextInt();

        System.out.println("Informe seu salario");
        Salario = teclado.nextDouble();

        System.out.println("Informe seu sexo");
        Sexo = teclado.next().charAt(0);
        
        System.out.println("Informe seu Estado cívil");
        EstadoCivil = teclado.next().charAt(0);
        

        
            while (Nome.length()<=3) {
                System.out.println("Seu nome precisa ter no minimo 3 caracters");
                Nome = teclado.nextLine();
            }

            while (Idade < 0 || Idade > 150) {
                System.out.println("Sua idade tem que estar entre 0 e 150");
                Idade = teclado.nextInt();
            }
        
            while (Salario < 0) {
                System.out.println("Seu Salario tem que ser maior que 0");
                Salario = teclado.nextDouble();
            }

            while (Sexo != 'm' && Sexo != 'f') {
                System.out.println(Sexo);
                System.out.println("Específique seu sexo (f ou m)");
                Sexo = teclado.next().charAt(0);
            }

            while (EstadoCivil != 's' && EstadoCivil != 'c' && EstadoCivil != 'v' && EstadoCivil != 'd') {
                System.out.println("Específique seu estado cívil (s, c, d ou v)");
                EstadoCivil = teclado.next().charAt(0);
            }


            System.out.println("Prontinho, Todos os seus dados foram validados com sucesso");




    }
}
