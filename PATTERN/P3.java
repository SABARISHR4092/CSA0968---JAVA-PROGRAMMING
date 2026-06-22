import java.util.*;
public class P3{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number");
        int n = sc.nextInt();

        if(n<0){
            System.out.println("Invalid Number");
        }else{
            long fact = 1;
            for(int i=1;i<=n;i++){
                fact*=i;
            }
            System.out.println("Factorial = " +fact);
        }
    }
}