// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Ativi10 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    int NumA, NumB; 
    

    System.out.println("Digite o promeiro Número");
    NumA = teclado.nextInt();

    System.out.println("Digite o Segundo Número");
    NumB = teclado.nextInt();

    if (NumA == NumB)
    {
      System.out.println("Os número são iguais");
    }
    else if(NumA < NumB)
    {
      System.out.println("NumA e Menor");
      for(int index = NumA; index <= NumB; index++){
        System.out.print(index + " ");
      }
    }
    else
    {
      System.out.println("NumA e maior");
      for(int index = NumA; index >= NumB; index--){
        System.out.print(index + " ");
      }
    }
   

    
    




  }

    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
