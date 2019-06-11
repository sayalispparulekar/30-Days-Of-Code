import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int result[];
        result = new int[10];
        int index = 0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        result[index] = 0;
        for(int i=1;i<=10;i++)
        {
           result[index] = n*i;
            index++;
        }
        for(index=0;index<10;index++)
        {
            System.out.println(+n+ " x " +(index+1)+" = " +result[index]);
        }
        scanner.close();
    }
}
