package com.company;

public class second_task {
    static class Point {
        static int x = 2;
    }
    static class Test extends Point {
        double x = 4.7;
        public static void main(String[] args) {
            new Test().printX();
        }
        void printX() {
            System.out.println(this.x + " И " + super.x);
        }
    }
}

