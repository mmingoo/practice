package jungsuck.practice.ch7;

class Outer {
    static class Inner {
        int iv=100;
    }
}

public class ch7_25 {
    public static void main(String[] args) {
        Outer o = new Outer();
//        Outer.Inner ii = o.new Inner();
    }
}
