package jungsuck.ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack_queue {
    public static void main(String[] args) {
        Stack stack = new Stack<>();
        Queue queue = new LinkedList();
        stack.push(1);
        stack.push(2);
        stack.push("최");
        queue.offer(1);
        queue.offer(2);
        queue.offer("최");



        while (!stack.isEmpty()){
            System.out.println(stack.pop());

        }

        while (!queue.isEmpty()){
            System.out.println(queue.poll());

        }
    }
}
