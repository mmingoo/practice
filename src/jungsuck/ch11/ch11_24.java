package jungsuck.ch11;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ch11_24 {
    public static void main(String[] args) {

        Set set = new HashSet();
//        set.add(new String("abc"));
//        set.add(new String("abc"));
//        set.add(new Person("david",20));
//        set.add(new Person("david",20));

        Person p1 = new Person("david",20);
        Person p2 = new Person("david",20);

        System.out.println(p1.hashCode() == p2.hashCode());
        System.out.println(p1.hashCode());

    }
}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
        if(obj instanceof Person p){
            return name.equals(p.name) && age == p.age;
        }

        return false;
    }

    public int hashCode(){
        return Objects.hash(this.name + age);
    }

    public String toString(){
        return name +":"+ age;
    }
}