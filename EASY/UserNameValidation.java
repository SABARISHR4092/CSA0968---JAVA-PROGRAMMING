import java.util.*;
public class UserNameValidation {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user name:");
        String name1 = sc.nextLine();

        System.out.println("Re enter the user name");
        String name2 = sc.nextLine();

        if(name1.equals(name2)){
            System.out.println("User name is Valid");
        }
        else{
            System.out.println("User name is Invalid");
        }
    }
}
