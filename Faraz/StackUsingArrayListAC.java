package com.Faraz;

import java.util.ArrayList;

public class StackUsingArrayListAC {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }


        public static void push(int data) {
            list.add(data);
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;

        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

}
