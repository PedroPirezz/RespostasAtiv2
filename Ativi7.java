// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Ativi7 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    int cont = 1;
    int Num, maiorNum; 

    maiorNum = 0;
   
    
    while (cont <= 5){
      System.out.println("Digite o "+ cont + "º Número");
      Num = teclado.nextInt();

      if(Num > maiorNum){
        maiorNum = Num ;
      }

      cont++;
    }

    System.out.println("O maior número digitado foi "+ maiorNum);
  }
  
  }

