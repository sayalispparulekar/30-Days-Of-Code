import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int t = s.nextInt();
        s.nextLine();
      for (int i = 0; i < t; i++) 
      {
          
       String str = s.nextLine();
        char[] charArray = str.toCharArray();

            for (int j = 0; j < charArray.length; j++) 
            {
                if (j % 2 == 0) 
                {
                    System.out.print(charArray[j]);
                }
            }

            System.out.print(" ");

            for (int j = 0; j < charArray.length; j++) 
            {
                if (j % 2 != 0) 
                {
                    System.out.print(charArray[j]);
                }
            }
              System.out.println();
        }
    }
}