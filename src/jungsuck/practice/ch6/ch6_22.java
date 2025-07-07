package jungsuck.practice.ch6;

public class ch6_22 {
    static boolean isNumber(String str){
        boolean result = true;
        for (int i = 0; i < str.length() ; i++) {
            if ('1'<= str.charAt(i) && str.charAt(i) <= '9' ) continue;
            else result = false;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));

        str = "1234o";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));

    }

}
