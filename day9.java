import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args){ //throws IOException {
    Scanner scanner = new Scanner(System.in);
    int num=scanner.nextInt();
    int factorial=fact(num);
    System.out.println(factorial);
    }


    static int fact(int n) {
        if(n>=1)
        {
        return n*fact(n-1);
        }
        else{
        return 1;
        }

        

    
    }
}
