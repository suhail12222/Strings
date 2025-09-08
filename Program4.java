package Strings;
//What will be output:
//
//StringBuilder sb = null;
//
//sb.append("abc");
//
//System.out.println(sb);
public class Program4 {
    public static void main(String[] args) {

        StringBuilder sb = null;

        sb.append("abc");//nullPointerException

        System.out.println(sb);
    }
}
