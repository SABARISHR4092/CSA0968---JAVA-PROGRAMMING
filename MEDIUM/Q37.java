import java.util.Scanner;
class PowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = sc.nextDouble();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        double result = Math.pow(x, n);
        System.out.printf("Result = %.5f", result);
    }
}
