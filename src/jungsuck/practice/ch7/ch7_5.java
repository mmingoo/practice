package jungsuck.practice.ch7;


public class ch7_5 {
    public static void main(String[] args) {
        Tv tv = new Tv();
    }
}

class Product
{
    Product(){}
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint =(int)(price/10.0);
    }
}
class Tv extends Product {
    Tv() {}
    public String toString() {
        return "Tv";
    }
}
