package test;

class Animal {
    void eat() { System.out.println("동물이 먹어요"); }
}

class Dog extends Animal {
    void eat() { System.out.println("개가 먹어요"); }  // 오버라이딩
    void bark() { System.out.println("멍멍!"); }
}


class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.toString());
    }
}