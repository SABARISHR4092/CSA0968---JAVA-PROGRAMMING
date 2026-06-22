class MissingNumber{
    static void main(String[] args) {
        int [] arr = {1,2,3,5,6,8,9,7};
        int n = 8;
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int num:arr){
            actualSum += num;
        }
        int missing = expectedSum - actualSum;
        System.out.println("Missing number:"+missing);
    }
}
