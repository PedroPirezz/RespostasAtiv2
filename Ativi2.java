
import java.util.Scanner;

public class Ativi2 {

    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);
        
        String Nome, Email; 
        
        System.out.println("Digite seu Nome");
         Nome = teclado.nextLine();

         System.out.println("Digite seu Email");
         Email = teclado.nextLine();

         
         
            while (Nome.equals(Email)) {

                System.out.println("O nome de usuario não pode ser igual ao email");

                System.out.println("Digite seu Nome");
         Nome = teclado.nextLine();

         System.out.println("Digite seu Email");
         Email = teclado.nextLine();
                
            }
       
            System.out.println("Cadastro realizado com sucesso");
         
        
       
        
    
    
    
      }
    
    
}
