import java.util.*;
class ArrayExceptionDemo{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();

        int [] arr = new int[5];
        int sum=0;
        System.out.println("Enter elements:");
        for(int i=0;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        try{
            for(int i=0;i<=n;i++){
                sum+=arr[i];
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Caught.");
        }
        System.out.println("sum ="+sum);
    }
}