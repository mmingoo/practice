//package jungsuck.ch11;
//
//import java.util.Scanner;
//
//public class ch11_11 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        final int MAX_SIZE = 5;
//        System.out.println("help를 입력하면 도움말을 볼 수 있습니다");
//
//        while(true){
//            try{
//                System.out.print(">>");
//                String input = sc.nextLine();
//
//                if ("".equals(input)) continue;
//                if (input.equals("q")||input.equals("Q")) break;
//                else if (input.equals("help")) {
//                    System.out.println(" help - 도움말을 보여줍니다.");
//                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
//                    System.out.println(" history - 최근에 입력한 명령어 "+ MAX_SIZE +"개를 보여줍니다");
//
//                }else
//
//
//            }catch () catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//
//        }
//
//    }
//}
