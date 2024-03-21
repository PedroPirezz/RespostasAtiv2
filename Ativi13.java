// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Ativi13 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    int Base, Expoente, Resultado  ; 
    
    System.out.println("Digite um número para a Base");
     Base = teclado.nextInt();

     System.out.println("Digite um número para o Expoente");
     Expoente = teclado.nextInt();
  
    Resultado = Base * Base;

    for (int index = 2; index < Expoente; index++)
    {
 Resultado *= Base ;
    }
   

    System.out.println("O resultado da potenciação foi " + Resultado);


  }

    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
