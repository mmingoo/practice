//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;

class Animal {
    void eat() { System.out.println("동물이 먹어요"); }
}

class Dog extends Animal {
    void eat() { System.out.println("개가 먹어요"); }  // 오버라이딩
    void bark() { System.out.println("멍멍!"); }
}

// 핵심 예시

// 사용 예시
public class Main {
    public static void main(String[] args) {
        // 조상 타입의 참조변수로 자손 타입의 인스턴스 참조
        Animal animal = new Dog();
        Dog dof = (Dog)new Animal();

// 1. 메서드 호출 가능 여부 → 참조변수 타입(Animal)이 결정
        animal.eat();   // ✓ Animal에 eat()가 있으니까 호출 가능
//        animal.bark();  // ✗ Animal에 bark()가 없으니까 컴파일 에러

// 2. 실제 실행되는 메서드 → 객체 타입(Dog)이 결정
        animal.eat();   // "개가 먹어요" 출력 (Dog의 eat() 실행)
    }
}


