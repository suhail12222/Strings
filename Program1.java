package Strings;

import java.util.Scanner;

//WAJP to take a String input and count all
//numeric characters in the String.
public class Program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       int result=countNumbericChar(str);
        System.out.println("Number of numberic charecter"+result);

    }
    public static int countNumbericChar(String str){
        int count=0;
       for (char ch :str.toCharArray()){
           if (Character.isDigit(ch)){
               count++;
           }
       }
       return count;
    }
}
