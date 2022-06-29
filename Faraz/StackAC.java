package com.Faraz;

import java.util.Stack;

public class StackAC {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(11);
        s.push(111);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
