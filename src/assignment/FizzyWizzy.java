package assignment;

public class FizzyWizzy {
    public static void main(String[] args) {
        System.out.println(fizzyWizzy(1));
        System.out.println(fizzyWizzy(2));
        System.out.println(fizzyWizzy(3));
        System.out.println(fizzyWizzy(15));

    }
    public static String fizzyWizzy(int n){

        boolean fizz = n%3 == 0;
        boolean buzz = n%5 == 0;
       if (fizz && buzz) return "FizzBuzz!";
       if (fizz) return "Fizz!";
       if (buzz) return "Buzz!";
       return n+"!";
    }
}
