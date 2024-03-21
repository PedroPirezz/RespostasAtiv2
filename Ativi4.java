// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;


public class Ativi4 {
  public static void main(String[] args) {
     
    
    double PopA = 8000, PopB = 20000, anos = 0; 

    double taxaCrescimentoA = 0.03;
    double taxaCrescimentoB = 0.015;
       
    while (PopA <= PopB){
         
      PopA = PopA + (PopA*taxaCrescimentoA);
      PopB = PopB + (PopB*taxaCrescimentoB);
    
      anos = anos + 1;

    }
    System.out.println("Foram necessarios " + (int)anos + " anos para a população A ultrapassar a população B");
  } 
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
