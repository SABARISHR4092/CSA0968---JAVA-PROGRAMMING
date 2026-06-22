import java.util.*;
public class compare2strings {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1 = sc.nextLine();
        System.out.println("Enter second string:");
        String str2 = sc.nextLine();

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Same string");
        }else{
            System.out.println("Not equal");
        }

        //Lexicographical comparison
        int result = str1.compareTo(str2);
        if(result == 0){
            System.out.println("Lexicographically equals");
        }else if (result<0){
            System.out.println("first string is Lexicographically smaller");
        }else{
            System.out.println("First string is Lexicographically greater");
        }
    }
}
