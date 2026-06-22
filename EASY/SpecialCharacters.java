import java.util.*;
public class SpecialCharacters {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a line:");
        String str = sc.nextLine();
        int count = 0;
        System.out.println("Special characters:");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(!Character.isLetterOrDigit(ch) && ch!= ' '){
                System.out.println(ch + " ");
                count++;
            }
        }
        System.out.println("\nNumber of Special Characters:"+count);
    }
}
