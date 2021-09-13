package assignment;

public class IsCool {
    public static void main(String[] args) {
        System.out.println(isCool(23));
        System.out.println(isCool(24));
        System.out.println(isCool(22));
    }

    public static boolean isCool(int n){
        return (n%11 == 0)||(n%11 ==1);
    }


}
