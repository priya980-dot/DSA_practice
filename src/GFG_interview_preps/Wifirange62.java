package GFG_interview_preps;

public class Wifirange62 {
    public static void main(String[] args) {
        RR("","abab");
    }
    static void RR(String pro,String unpro){
        char ch=unpro.charAt(0);
        for (int i = 0; i <unpro.length() ; i++) {
            String s=unpro.substring(1);
            reverse(s);
            System.out.println(s);
        }





    }

    private static void reverse(String s) {

        new StringBuffer(s).reverse().toString();
    }
}
