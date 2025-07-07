package jungsuck.quiz;

import jungsuck.ch4.Math_random;

import java.util.Arrays;

public class DeckTest {
    public static void main(String[] args) {

        Deck d = new Deck();  //카드 한 벌(Deck)을 만든다 -> 카드 52 개 생성
        Card c = d.pick(11); // 섞기 전에 제일 위의 카드를 뽑는다

        Card[] my_card = new Card[5];

        //카드 5장 랜덤으로 뽑기
        for(int i = 0; i<5; i++){
            d.shuffle(); // 카드를 섞는다
            c = d.pick(0); // 섞은 후에 제일 위의 카드를 뽑는다
            my_card[i] = c;
        }

        for(int i = 0; i< my_card.length; i++){
            System.out.println(my_card[i].number);
        }

        //카드 판단



    }


}

class Deck{
    final int CARD_NUM = 52; // 카드의 개수
    Card cardArr[] = new Card[CARD_NUM]; //Card 객체 배열을 포함

    // Deck 카드 초기화
    Deck(){
        int i = 0;

        for(int k = Card.KIND_MAX; k > 0; k--){
            for(int n = 0; n<Card.NUM_MAX; n++){
                cardArr[i++] = new Card(k,n+1);
            }
        }
    }

    // 지정된 위치에 있는 카드 하나를 꺼내서 반환
    Card pick(int index){
        return cardArr[index];
    }

    // Deck 에서 랜덤으로 카드 하나를 선택한다
    Card pick(){
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }

    // 카드의 순서를 섞는다
    void shuffle(){
        for(int i = 0; i< cardArr.length; i++){
            int r = (int)(Math.random()*CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}

class Card{
    static final int KIND_MAX = 4; // 카드 무늬수
    static final int NUM_MAX = 13; // 무늬별 카드 수

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 3;
    static final int CLOVER = 3;

    int kind;
    int number;

    Card(){
        this(SPADE, 1);
    }

    Card(int kind, int number){
        this.kind = kind;
        this.number = number;
    }

    public String toString(){
        String [] kinds = {"","CLOVER","HEART","DIAMOD","SPADE"};
        String numbers = "0123456789XJQK";
        return "kind : "+ kinds[this.kind] + ", number : "+ numbers.charAt(this.number);
    }



}




// 카드 관련 기능
class Card_function{

    // 카드 판단 메서드
    public String rank_check(Card[] cards){

        // 정렬
        Arrays.sort(cards);

        //같은 무늬 5장 - STRAIGHT FLUSH 체크
        for(int i = 1; i<cards.length+1; i++) {

            // 반복문 동안 전 카드와 무늬가 같고 숫자가 같다면 STRAIGHT FLUSH 반환
            if (cards[i - 1].kind != cards[i].kind || cards[i - 1].number != cards[i].number - 1) {
                break;
            }

            //무사히 반복문 다 돌면 반환
            if(i==6) {
                return "STRAIGHT FLUSH";
            }

        }

        // 같은 숫자 4장 - FOUR CARD 체크
        for(int i = 1; i<cards.length; i++) {
            int cnt = 0;

            //전 숫자와 같다면 cnt ++
            if (cards[i - 1].number == cards[i].number) {
                cnt ++;
            }

            // 숫자가 4개라면 FOUR CARD 반환
            if(cnt == 4) {
                return "FOUR CARD";
            }

        }

        int same0_cnt = 0;
        int same1_cnt = 0;

        // 같은 숫자 3장 + 같은 숫자 2장 체크 - FULL HOUSE
        for(int i = 2; i<cards.length+1; i++) {
            // 0 인덱스와 같다면 cnt ++
            if (cards[i] == cards[0]) {
                same0_cnt++;
            }
            // 1 인덱스와 같다면 cnt ++
            else if (cards[i] == cards[1]) {
                same1_cnt++;
            } else if (i == 6) {
                if ((same0_cnt == 3 && same1_cnt == 2) || (same0_cnt == 2 && same1_cnt == 3)) {
                    return "FULL HOUSE";
                }
            }

        }

            // 나머지
            return "NONE";
        }
    }




