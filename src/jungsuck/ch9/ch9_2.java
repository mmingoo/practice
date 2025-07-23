package jungsuck.ch9;

public class ch9_2 {

    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(1);

        System.out.println(person1 == person2);
    }


}

class Person{
    long id ;

    Person(long id){
        this.id = id;
        System.out.println(this.id);
    }
}
