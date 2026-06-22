import java.util.*;
public class P9{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;

        while(num!=0){
            int digit = num % 10;
            sum+= digit * digit * digit;
            num/=10;
        }
        if(sum == original){
            System.out.println("Armstrong Number.");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}