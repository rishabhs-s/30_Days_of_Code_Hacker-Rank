import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    if(N%2==1 ||(N>=6 &&N<=20))
    {
        System.out.println("Weird");
    }
    else
    {
        System.out.println("Not Weird");
    }



   


   
        scanner.close();
    }
}
