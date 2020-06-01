import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int swap=0;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<(n-i);j++)
            {
                if(a[j-1]>a[j])
                {
                    int temp = a[j-1];  
                    a[j-1] = a[j];  
                    a[j] = temp; 
                   swap++;
                }
            }
        }

        System.out.println("Array is sorted in "+swap+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }

}
