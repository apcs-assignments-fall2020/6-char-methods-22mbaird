import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if (65<=ch && ch<=90){
            ch = (char)(ch+32);
            return ch;
        }
        else{
            return ch;
        }
        
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String str1 ="";
        
        for (int i = 0; i<str.length(); i++){
            char cha = str.charAt(i);
            if(cha>=65 && cha<=90){
                cha=(char)((cha+32));
                
            }
            str1=str1+cha;
            
       }
        return str;
    }


    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if (97<=ch && ch<=122){
            ch = (char)(ch-32);
            return ch;
        }
        else{
            return ch;
        }
        
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String str1="";
        
        for (int i = 0; i<str.length(); i++){
            char cha = str.charAt(i);
            if(cha>=97 && cha<=122){
                cha=(char)((cha-32));
                
            }
            str1=str1+cha;
            
       }
        return str;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("To upper str: ");
        String s1 = scan.next();
        System.out.println(myToUpperCase(s1));
        System.out.println("To lower str: ");
        String s2 = scan.next();
        System.out.println(myToLowerCase(s2));
        System.out.println("To upper ch: ");
        char c1 = scan.next().charAt(0);
        System.out.println(toUpper(c1));
        System.out.println("To lower ch: ");
        char c2 = scan.next().charAt(0);
        System.out.println(toLower(c2));
        scan.close();
    }
    
}
