package jungsuck.ch7;

public class Overriding_toString {

    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint();
        myPoint.x = 3;
        myPoint.y = 5;

        System.out.println(myPoint);
    }
}

class MyPoint extends Object{
    int x;
    int y;

    public String toString(){
        return "x :"+x+" y :" +y;
    }
}
