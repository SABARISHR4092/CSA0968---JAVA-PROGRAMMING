 class MultiCatchDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            int arr[] = {1, 2, 3};
            System.out.println(arr[5]);
            String str = null;
            System.out.println(str.length());
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception Caught");
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception Caught");
        }
    }
}
