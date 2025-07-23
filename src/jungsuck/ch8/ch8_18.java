package jungsuck.ch8;

public class ch8_18 {
    public static void main(String[] args) {
        method1();
        System.out.println("method1를 종료하고 main에서 종료합니다.");
    }

    static void method1(){
        try{
            System.out.println("method1이 호출되었습니다.");
            System.out.println("return 이 호출됩니다.");
            return;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("finally 문이 실행됩니다.");
        }
    }
}
