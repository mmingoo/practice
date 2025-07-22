package jungsuck.ch8;

// 예외 던지기 예제
public class ch8_9 {
    public static void main(String[] args){
        try{
            creatException();
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("메서드에서 넘어온 예외 처리");
        }


    }

    public static void creatException() throws Exception {
        System.out.println("해당 메서드에선 예외처리를 하지 않습니다");
        Exception exception = new Exception("예외 메세지를 호출했습니다.");
        throw  exception;
    }

}
