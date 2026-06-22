import java.util.*;
public class P2{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter values:");
        int n = sc.nextInt();

        int limit = 0;

        int sum = 0;
        int a =0 , b=1;

        for(int i=0;i<=limit;i++){
            if(i % 2 ==0)
                sum+=a;
            int c = a+b;
            a=b;
            b=c;
        }
        System.out.println("Sum:"+sum);
    }
}