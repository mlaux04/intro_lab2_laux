import java.util.Scanner; 

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int[] userValues = new int[20];   // List of integers from input

      /* Type your code here. */
      int i;
      int userLength;
      int recorderValue = 0;
      userLength = scnr.nextInt();
      
      
      //populator
      for (i = 0; i < userLength; ++i) {
         userValues[i] = scnr.nextInt();
      }
      for (i = 0; i < userLength/2; ++i) {
         if (userValues[i] == userValues[(userLength - 1 - i)]) {
            recorderValue = recorderValue + 1;
         }
         else {
            recorderValue = 0;
            break;
         }
      }
      
      if (userLength == 1) {
         recorderValue = 1;
      }
      
      if (recorderValue > 0) {
         System.out.println("yes");
      }
      else {
         System.out.println("no");
      }
      
            
      
     // System.out.print(userValues[3]);
	 scanner.close();
   }
}