package com.company;

public class fourth_task {
    static class Point {
         static int x = 2;
    }
    static class Test extends Point {
        double x = 4.7;
        void printBoth() {
            System.out.println(x + " " + super.x);
        }
        public static void main(String[] args) {
            Test sample = new Test();
            sample.printBoth();
            System.out.println(sample.x +" " + Point.x);
        }
    }
}

