import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        try{
            int i=Integer.parseInt(s);
            System.out.print(i);
        }
        catch(Exception e)
        {
            System.out.print("Bad String");
        }


    }
}
