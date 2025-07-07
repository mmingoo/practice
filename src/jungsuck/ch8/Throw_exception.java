package jungsuck.ch8;

// 예외 처리 후 예외 던지기
public class Throw_exception {
    public static void main(String[] args) throws Exception {

        try {
            method();
        } catch (Exception e) {
            System.out.println("메인 메서드에서 에러 처리");;
        }

    }

    static void method() throws Exception{
        try {
            Exception e = new Exception("메서드에서 에러 처리");
            throw e;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }

    }
}

