package Strings;
//WAJP to take a String input get length of String
//without using length() method in at least four
//different ways.
public class Program2 {
    public static void main(String[] args){
          String str="Hello World";
          int length1=getLength(str);
        System.out.println("Length of string is :"+length1);
      int count2=getLength2(str);
        System.out.println("Length of string is :"+count2);
        int count3=getLength3(str);
        System.out.println("Length of string is :"+count3);
        int count4=getLength4(str);
        System.out.println("Length of string is :"+count4);
    }
    public static int getLength(String str){
        int count=0;
        for (char ch:str.toCharArray()){
            count++;
        }
        return count;
    }
    public static int getLength2(String str){
        int count=0;
        while(true){
            try{
                str.charAt(count);
                count++;
            }
            catch (Exception e){
                break;
            }
        }
        return count;
    }
    public static int getLength3(String str){
        int count=0;
        for(int i=0;;i++){
            try{
                str.charAt(i);
                count++;
            }catch (Exception e){
                break;
            }
        }
        return count;
    }
    public static int getLength4(String str){
        int count=0;
        char[] ch=str.toCharArray();
        for (char c: ch){
            count++;
        }
        return count;
    }
}
