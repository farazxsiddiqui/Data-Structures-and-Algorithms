package com.Faraz;

public class QueueAC {
    public static void main(String[] args) {
        Queue q = new Queue(10);
        Queue.add(1);
        Queue.add(2);
        Queue.add(3);
        while (!Queue.isEmpty()) {
            System.out.println(Queue.remove());
        }
    }

    static class Queue {
        static int[] arr;
        static int size;
        static int rear = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static void add(int data) {
            if (rear == size - 1) {
                return;
            } else {
                rear++;
                arr[rear] = data;
            }

        }

        public static int remove() {
            if (isEmpty()) {
                return -1;
            } else {
                int front = arr[0];
                for (int i = 0; i < rear; i++) {
                    arr[i] = arr[i + 1];
                }
                rear--;
                return front;
            }
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            } else {
                return arr[0];
            }
        }

    }
}
