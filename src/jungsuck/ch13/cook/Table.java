package jungsuck.ch13.cook;

import java.util.ArrayList;

class Table {
    String[] dishNames = { "donut","donut","burger" }; // donut이 더 자주 나온다.
    final int MAX_FOOD = 6;  // 테이블에 놓을 수 있는 최대 음식의 개수

    private ArrayList<String> dishes = new ArrayList<>();

    public void add(String dish) {
        // 테이블에 음식이 가득찼으면, 테이블에 음식을 추가하지 않는다.
        if(dishes.size() >= MAX_FOOD)
            return;
        dishes.add(dish);
        System.out.println("Dishes:" + dishes.toString());
    }

    public boolean remove(String dishName) {
        // 지정된 요리와 일치하는 요리를 테이블에서 제거한다.
        for(int i=0; i<dishes.size();i++)
            if(dishName.equals(dishes.get(i))) {
                dishes.remove(i);
                return true;
            }

        return false;
    }
    public int dishNum() { return dishNames.length; }
}