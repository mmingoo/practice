package jungsuck.ch14;

import java.sql.SQLOutput;

@FunctionalInterface
interface MyFunction{
    void run();
}

//class LambdaEx{
//    static void execute(MyFunction f){
//        f.run();
//    }
//}
public class ch14_1 {

//    static MyFunction getMyFunction(){
//        MyFunction f = () -> System.out.println("f3.run");
//        return f;
//    }


    public static void main(String[] args) {
        // 람다식으로 구현
        MyFunction f1  = () -> System.out.println("f1.run");


//        // 익명 객체
//        MyFunction f2 = new MyFunction() {
//            public void run(){
//                System.out.println("f2.run");
//            }
//        };
//        // 클래스를 생성해서 넘겨도 됨
//        MyFunction f3 = getMyFunction();
        f1.run();
//        f2.run();
//        f3.run();
        System.out.println();
//        LambdaEx.execute(f1);
//        LambdaEx.execute(f3);
    };

}
