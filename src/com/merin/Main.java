package com.merin;

public class Main {

    public static void main(String[] args) {
	// write your code here
        float a = 10,b = 7;
                System.out.println("Hello World");
        Class1 object1 = new Class1();
        object1.method1("Merin");
        boolean result = object1.method2(args);
        if (result == true){
            System.out.println("Argument present");
        }
        else {
            System.out.println("No Argument present");
        }

        extClass math = new extClass();

        System.out.println("Sum of " + a + " + " + b + " is " + math.add(a,b));
        System.out.println("Multiply " + a + " by " + b + " is " + math.mull(b,a));

    }
}

class Class1 {
    void method1 (String s1){
        System.out.println("Hello " + s1 + ", Welcome !!");
    }

    boolean method2 (String[] args){
        boolean result = false;
        if (args.length > 0){
            return true;
        }

        return false;
    }

}
