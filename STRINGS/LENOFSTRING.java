import java.util.*;
public class LENOFSTRING {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();

        System.out.println("Length using Built in method:"+str.length());

        int count = 0;
        for(char c : str.toCharArray()){
            count++;
        }
        System.out.println("Length without using builtin :"+count);
    }
}
