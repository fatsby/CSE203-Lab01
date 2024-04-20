import java.util.Scanner;

public class HailstoneSequence {
   private long input;

   public HailstoneSequence() {

   }
   public HailstoneSequence(long input) {
       this.input = input;
   }

   public void executeHailstone() {
       while (input != 1) {
           if (input % 2 == 0) {
               System.out.print(input + " is even, so we take " + input + "/2 = ");
               input /= 2;
               System.out.println(input);
           } else{
               System.out.print(input + " is odd, so we take " + input + "*3+1 = ");
               input = input*3+1;
               System.out.println(input);
           }
       }
   }

}
