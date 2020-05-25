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
    int n=scanner.nextInt();
    String s;
    s=Integer.toBinaryString(n);
   int count=0;
   int pos=0;
    for(int i=0;i<s.length();i++)
        if(s.charAt(i)=='1')
        {
            count++;
            if(count>pos)
            pos=count;
        }
        else{
        count=0;
        }
   System.out.println(pos);
    }
}
