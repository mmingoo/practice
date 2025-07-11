package jungsuck.practice.ch6;

public class ch6_22 {
    static boolean isNumber(String str){
        for (int i = 0; i < str.length() ; i++) {
            if (!('1'<= str.charAt(i) && str.charAt(i) <= '9') )
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));

        str = "1234o";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));

    }

}
