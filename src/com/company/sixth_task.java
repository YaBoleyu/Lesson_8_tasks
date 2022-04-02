package com.company;
//java: incompatible types: com.company.Test cannot be converted to com.company.T2 выпадает, пока не нашёл решения чё делать с этим
public class sixth_task extends  T1{
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(((T2) t).print());
    }

    String print() {
        return "Test";
    }
}

class T1 extends T2 {
    String print() {
        return "T1";
    }
}

class T2 {
    String print() {
        return "T2";
    }
}

