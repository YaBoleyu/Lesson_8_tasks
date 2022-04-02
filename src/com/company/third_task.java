package com.company;

public class third_task {
    static class Point {
        static int x = 2;
    }
   static class Test extends Point {
        static double x = 4.7;
        public static void main(String[] args) {
            new Test().printX();
        }
        void printX() {
            System.out.println(super.x + " и "+ super.x);
        }
    }

}
