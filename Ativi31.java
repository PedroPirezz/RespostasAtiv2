// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Ativi31 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    int Num; 
    
    System.out.println("Digite uma note entre 0 e 10");
     Num = teclado.nextInt();
    
    while (Num < 0 || Num > 10){
      System.out.println("Nota invalída, Digite uma nota entre (0-10)");
      Num = teclado.nextInt();
    }
    System.out.println("Nota válida");



  }

    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
