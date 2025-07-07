package jungsuck.practice.ch7;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];


    SutdaDeck(){
        int idx = 0;
        // 초기화
        for (int j = 0; j < 2 ; j++) {
            for (int i = 1; i <= 10 ; i++) {
                if(j == 0){
                    if(i == 1 || i == 3 || i == 8){
                        cards[idx++] = new SutdaCard(i,true);
                    }else{
                        cards[idx++] = new SutdaCard(i,false);

                    }
                }else{
                    cards[idx++] = new SutdaCard(i,false);
                }
            }
        }

    }

    SutdaCard pick(int idx){
        return this.cards[idx];
    }

    SutdaCard pick(){
        int idx = (int)(Math.random()*9)+1;
        return this.cards[idx];
    }

    void shuffle(SutdaCard[] sutdaCard){
        int idx = 0;
        SutdaCard temp;
        for (int i = 0; i <sutdaCard.length ; i++) {
            idx = (int)(Math.random()*9)+1;
            temp = sutdaCard[i];
            sutdaCard[i] = sutdaCard[idx];
            sutdaCard[idx] = temp;

        }
    }
}

class SutdaCard{
    int num;
    boolean isKwang;
    SutdaCard(){
        this(1,true);
    }

    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + (isKwang ? "K":"");
    }
}

public class ch7_1 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        for (int i = 0; i <deck.cards.length ; i++) {
            System.out.println(deck.cards[i]+",");
        }
    }
}
