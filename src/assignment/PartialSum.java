package assignment;

public class PartialSum {
    public static void main(String[] args) {
        System.out.println(partialSum(1,2,3));
        System.out.println(partialSum(1,2,13));
        System.out.println(partialSum(1,13,3));
    }
    public static int partialSum(int a, int b, int c){
        if (a == 13) return 0;
        if (b == 13) return a;
        if (c== 13) return a+b;
        return a+b+c;
    }
}
