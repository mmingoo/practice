package jungsuck.practice.ch7;

import java.util.Arrays;

public class ch7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new TV1());
        b.buy(new Computer());
        b.buy(new TV1());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer{
    int money = 1000;
    Product1[] cart = new Product1[3];
    int i = 0;


    void buy(Product1 product1) {
        if (money >= product1.price){
            money -= product1.price;
            add(product1);
        }else{
            System.out.println("잔액이 부족하여 "+product1+"을/를 살 수 없습니다.");
        }
    }

    void add(Product1 product1){
        if(i >=cart.length){
            // 배열길이 2배 배열 생성
            Product1[] new_cart = new Product1[cart.length*2];

            //복사
            for (int j = 0; j < cart.length ; j++) {
                new_cart[j] = cart[j];
            }

            // 장바구니 바꾸기
            cart = new_cart;

        }

        // 장바구니에 물건 추가 후 i ++
        cart[i] = product1;
        i++;

    }


    void summary() {

        // 사용한 물품 목락
        int totalPrice = 0;

        for (int j = 0; j < i; j++) {
            if (cart[j] != null) {
                if (j > 0) {
                    System.out.print(",");  // 첫 번째가 아니면 쉼표 추가
                }
                System.out.print(cart[j]);
                totalPrice += cart[j].price;
            }
        }

        System.out.println();
        // 구매 가격
        System.out.println("사용한 금액:"+ totalPrice);
        // 남은 가격
        System.out.println("남은 금액:"+money);
    }
}

class Product1{
    int price;

    Product1(int price){
        this.price = price;
    }
}



class TV1 extends Product1{
    TV1(){super(100);}
    public String toString(){return "TV1";}
}

class Computer extends Product1{
    Computer(){super(200);}
    public String toString(){return "Computer";}
}

class Audio extends Product1{
    Audio(){super(50);}
    public String toString(){return "Audio";}
}
