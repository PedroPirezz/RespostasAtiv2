// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Ativi8 {
  public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    int cont = 1;
    double Soma = 0, Media, Num; 

    while (cont <= 5){
      System.out.println("Digite o "+ cont + "º Número");
      Num = teclado.nextInt();
      Soma = Soma + Num;
      cont++;
    }

    Media = Soma/5;
    
    System.out.println("Soma: " + Soma);
    System.out.println("Média: " + Media);
  }
  
  }

