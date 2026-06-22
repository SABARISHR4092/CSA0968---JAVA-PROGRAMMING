import java.util.*;
public class A1_MaxMinInArray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter "+n+" elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max = arr[0], min = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max) max = arr[i];
            if(arr[i]<min) min = arr[i];
        }
        System.out.println("Max e of the arr:"+max);
        System.out.println("Min e of the arr:"+min);
    }
}