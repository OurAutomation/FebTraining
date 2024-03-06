package org.staticMethods;

public class HowToCallMethodInsideAnotherMethod {
    public void printMyNameInRedColor(String name) {
        System.err.println(name);
    }

    public void printTheDetails(String name, int age) {
        printMyNameInRedColor(name);
        System.out.println(age);
    }

    public static void printSpace() {
        System.out.println(" ");
    }

    public static void printAllDetails(String name, int age, String email) {
        HowToCallMethodInsideAnotherMethod howToCallMethodInsideAnotherMethod = new HowToCallMethodInsideAnotherMethod();
        howToCallMethodInsideAnotherMethod.printTheDetails(name, age);
        System.out.println(email);
    }

    public static void main(String[] args) {
        /*HowToCallMethodInsideAnotherMethod howToCallMethodInsideAnotherMethod = new HowToCallMethodInsideAnotherMethod();
        howToCallMethodInsideAnotherMethod.printTheDetails("Name", 10);*/
//        HowToCallMethodInsideAnotherMethod.printSpace();
        printSpace();
        printAllDetails("name", 10, "abc@gmail.com");
    }

}
