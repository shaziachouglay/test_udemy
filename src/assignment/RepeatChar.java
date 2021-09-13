package assignment;

public class RepeatChar {
    public static void main(String[] args) {
        System.out.println(repeatChar("the"));
        System.out.println(repeatChar("AAbb"));
        System.out.println(repeatChar("Hi"));
    }
    public static String repeatChar(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++){
            char aChar = str.charAt(i);
            result = result + aChar + aChar;
        }
        return result;

    }
}
