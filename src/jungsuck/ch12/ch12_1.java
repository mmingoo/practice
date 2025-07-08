package jungsuck.ch12;

import java.util.ArrayList;

class Fruit{
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit{
    @Override
    public String toString() {
        return "Apple";
    }
}

class Graph extends Fruit{
    @Override
    public String toString() {
        return "Graph";
    }
}


class Toy{
    @Override
    public String toString() {
        return "toy";
    }
}


public class ch12_1 {
    public static void main(String[] args) {
        Box<Fruit> fruitsBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<Apple>();
        Box<Toy> fruits = new Box<Toy>();

        fruitsBox.add(new Fruit());
        fruitsBox.add(new Apple());

        appleBox.add(new Apple());

        System.out.println(fruitsBox);
        System.out.println(fruitsBox.size());
        System.out.println(fruitsBox.get(1));



    }


}

class Box<E>{
    ArrayList<E> arrayList = new ArrayList<E>();
    public void add (E e){arrayList.add(e);}

    public  E get(int i){;
        return arrayList.get(i);
    }

    int size() {return arrayList.size();}

    public String toString(){return arrayList.toString();}
}