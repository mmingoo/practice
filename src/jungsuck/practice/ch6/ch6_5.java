package jungsuck.practice.ch6;

public class ch6_5 {
    public static void main(String[] args) {
        Student student = new Student("민",1,2.0f);

        System.out.println(student.info());
    }
}

class Student{
    String name;
    int math;
    float score;

    Student(String name, int math, float score){
        this.name = name;
        this.math = math;
        this.score = score;
    }
    public String info(){
        return name + "," +math + score;
    }
}
