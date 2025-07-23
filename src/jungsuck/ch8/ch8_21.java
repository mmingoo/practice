package jungsuck.ch8;

import javax.swing.*;

public class ch8_21 {
    public static void main(String[] args) {
        try{
            startInstall();
        }catch (SpaceException e){
            System.out.println(e.getMessage());
            System.out.println("공간을 확보한 후 설치해주세요!");
        } catch (MemoryException e) {
            System.out.println("메모리 확보한 후 다시 설치해주세요!");;
        }
    }

    private static void startInstall() throws SpaceException,MemoryException {

        boolean enoughSpace = false;
        boolean MemorySpace = false;

        if(!enoughSpace){
            throw new SpaceException("저장 공간이 부족합니다!");
        }

        if(!MemorySpace){
            throw new MemoryException("저장 공간이 부족합니다!");
        }

    }
}

class SpaceException extends Exception{
    SpaceException(String msg){
        super(msg);
    }
}

class MemoryException extends Exception{
    MemoryException(String msg){
        super(msg);
    }
}