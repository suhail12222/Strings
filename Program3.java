package Strings;
//What will be output:
//
//StringBuffer sb = new StringBuffer("Java");
//
//sb.setCharAt(2, 'X');
//
//System.out.println(sb);
public class Program3 {
    public static void main(String[] arga){


        StringBuffer sb = new StringBuffer("Java");

        sb.setCharAt(2, 'X');//output will be jaXa becaue it replace the char at 2 th index and place this char

        System.out.println(sb);
    }
}
