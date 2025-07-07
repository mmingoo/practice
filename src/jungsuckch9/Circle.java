//package jungsuckch9;
//
//public class Circle implements Cloneable{
//    Point p;
//    int r;
//
//    public Circle (Point p, int r){
//        this.p = p;
//        this.r = r;
//    }
//
//
//
//    // 얕은 복사
//    public Circle shallowCopy(){
//        Object obj = null;
//
//        try {
//            obj = super.clone();
//
//        } catch (CloneNotSupportedException e) {}
//
//        return (Circle) obj;
//    }
//
//    //깊은 복사
//    public Circle deepCopy(){
//        Object obj = null;
//
//        try {
//            obj = super.clone();
//
//        } catch (CloneNotSupportedException e) {}
//        Circle c = new Circle(obj);
//        c.p = new Point(this.p.x, this.p.y);
//    }
//
//}
//
//class Point{
//    int x, y;
//
//    public Point(int x , int y){
//        this.x = x;
//        this.y = y;
//    }
//}
